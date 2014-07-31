package com.xjd2.sthjsystem.presenter;

import java.util.List;

import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.model.CommonOrderModel;
import com.xjd2.sthjsystem.orderview.CommonOrderTableComposite;
import com.xjd2.sthjsystem.orderview.CommonOrderTableViewInter;
import com.xjd2.sthjsystem.orderview.CommonProductOrderComposite;
import com.xjd2.sthjsystem.orderview.CommonProductOrderViewInter;

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
		//���ÿ���3�ṩ�Ĺ��Բ�Ʒ��ϸ��ѯ�ӿڣ���ȡXML��Ϣ��������ʾ��commonproductdetailtable��
		cpdetail = com.queryCommonProductDetails(id);
		cotComposite.setCommonProductDetailsTableContent(cpdetail);
	}

	@Override
	public void orderCommonProduct() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void queryCommonProduct() {
		//���ÿ���3�ṩ�Ĺ��Բ�Ʒ��ѯ�ӿڣ���ȡXML��Ϣ��������ʾ��commonproducttable��
		cps = com.queryCommonProduct();
		cotComposite.setCommonProductTableContent(cps);
	}

}
