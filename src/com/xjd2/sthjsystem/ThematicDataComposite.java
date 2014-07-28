package com.xjd2.sthjsystem;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.VerticalLayout;

public class ThematicDataComposite extends CustomComponent implements ClickListener
{

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private Button queryButton;
	@AutoGenerated
	private PopupDateField endDateSelector;
	@AutoGenerated
	private PopupDateField startDateSelector;
	@AutoGenerated
//	private ComboBox productTypeCombox;
	private ListSelect productTypesSelect;
	private FormLayout fl;
	
	private ThematicOrderQueryViewInter presenter;
	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public ThematicDataComposite() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("300px");
		mainLayout.setHeight("500px");
		mainLayout.setMargin(false);

		// top-level component properties
		setWidth("300px");
		setHeight("500px");

		//formlayout create
		fl = new FormLayout();
		fl.setImmediate(false);
		fl.setWidth("100%");
		fl.setHeight("100%");
		fl.setMargin(true);
		mainLayout.addComponent(fl);
		
		productTypesSelect = new ListSelect();
		productTypesSelect.setCaption("产品类型：");
		productTypesSelect.addItem("专题产品1");
		productTypesSelect.addItem("专题产品2");
		productTypesSelect.addItem("专题产品3");
		productTypesSelect.addItem("专题产品4");
		productTypesSelect.addItem("专题产品5");
		productTypesSelect.addItem("专题产品111");
		productTypesSelect.addItem("专题产品12");
		productTypesSelect.addItem("专题产品13");
		productTypesSelect.addItem("专题产品14");
		productTypesSelect.addItem("专题产品51");
		productTypesSelect.addItem("专题产品16");
		productTypesSelect.addItem("专题产品17");
		productTypesSelect.addItem("专题产品18");
		productTypesSelect.addItem("专题产品19");
		productTypesSelect.addItem("专题产品121");
		productTypesSelect.addItem("专题产品123");
		productTypesSelect.addItem("专题产品134");
		productTypesSelect.addItem("专题产品125");
		
		productTypesSelect.setWidth("100%");
		productTypesSelect.setHeight("350px");
		fl.addComponent(productTypesSelect);

		// startDateSelector
		startDateSelector = new PopupDateField();
		startDateSelector.setCaption("开始时间：");
		startDateSelector.setImmediate(false);
		startDateSelector.setWidth("100.0%");
		startDateSelector.setHeight("-1px");
		fl.addComponent(startDateSelector);

		// endDateSelector
		endDateSelector = new PopupDateField();
		endDateSelector.setCaption("结束时间：");
		endDateSelector.setImmediate(false);
		endDateSelector.setWidth("100.0%");
		endDateSelector.setHeight("-1px");
		fl.addComponent(endDateSelector);

		// queryButton
		queryButton = new Button("查看产品",this);
		queryButton.setCaption("提交");
		queryButton.setImmediate(false);
		queryButton.setWidth("-1px");
		queryButton.setHeight("-1px");
		fl.addComponent(queryButton);
		fl.setComponentAlignment(queryButton, new Alignment(34));

		return mainLayout;
	}

    @Override
    public void buttonClick(ClickEvent event)
    {
        // TODO Auto-generated method stub
//       
        presenter.query();
    }
    
   
    public void setPresenter(ThematicOrderQueryViewInter listener)
    {
        // TODO Auto-generated method stub
//        listeners.add(listener);
       this.presenter = listener;
    }
    

}
