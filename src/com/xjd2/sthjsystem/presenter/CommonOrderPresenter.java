package com.xjd2.sthjsystem.presenter;

import java.util.List;

import com.xjd2.sthjsystem.CommonOrderTableComposite;
import com.xjd2.sthjsystem.CommonOrderTableViewInter;
import com.xjd2.sthjsystem.CommonProductOrderComposite;
import com.xjd2.sthjsystem.CommonProductOrderViewInter;
import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.model.CommonOrderModel;

public class CommonOrderPresenter implements CommonOrderTableViewInter, CommonProductOrderViewInter{
	CommonProductOrderComposite cpoComposite;
	CommonOrderTableComposite cotComposite;
	CommonOrderModel com;
	
	List<CommonProduct> cps;
	CommonProduct cpdetail;
	
	public CommonOrderPresenter(CommonProductOrderComposite cpoComposite, CommonOrderTableComposite cotComposite, CommonOrderModel com){
		this.cpoComposite = cpoComposite;
		this.cotComposite = cotComposite;
		this.com = com;
	}
	
	
	@Override
	public void queryCommonProductDetails(String id) {
		//调用课题3提供的共性产品详细查询接口，获取XML信息解析后显示在commonproductdetailtable中
		cpdetail = com.queryCommonProductDetails(id);
		cotComposite.setCommonProductDetailsTableContent(cpdetail);
	}

	@Override
	public void orderCommonProduct() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void queryCommonProduct() {
		//调用课题3提供的共性产品查询接口，获取XML信息解析后显示在commonproducttable中
		cps = com.queryCommonProduct();
		cotComposite.setCommonProductTableContent(cps);
	}

}
