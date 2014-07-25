package com.xjd2.sthjsystem.presenter;

import java.util.List;

import com.xjd2.sthjsystem.ThematicOrderQueryComposite;
import com.xjd2.sthjsystem.ThematicOrderQueryViewInter;
import com.xjd2.sthjsystem.ThematicOrderTableComposite;
import com.xjd2.sthjsystem.ThematicOrderTableViewInter;
import com.xjd2.sthjsystem.instance.ThematicOrder;
import com.xjd2.sthjsystem.model.ThematicOrderModel;

public class ThematicOrderPresenter implements ThematicOrderQueryViewInter,  ThematicOrderTableViewInter
{
    
    private ThematicOrderQueryComposite toqView;
    private ThematicOrderTableComposite totView;
    private ThematicOrderModel toModel;
    private List<ThematicOrder> toList;
    
    public ThematicOrderPresenter(ThematicOrderQueryComposite toqView, ThematicOrderTableComposite totView,ThematicOrderModel toModel)
    {
        this.toqView = toqView;
        this.totView = totView;
        this.toModel = toModel;
    }

    @Override
    public void setThematicTableContent()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public void setCommonTableContent()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<ThematicOrder> query()
    {
        // TODO Auto-generated method stub
        toList =  toModel.queryThematicOrder();
        return toList;
    }

}
