package com.xjd2.sthjsystem.model;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.xjd2.sthjsystem.instance.ThematicOrder;

public class ThematicOrderModel
{

    List<ThematicOrder> thematicOrders;
    public ThematicOrderModel()
    {
        
    }
    
    public  List<ThematicOrder> queryThematicOrder()
    {
        //使用测试数据order.xml，实际上采用web service获取的字符串流
        String basepath = VaadinService.getCurrent()
                          .getBaseDirectory().getAbsolutePath();

        FileResource resource = new FileResource(new File(basepath +
                                "/WEB-INF/testData/order.xml"));
        File orderFile = resource.getSourceFile();
        
        resolveOrderXml(orderFile);
        return thematicOrders;
    }
    
    /***
     * 解析获取的订单xml，本方法解析的是测试文件。
     * @param orderFile
     */
    private void resolveOrderXml(File orderFile)
    {
//            File inputXml = new File(fileName);
            SAXReader saxReader = new SAXReader();
            thematicOrders = new ArrayList<ThematicOrder>();
            try {
                Document document = saxReader.read(orderFile);
                Element rootElt = document.getRootElement();
                List<Element> orderNotes = rootElt.element("responseParam").elements("production");
                
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date startT = null;
                Date endT = null;
                for(Element orderNode: orderNotes)
                {
                    ThematicOrder to = new ThematicOrder();
                    to.setTaskId(((Element)orderNode).element("taskID").getStringValue());
                    to.setName(((Element)orderNode).element("name").getStringValue());
                    to.setType(((Element)orderNode).element("type").getStringValue());
                    String tmp =((Element)orderNode).element("startDate").getStringValue();
                    startT=formatter.parse(tmp);
                    tmp =((Element)orderNode).element("endDate").getStringValue();
                    endT = formatter.parse(tmp);
                    to.setStartDate(startT);
                    to.setEndDate(endT);
                    to.setRageScale(((Element)orderNode).element("rangeScale").getStringValue());
                    to.setRage(((Element)orderNode).element("range").getStringValue());
                    thematicOrders.add(to);
                }
            } catch (DocumentException e) {
                System.out.println(e.getMessage());
        }
            catch (ParseException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }
}
