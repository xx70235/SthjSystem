package com.xjd2.sthjsystem.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.ThematicData;

public class ThematicDataQueryModel {
    List<ThematicData> thematicData;
    
    public List<ThematicData> queryThematicData()
    {
        thematicData = new ArrayList<ThematicData>();
        //TODO:询本地数据库，得到数据信息
        ThematicData td1 = new ThematicData();
        td1 .setId("TD87384911");
        td1 .setName("生态系统类型面积变化率");
        td1 .setCoverRange("116.8396,37.0679,120.0916,40.4077");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            td1 .setProduceDate(formatter.parse("2014-06-01"));
//            comm1.setStartDate(formatter.parse("2013-06-01"));
//            comm1.setEndDate(formatter.parse("2013-07-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        td1.setSpaceResolution("1km");
        td1.setTimeResolution("5年");
        td1.setTemporal("2013");
        thematicData.add(td1);
        
        ThematicData td2 = new ThematicData();
        td2.setId("TD87384912");
        td2.setName("景观破碎度");
        td2.setCoverRange("116.8396,37.0679,120.0916,40.4077");

//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            td2 .setProduceDate(formatter.parse("2014-07-01"));
//            comm1.setStartDate(formatter.parse("2013-06-01"));
//            comm1.setEndDate(formatter.parse("2013-07-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        td2.setSpaceResolution("1km");
        td2.setTimeResolution("5年");
        td2.setTemporal("2013");
        thematicData.add(td2);
        
        ThematicData td3 = new ThematicData();
        td3.setId("TD87384913");
        td3.setName("景观分离度");
        td3.setCoverRange("116.8396,37.0679,120.0916,40.4077");

//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            td3 .setProduceDate(formatter.parse("2014-08-01"));
//            comm1.setStartDate(formatter.parse("2013-06-01"));
//            comm1.setEndDate(formatter.parse("2013-07-01"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        td3.setSpaceResolution("1km");
        td3.setTimeResolution("5年");
        td3.setTemporal("2013");
        thematicData.add(td3);

        return thematicData;
       
    }

}
