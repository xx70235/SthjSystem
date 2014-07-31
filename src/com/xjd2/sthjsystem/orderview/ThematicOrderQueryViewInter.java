package com.xjd2.sthjsystem.orderview;

import java.util.List;

import com.xjd2.sthjsystem.instance.ThematicOrder;

public interface ThematicOrderQueryViewInter
{
//    interface ThematicOrderQueryViewInterListener {
//        void query(String );
//    }
//    public void addListener(ThematicOrderQueryViewInterListener listener);
    
    List<ThematicOrder> query();
}
