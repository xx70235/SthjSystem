package com.xjd2.sthjsystem.dataview;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Image;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.SelectedTabChangeEvent;
import com.vaadin.ui.TabSheet.SelectedTabChangeListener;
import com.vaadin.ui.VerticalLayout;
import com.xjd2.sthjsystem.model.CommonOrderModel;
import com.xjd2.sthjsystem.model.ThematicDataQueryModel;
import com.xjd2.sthjsystem.model.ThematicOrderModel;
import com.xjd2.sthjsystem.orderview.CommonOrderTableComposite;
import com.xjd2.sthjsystem.orderview.CommonProductOrderComposite;
import com.xjd2.sthjsystem.orderview.ThematicOrderTableComposite;
import com.xjd2.sthjsystem.presenter.CommonOrderPresenter;
import com.xjd2.sthjsystem.presenter.ThematicDataPresenter;
import com.xjd2.sthjsystem.presenter.ThematicOrderPresenter;

public class DataComposite extends CustomComponent
{

    /*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

    @AutoGenerated
    private VerticalLayout mainLayout;
    @AutoGenerated
    private HorizontalSplitPanel horizontalSplitPanel_1;
    @AutoGenerated
    private Panel rightPanel;
    @AutoGenerated
    private VerticalLayout verticalLayout_3;
    @AutoGenerated
    private Panel leftPanel;
    @AutoGenerated
    private VerticalLayout verticalLayout_2;
    @AutoGenerated
    private Accordion leftAccordion;
    private ThematicDataComposite tdComposite;
    private CommonDataComposite cdComposite;
//    private CommonProductOrderComposite cpoComposite;
    private ThematicDataTableComposite tdtComposite;
    private CommonOrderTableComposite cotComposite;
    private ThematicDataPresenter tdPresenter;
    private ThematicDataQueryModel tdModel;
    private CommonOrderPresenter coPresenter;
    private CommonOrderModel coModel;

    private static String accordionCaption1 = "����ר���Ʒ��ѯ";
    private static String accordionCaption2 = "���ع��Բ�Ʒ��ѯ";
    private static String accordionCaption3 = "�������ݹ���";
    private static String accordionCaption4 = "����������Ϣ���ݹ���";

    /**
     * The constructor should first build the main layout, set the
     * composition root and then do any custom initialization.
     *
     * The constructor will not be automatically regenerated by the
     * visual editor.
     */
    public DataComposite()
    {
        buildMainLayout();
        setCompositionRoot(mainLayout);
         tdModel = new ThematicDataQueryModel();
        // coModel = new CommonOrderModel();
//         mvpģʽ
         tdPresenter = new ThematicDataPresenter(tdComposite,tdtComposite,tdModel);
         tdComposite.setPresenter(tdPresenter);
         tdtComposite.setPresenter(tdPresenter);
        //
        // coPresenter = new
        // CommonOrderPresenter(cpoComposite,cotComposite,coModel);
        // cpoComposite.setPresenter(coPresenter);
        // cotComposite.setPresenter(coPresenter);
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

        // horizontalSplitPanel_1
        horizontalSplitPanel_1 = buildHorizontalSplitPanel_1();
        horizontalSplitPanel_1.setSplitPosition(25, Sizeable.UNITS_PERCENTAGE);
        mainLayout.addComponent(horizontalSplitPanel_1);
        mainLayout.setExpandRatio(horizontalSplitPanel_1, 1.0f);

        return mainLayout;
    }

    @AutoGenerated
    private HorizontalSplitPanel buildHorizontalSplitPanel_1()
    {
        // common part: create layout
        horizontalSplitPanel_1 = new HorizontalSplitPanel();
        horizontalSplitPanel_1.setImmediate(false);
        horizontalSplitPanel_1.setWidth("100.0%");
        horizontalSplitPanel_1.setHeight("100.0%");

        // leftPanel
        leftPanel = buildLeftPanel();
        horizontalSplitPanel_1.addComponent(leftPanel);

        // rightPanel
        rightPanel = buildRightPanel();
        horizontalSplitPanel_1.addComponent(rightPanel);

        return horizontalSplitPanel_1;
    }

    @AutoGenerated
    private Panel buildLeftPanel()
    {
        // common part: create layout
        leftPanel = new Panel();
        leftPanel.setImmediate(false);
        leftPanel.setWidth("100.0%");
        leftPanel.setHeight("100.0%");

        // verticalLayout_2
        verticalLayout_2 = buildVerticalLayout_2();
        leftPanel.setContent(verticalLayout_2);

        return leftPanel;
    }

    @AutoGenerated
    private VerticalLayout buildVerticalLayout_2()
    {
        // common part: create layout
        verticalLayout_2 = new VerticalLayout();
        verticalLayout_2.setImmediate(false);
        verticalLayout_2.setWidth("100.0%");
        verticalLayout_2.setHeight("100.0%");
        verticalLayout_2.setMargin(false);

        // leftAccordion
        leftAccordion = new Accordion();
        leftAccordion.setImmediate(false);
        leftAccordion.setWidth("100.0%");
        leftAccordion.setHeight("100.0%");
        verticalLayout_2.addComponent(leftAccordion);
        verticalLayout_2.setExpandRatio(leftAccordion, 1.0f);
        // ��ʼ��Accordion
        initAccordion();
        leftAccordion.addSelectedTabChangeListener(new SelectedTabChangeListener() {
            public void selectedTabChange(SelectedTabChangeEvent event)
            {
                // Find the tabsheet
                TabSheet tabsheet = event.getTabSheet();

                // Find the tab (here we know it's a layout)
                CustomComponent tab = (CustomComponent) tabsheet.getSelectedTab();

                // Get the tab caption from the tab object
                String caption = tabsheet.getTab(tab).getCaption();

                for (int i = 0; i < verticalLayout_3.getComponentCount(); i++)
                {
                    verticalLayout_3.getComponent(i).setVisible(false);
                }

                if (caption.equals(accordionCaption1))
                {
                    if (tdtComposite != null)
                    {
                        tdtComposite.setVisible(true);
                    }
                    // else
                    // {
                    // totComposite = new ThematicOrderTableComposite();
                    // totComposite.setImmediate(false);
                    // totComposite.setWidth("100.0%");
                    // totComposite.setHeight("100.0%");
                    // verticalLayout_3.addComponent(totComposite);
                    // totComposite.setVisible(true);
                    // }
                }
                else if (caption.equals(accordionCaption2))
                {
                    if (tdtComposite != null)
                    {
                        tdtComposite.setVisible(true);
                    }
                    // else
                    // {
                    // totComposite = new ThematicOrderTableComposite();
                    // totComposite.setImmediate(false);
                    // totComposite.setWidth("100.0%");
                    // totComposite.setHeight("100.0%");
                    // verticalLayout_3.addComponent(totComposite);
                    // totComposite.setVisible(true);
                    // }
                }
                else if (caption.equals(accordionCaption3))
                {
                    if (cotComposite != null)
                    {
                        cotComposite.setVisible(true);
                    }
                    // else
                    // {
                    // cotComposite = new CommonOrderTableComposite();
                    // cotComposite.setImmediate(false);
                    // cotComposite.setWidth("100.0%");
                    // cotComposite.setHeight("100.0%");
                    // verticalLayout_3.addComponent(cotComposite);
                    // cotComposite.setVisible(true);
                    // }
                }
            }
        });

        return verticalLayout_2;
    }

    @AutoGenerated
    private Panel buildRightPanel()
    {
        // common part: create layout
        rightPanel = new Panel();
        rightPanel.setImmediate(false);
        rightPanel.setWidth("100.0%");
        rightPanel.setHeight("100.0%");

        // verticalLayout_3
        verticalLayout_3 = new VerticalLayout();
        verticalLayout_3.setImmediate(false);
        verticalLayout_3.setWidth("100.0%");
        verticalLayout_3.setHeight("100.0%");
        verticalLayout_3.setMargin(true);
        rightPanel.setContent(verticalLayout_3);

        // Themtaic Order Table
        tdtComposite = new ThematicDataTableComposite();
        tdtComposite.setImmediate(false);
        tdtComposite.setWidth("100.0%");
        tdtComposite.setHeight("100.0%");
        verticalLayout_3.addComponent(tdtComposite);

        cotComposite = new CommonOrderTableComposite();
        cotComposite.setImmediate(false);
        cotComposite.setWidth("100.0%");
        cotComposite.setHeight("100.0%");
        verticalLayout_3.addComponent(cotComposite);
        cotComposite.setVisible(false);

        return rightPanel;
    }

    private void initAccordion()
    {
        tdComposite = new ThematicDataComposite();
        cdComposite = new CommonDataComposite();
        // cpoComposite = new CommonProductOrderComposite();

        // ����icon
        leftAccordion.addTab(tdComposite, accordionCaption1, null);
        leftAccordion.addTab(cdComposite, accordionCaption2, null);

        HorizontalLayout tab3 = new HorizontalLayout();
        leftAccordion.addTab(tab3, accordionCaption3, null);

        HorizontalLayout tab4 = new HorizontalLayout();
        leftAccordion.addTab(tab4, accordionCaption4, null);
        // leftAccordion.addTab(ltiComposite,accordionCaption2, null);
        // leftAccordion.addTab(cpoComposite, accordionCaption3, null);
    }

}