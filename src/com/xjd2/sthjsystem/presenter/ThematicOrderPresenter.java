package com.xjd2.sthjsystem.presenter;

import java.util.List;

import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.ThematicOrder;
import com.xjd2.sthjsystem.model.ThematicOrderModel;
import com.xjd2.sthjsystem.orderview.ThematicOrderQueryComposite;
import com.xjd2.sthjsystem.orderview.ThematicOrderQueryViewInter;
import com.xjd2.sthjsystem.orderview.ThematicOrderTableComposite;
import com.xjd2.sthjsystem.orderview.ThematicOrderTableViewInter;

public class ThematicOrderPresenter implements ThematicOrderQueryViewInter,  ThematicOrderTableViewInter
{
    
    private ThematicOrderQueryComposite toqView;
    private ThematicOrderTableComposite totView;
    private ThematicOrderModel toModel;
    private List<ThematicOrder> toList;
    private List<CommonProduct> cpList;
    
    public ThematicOrderPresenter(ThematicOrderQueryComposite toqView, ThematicOrderTableComposite totView,ThematicOrderModel toModel)
    {
        this.toqView = toqView;
        this.totView = totView;
        this.toModel = toModel;
    }


    @Override
    public List<ThematicOrder> query()
    {
        // TODO Auto-generated method stub
        toList =  toModel.queryThematicOrder();
        totView.setThematicOrderTabelContent(toList);
        return toList;
    }


    @Override
    public void showCommonProductInfo(String productName)
    {
        // TODO Auto-generated method stub
//        System.out.println(productName);
        cpList =  toModel.getCommonProductInfo(productName);
        totView.setCommonInfoTableContent(cpList);
    }


    @Override
    public void OperateThematicOrder()
    {
        // TODO Auto-generated method stub
        
    }

}
