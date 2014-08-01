package com.xjd2.sthjsystem.presenter;

import java.util.List;

import com.xjd2.sthjsystem.dataview.ThematicDataComposite;
import com.xjd2.sthjsystem.dataview.ThematicDataTableComposite;
import com.xjd2.sthjsystem.dataview.ThematicDataTableViewInter;
import com.xjd2.sthjsystem.dataview.ThematicDataViewInter;
import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.ThematicData;
import com.xjd2.sthjsystem.instance.ThematicOrder;
import com.xjd2.sthjsystem.model.ThematicDataQueryModel;
import com.xjd2.sthjsystem.model.ThematicOrderModel;
import com.xjd2.sthjsystem.orderview.ThematicOrderQueryComposite;
import com.xjd2.sthjsystem.orderview.ThematicOrderTableComposite;

public class ThematicDataPresenter implements ThematicDataViewInter,ThematicDataTableViewInter {

    
    private ThematicDataComposite toqView;
    private ThematicDataTableComposite tdtView;
    private ThematicDataQueryModel tdModel;
    private List<ThematicData> tdList;
    
    public ThematicDataPresenter(ThematicDataComposite tdView, ThematicDataTableComposite tdtView,ThematicDataQueryModel tdModel)
    {
        this.toqView = toqView;
        this.tdtView = tdtView;
        this.tdModel = tdModel;
    }

	@Override
	public void queryThematicData() {
	    tdList = tdModel.queryThematicData();
	    tdtView.setThematicDataTabelContent(tdList);
	}

    @Override
    public void shareThematicData(String taskId)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void displayData()
    {
        // TODO Auto-generated method stub
        
    }

}
