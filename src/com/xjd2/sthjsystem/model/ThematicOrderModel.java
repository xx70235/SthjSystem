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
        //ʹ�ò�������order.xml��ʵ���ϲ���web service��ȡ���ַ�����
//        String basepath = VaadinService.getCurrent()
//                          .getBaseDirectory().getAbsolutePath();
//        
        String path = "/WEB-INF/testData/order.xml"; //��ȡWEB-INF�е������ļ�

        String realPath = VaadinService.getCurrent()
                .getBaseDirectory().getAbsolutePath();
        System.out.println(realPath);
//.getRealPath(path);//getServletContext()�൱��http://localhost/demo05

 //���Ժ����pathֻ��Ҫ��Ӧ��demo/��ͷ����Ĳ���Ŀ¼·�����ɣ��������/web-in��

        System.out.println(realPath);

        FileResource resource = new FileResource(new File(realPath +
                                "/WEB-INF/testData/Orders.xml"));
        File orderFile = resource.getSourceFile();
        
        resolveOrderXml(orderFile);
        return thematicOrders;
    }
    
    /***
     * ������ȡ�Ķ���xml���������������ǲ����ļ���
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
                    to.setSource("��Ӫ����ϵͳ");
                    to.setStatus("�ȴ�����");
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
        //ִ��ר���Ʒ�������ݱ�Ĳ�ѯ������ѯ���ع��Բ�Ʒ���ݿ⣬������ǰ����״��
        
        //����Ϊ��������
        commonProductNeeds = new ArrayList<CommonProduct>();
        if(productName.equals("���������"))
        {
//            CommonProductNeeds needs = new CommonProductNeeds();
//            needs.setThematicProductName(productName);
//            HashMap<String, Boolean> map = new HashMap<String, Boolean>();
//            map.put("���ظ���", true);
//            map.put("", value)
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("���ظ��Ƕ�");
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
        else if(productName.equals("���۷����"))
        {
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("ֲ����ϸ����");
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
        else if(productName.equals("��������ǿ��"))
        {
            CommonProduct comm1 = new CommonProduct();
            comm1.setName("��ˮ��");
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
