package com.xjd2.sthjsystem;

import java.util.Date;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.xjd2.sthjsystem.instance.ThematicOrder;

public class ThematicOrderTableComposite extends CustomComponent
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
    private ThematicOrderTableViewInter presenter;
    /**
     * The constructor should first build the main layout, set the
     * composition root and then do any custom initialization.
     *
     * The constructor will not be automatically regenerated by the
     * visual editor.
     */
    public ThematicOrderTableComposite()
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
        
        abovePanel = new Panel("ר���Ʒ�������");
        abovePanel.setImmediate(false);
        abovePanel.setWidth("100.0%");
        abovePanel.setHeight("100.0%");
        verticalSplitPanel_1.addComponent(abovePanel);
        
        // themticOrderTable
        themticOrderTable = new Table("ר���Ʒ�������");
        themticOrderTable.setImmediate(false);
        themticOrderTable.setWidth("100.0%");
        themticOrderTable.setHeight("100.0%");
        abovePanel.setContent(themticOrderTable);
        generateThematicOrderTabel();
        
        belowPanel = new Panel("ר���Ʒ���蹲�Բ�Ʒ���");
        belowPanel.setImmediate(false);
        belowPanel.setWidth("100.0%");
        belowPanel.setHeight("100.0%");
        verticalSplitPanel_1.addComponent(belowPanel);
        
        // commonOrderTable
        commonInfoTable = new Table("ר���Ʒ���蹲�Բ�Ʒ���");
        commonInfoTable.setImmediate(false);
        commonInfoTable.setWidth("100.0%");
        commonInfoTable.setHeight("100.0%");
        belowPanel.setContent(commonInfoTable);
        generateCommonOrderTabel();
        
        return verticalSplitPanel_1;
    }
    
    private void generateThematicOrderTabel()
    {
        themticOrderTable.setCaption("ר���Ʒ�������");
        themticOrderTable.addContainerProperty("����ID",Integer.class,  null);
        themticOrderTable.addContainerProperty("������Դ",String.class,  null);
        themticOrderTable.addContainerProperty("��������",String.class,  null);
        themticOrderTable.addContainerProperty("����ʱ��",Date.class,  null);
        themticOrderTable.addContainerProperty("�ռ串�Ƿ�Χ",String.class,  null);
        themticOrderTable.addContainerProperty("����",String.class,  null);
        themticOrderTable.addContainerProperty("�Ƿ��������",Boolean.class,  null);
        themticOrderTable.addContainerProperty("����״̬",String.class,  null);
        themticOrderTable.addContainerProperty("����",String.class,  null);
    }
    
    private void generateCommonOrderTabel()
    {
        commonInfoTable.setCaption("ר���Ʒ���蹲�Բ�Ʒ���");
        commonInfoTable.addContainerProperty("ר���Ʒ����",Integer.class,  null);
        commonInfoTable.addContainerProperty("���蹲�Բ�Ʒ1",String.class,  null);
        commonInfoTable.addContainerProperty("���蹲�Բ�Ʒ2",String.class,  null);
        commonInfoTable.addContainerProperty("���蹲�Բ�Ʒ3",Date.class,  null);
        commonInfoTable.addContainerProperty("���蹲�Բ�Ʒ4",String.class,  null);
        commonInfoTable.addContainerProperty("����",String.class,  null);
    }
    
    public void setPresenter(ThematicOrderTableViewInter listener)
    {
       this.presenter = listener;
    }
    
    private void setThematicOrderTabelContent(List<ThematicOrder> orders)
    {
        themticOrderTable.removeAllItems();
        for(ThematicOrder order:orders)
        {
        BeanItem<ThematicOrder> orderitem = new BeanItem<ThematicOrder>(order);
        }
    }


}