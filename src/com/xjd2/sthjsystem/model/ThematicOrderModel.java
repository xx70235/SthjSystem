package com.xjd2.sthjsystem.model;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServlet;
import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.CommonProduct.ProductStatus;
import com.xjd2.sthjsystem.instance.CommonProductNeeds;
import com.xjd2.sthjsystem.instance.ThematicOrder;

public class ThematicOrderModel
{

    List<ThematicOrder> thematicOrders;
    List<CommonProduct> commonProductNeeds;
    public ThematicOrderModel()
    {
        
    }
    
    public  List<ThematicOrder> queryThematicOrder()
    {
        //使用测试数据order.xml，实际上采用web service获取的字符串流
//        String basepath = VaadinService.getCurrent()
//                          .getBaseDirectory().getAbsolutePath();
//        
        String path = "/WEB-INF/testData/order.xml"; //读取WEB-INF中的配置文件

        String realPath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
        System.out.println(realPath);
//.getRealPath(path);//getServletContext()相当于http://localhost/demo05

 //所以后面的path只需要以应用demo/开头具体的部署目录路径即可，如上面的/web-in…

        System.out.println(realPath);

        FileResource resource = new FileResource(new File(realPath +
                                "/WEB-INF/testData/Orders.xml"));
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
                Date orderT = null;
//                Date endT = null;
                for(Element orderNode: orderNotes)
                {
                    ThematicOrder to = new ThematicOrder();
                    to.setTaskId(((Element)orderNode).element("taskID").getStringValue());
                    to.setName(((Element)orderNode).element("name").getStringValue());
//                    to.setType(((Element)orderNode).element("type").getStringValue());
                    String tmp =((Element)orderNode).element("orderDate").getStringValue();
                    orderT=formatter.parse(tmp);
                    to.setOrderDate(orderT);
//                    tmp =((Element)orderNode).element("endDate").getStringValue();
//                    endT = formatter.parse(tmp);
                    to.setProductName(((Element)orderNode).element("productName").getStringValue());
                    to.setSource("运营服务系统");
                    to.setStatus("等待操作");
                    to.setRageScale(((Element)orderNode).element("rangeScale").getStringValue());
                    to.setRage(((Element)orderNode).element("range").getStringValue());
                    thematicOrders.add(to);
                }
            } catch (DocumentException e) {
                System.out.println(e.getMessage());
        }
            catch (ParseException e)
            {
                e.printStackTrace();
            }

    }
    
    public List<CommonProduct> getCommonProductInfo(String productName)
    {
        //执行专题产品所需数据表的查询，并查询本地共性产品数据库，调出当前数据状况
        
        //以下为测试数据
        commonProductNeeds = new ArrayList<CommonProduct>();
        if(productName.equals("景观破碎度"))
        {
//            CommonProductNeeds needs = new CommonProductNeeds();
//            needs.setThematicProductName(productName);
//            HashMap<String, Boolean> map = new HashMap<String, Boolean>();
//            map.put("土地覆盖", true);
//            map.put("", value)
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("土地覆盖度");
            comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try
            {
                comm1.setStartDate(formatter.parse("2013-06-01"));
                comm1.setEndDate(formatter.parse("2013-07-01"));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            comm1.setSpaceResolution("30m");
            comm1.setTimeResolution("");
            comm1.setNpStatus(ProductStatus.lack);
//            comm1.setPrecision(1.00);
            commonProductNeeds.add(comm1);
            
        }
        else if(productName.equals("景观分离度"))
        {
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("植被精细分类");
            comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try
            {
                comm1.setStartDate(formatter.parse("2013-06-01"));
                comm1.setEndDate(formatter.parse("2013-07-01"));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            comm1.setSpaceResolution("30m");
            comm1.setTimeResolution("");
            comm1.setNpStatus(ProductStatus.lack);
            commonProductNeeds.add(comm1);
        }
        else if(productName.equals("人类活动干扰强度"))
        {
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("降水量");
            comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try
            {
                comm1.setStartDate(formatter.parse("2013-06-01"));
                comm1.setEndDate(formatter.parse("2013-07-01"));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            comm1.setSpaceResolution("30m");
            comm1.setTimeResolution("");
            comm1.setNpStatus(ProductStatus.lack);
            commonProductNeeds.add(comm1);
            CommonProduct comm2 = new CommonProduct();
            comm2.setName("NDVI");
            comm2.setCoverRange("116.8396,37.0679,120.0916,40.4077");
            
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try
            {
                comm2.setStartDate(formatter.parse("2013-06-01"));
                comm2.setEndDate(formatter.parse("2013-07-01"));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            comm2.setSpaceResolution("30m");
            comm2.setTimeResolution("");
            comm2.setNpStatus(ProductStatus.lack);
            commonProductNeeds.add(comm2);
        }
        
        return commonProductNeeds;
       
    }
}
