package com.xjd2.sthjsystem.dataview;

import java.util.Date;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.xjd2.sthjsystem.instance.CommonProduct;
import com.xjd2.sthjsystem.instance.CommonProduct.ProductStatus;
import com.xjd2.sthjsystem.instance.ThematicOrder;

public class ThematicDataTableComposite extends CustomComponent
{

    /*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

    @AutoGenerated
    private VerticalLayout mainLayout;
    @AutoGenerated
    private VerticalSplitPanel verticalSplitPanel_1;
    @AutoGenerated
    private Table commonInfoTable;
    @AutoGenerated
    private Table themticOrderTable;
    private Panel abovePanel;
    private Panel belowPanel;
    private ThematicDataTableViewInter presenter;
    /**
     * The constructor should first build the main layout, set the
     * composition root and then do any custom initialization.
     *
     * The constructor will not be automatically regenerated by the
     * visual editor.
     */
    public ThematicDataTableComposite()
    {
        buildMainLayout();
        setCompositionRoot(mainLayout);

        // TODO add user code here
    }

    @AutoGenerated
    private VerticalLayout buildMainLayout()
    {
        // common part: create layout
        mainLayout = new VerticalLayout();
        mainLayout.setImmediate(false);
        mainLayout.setWidth("100%");
        mainLayout.setHeight("100%");
        mainLayout.setMargin(false);
        
        // top-level component properties
        setWidth("100.0%");
        setHeight("100.0%");
        
        // verticalSplitPanel_1
        verticalSplitPanel_1 = buildVerticalSplitPanel_1();
        verticalSplitPanel_1.setSplitPosition(70, Sizeable.UNITS_PERCENTAGE);
        mainLayout.addComponent(verticalSplitPanel_1);
        mainLayout.setExpandRatio(verticalSplitPanel_1, 1.0f);
        
        return mainLayout;
    }

    @AutoGenerated
    private VerticalSplitPanel buildVerticalSplitPanel_1()
    {
        // common part: create layout
        verticalSplitPanel_1 = new VerticalSplitPanel();
        verticalSplitPanel_1.setImmediate(false);
        verticalSplitPanel_1.setWidth("100.0%");
        verticalSplitPanel_1.setHeight("100.0%");
        
        abovePanel = new Panel("专题产品数据信息");
        abovePanel.setImmediate(false);
        abovePanel.setWidth("100.0%");
        abovePanel.setHeight("100.0%");
        verticalSplitPanel_1.addComponent(abovePanel);
        
        // themticOrderTable
        themticOrderTable = new Table("专题产品数据信息");
        themticOrderTable.setImmediate(false);
        themticOrderTable.setWidth("100.0%");
        themticOrderTable.setHeight("100.0%");
        abovePanel.setContent(themticOrderTable);
        generateThematicOrderTabel();
        
        belowPanel = new Panel("数据预览");
        belowPanel.setImmediate(false);
        belowPanel.setWidth("100.0%");
        belowPanel.setHeight("100.0%");
        verticalSplitPanel_1.addComponent(belowPanel);
        
        // commonOrderTable
//        commonInfoTable = new Table("专题产品所需共性产品情况");
//        commonInfoTable.setImmediate(false);
//        commonInfoTable.setWidth("100.0%");
//        commonInfoTable.setHeight("100.0%");
//        belowPanel.setContent(commonInfoTable);
//        generateCommonOrderTabel();
//        
        return verticalSplitPanel_1;
    }
    
    private void generateThematicOrderTabel()
    {
        themticOrderTable.setCaption("专题产品订单情况");
        themticOrderTable.setSelectable(true);
        themticOrderTable.setImmediate(true);
        themticOrderTable.addContainerProperty("taskId",String.class,  null);
        themticOrderTable.addContainerProperty("source",String.class,  null);
        themticOrderTable.addContainerProperty("name",String.class,  null);
        themticOrderTable.addContainerProperty("productName",String.class,  null);
        themticOrderTable.addContainerProperty("orderDate",Date.class,  null);
        themticOrderTable.addContainerProperty("range",String.class,  null);
        themticOrderTable.addContainerProperty("rangeScale",String.class,  null);
        themticOrderTable.addContainerProperty("status",String.class,  null);
        themticOrderTable.addContainerProperty("operation",OptionGroup.class,  null);
        
        themticOrderTable.setColumnHeader("taskId", "关联订单ID");
        themticOrderTable.setColumnHeader("source", "订单来源");
        themticOrderTable.setColumnHeader("name", "订单名称");
        themticOrderTable.setColumnHeader("productName", "专题产品名称");
        themticOrderTable.setColumnHeader("orderDate", "订单时间");
//        themticOrderTable.setColumnHeader("endDate", "结束时间");
        themticOrderTable.setColumnHeader("range", "空间覆盖范围");
        themticOrderTable.setColumnHeader("rangeScale", "区域");
        themticOrderTable.setColumnHeader("status", "生产状态");
        themticOrderTable.setColumnHeader("operation", "操作");
        
        themticOrderTable.addValueChangeListener(new Property.ValueChangeListener() {
            public void valueChange(ValueChangeEvent event) {
                presenter.displayData();
//                ((String)themticOrderTable.getItem(themticOrderTable.getValue()).getItemProperty("productName").getValue());
            }
        });
        
    }
    
    private void generateDataDisplayPanel()
    {
//        commonInfoTable.setSelectable(true);
//        commonInfoTable.setImmediate(true);
//        commonInfoTable.setCaption("专题产品所需共性产品情况");
//        commonInfoTable.addContainerProperty("name",String.class,  null);
//        commonInfoTable.addContainerProperty("startDate",Date.class,  null);
//        commonInfoTable.addContainerProperty("endDate",Date.class,  null);
//        commonInfoTable.addContainerProperty("coverRange",String.class,  null);
//        commonInfoTable.addContainerProperty("timeResolution",String.class,  null);
//        commonInfoTable.addContainerProperty("spaceResolution",String.class,  null);
//        commonInfoTable.addContainerProperty("precision",String.class,  null);
//        commonInfoTable.addContainerProperty("npStatus",ProductStatus.class,  null);
//        commonInfoTable.addContainerProperty("option",Button.class,  null);
//        
//        commonInfoTable.setColumnHeader("name", "共性产品名称");
//        commonInfoTable.setColumnHeader("startDate", "开始时间");
//        commonInfoTable.setColumnHeader("endDate", "结束时间");
//        commonInfoTable.setColumnHeader("coverRange", "覆盖范围");
//        commonInfoTable.setColumnHeader("timeResolution", "时间分辨率");
//        commonInfoTable.setColumnHeader("spaceResolution", "空间分辨率");
//        commonInfoTable.setColumnHeader("precision", "产品精度");
//        commonInfoTable.setColumnHeader("npStatus", "产品状态");
//        commonInfoTable.setColumnHeader("option", "操作");
    }
    
    public void setPresenter(ThematicDataTableViewInter listener)
    {
       this.presenter = listener;
    }
    
    public void setThematicOrderTabelContent(List<ThematicOrder> orders)
    {
        themticOrderTable.removeAllItems(); 
//        BeanContainer<String,ThematicOrder> beanC = new BeanContainer<String,ThematicOrder>(ThematicOrder.class);
//        beanC.setBeanIdProperty("taskId");
//        ComboBox operationComboBox;
        OptionGroup group;
        for(ThematicOrder order:orders)
        {
//            beanC.addBean(order);
            group = new OptionGroup();
            group.addItem("接受生产");
            group.addItem("拒绝生产");
            group.setImmediate(true);
            themticOrderTable.addItem(new Object[] {order.getTaskId(),order.getSource(),order.getName(),
                    order.getProductName(),order.getOrderDate(),order.getRange(),order.getRangeScale(),order.getStatus(),group}, order.getTaskId());
            
        }
    }
    
    public void setCommonInfoTableContent(List<CommonProduct> needs)
    {
        commonInfoTable.removeAllItems();
        Button operateButton;
        for(CommonProduct need:needs)
        {
//            beanC.addBean(order);
            operateButton = new Button("订购");
            commonInfoTable.addItem(new Object[] {need.getName(),need.getStartDate(),need.getEndDate(),need.getCoverRange(),need.getTimeResolution(),
                    need.getSpaceResolution()," ",need.getNpStatus(),operateButton},need.getName());
            
        }
    }


}
