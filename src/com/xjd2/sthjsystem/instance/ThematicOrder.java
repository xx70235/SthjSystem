package com.xjd2.sthjsystem.instance;

import java.io.Serializable;
import java.util.Date;

public class ThematicOrder implements Serializable
{

    String taskId;
    String source;

    String name;
    String productName;


    //    String type;
    Date orderDate;
//    Date endDate;
    String range;
    String rangeScale;
    String status;

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getRange()
    {
        return range;
    }

    public void setRage(String range)
    {
        this.range = range;
    }

    public String getRangeScale()
    {
        return rangeScale;
    }

    public void setRageScale(String rangeScale)
    {
        this.rangeScale = rangeScale;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String generateTaskId()
    {
        // TODO: generate task id
        return "testID";
    }
    
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public Date getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Date orderDate)
    {
        this.orderDate = orderDate;
    }

}
