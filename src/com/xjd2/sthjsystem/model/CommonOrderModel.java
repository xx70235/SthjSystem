package com.xjd2.sthjsystem.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.CommonProduct.ProductStatus;

public class CommonOrderModel {

	List<CommonProduct> cps;

	public List<CommonProduct> queryCommonProduct() {
		cps = new ArrayList<CommonProduct>();

		CommonProduct comm1 = new CommonProduct();
		comm1.setId("TD87384911");
		comm1.setName("土地覆盖度");
		comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			comm1.setProductDate(formatter.parse("2014-06-01"));
			comm1.setStartDate(formatter.parse("2013-06-01"));
			comm1.setEndDate(formatter.parse("2013-07-01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cps.add(comm1);

		CommonProduct comm2 = new CommonProduct();
		comm2.setId("TD87384912");
		comm2.setName("土地覆盖度");
		comm2.setCoverRange("116.8396,37.0679,120.0916,40.4077");

		try {
			comm2.setProductDate(formatter.parse("2014-06-08"));
			comm2.setStartDate(formatter.parse("2013-06-01"));
			comm2.setEndDate(formatter.parse("2013-07-01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cps.add(comm2);

		CommonProduct comm3 = new CommonProduct();
		comm3.setId("TD87384913");
		comm3.setName("土地覆盖度");
		comm3.setCoverRange("116.8396,37.0679,120.0916,40.4077");

		try {
			comm3.setProductDate(formatter.parse("2014-06-21"));
			comm3.setStartDate(formatter.parse("2013-06-01"));
			comm3.setEndDate(formatter.parse("2013-07-01"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cps.add(comm3);

		return cps;
	}
	
	/***
	 * 
	 * @param id
	 * @return
	 */
	public CommonProduct  queryCommonProductDetails(String id) {
		
		
		CommonProduct comm1 = new CommonProduct();
		if(id.equals("TD87384911"))
		{
			comm1 = new CommonProduct();
			comm1.setId("TD87384911");
			comm1.setName("土地覆盖度");
			comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			try {
				comm1.setProductDate(formatter.parse("2014-06-01"));
				comm1.setStartDate(formatter.parse("2013-06-01"));
				comm1.setEndDate(formatter.parse("2013-07-01"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			comm1.setPrecision(0.8f);
			comm1.setSpaceResolution("1km");
			comm1.setTimeResolution("5年");
			comm1.setNpStatus(ProductStatus.Available);
			
		}
		else if(id.equals("TD87384912"))
		{
			comm1.setId("TD87384912");
			comm1.setName("土地覆盖度");
			comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			try {
				comm1.setProductDate(formatter.parse("2014-06-01"));
				comm1.setStartDate(formatter.parse("2013-06-01"));
				comm1.setEndDate(formatter.parse("2013-07-01"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			comm1.setPrecision(0.8f);
			comm1.setSpaceResolution("1km");
			comm1.setTimeResolution("5年");
			comm1.setNpStatus(ProductStatus.Available);
		}
		else if(id.equals("TD87384913"))
		{
			
			comm1.setId("TD87384913");
			comm1.setName("土地覆盖度");
			comm1.setCoverRange("116.8396,37.0679,120.0916,40.4077");

			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			try {
				comm1.setProductDate(formatter.parse("2014-06-01"));
				comm1.setStartDate(formatter.parse("2013-06-01"));
				comm1.setEndDate(formatter.parse("2013-07-01"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			comm1.setPrecision(0.8f);
			comm1.setSpaceResolution("1km");
			comm1.setTimeResolution("5年");
			comm1.setNpStatus(ProductStatus.Available);
		}

		return comm1;
	}
}
