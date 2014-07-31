package com.xjd2.sthjsystem.instance;

import java.util.Date;

public class ThematicData
{
    String id;
    String name;
    String taskId;//关联的专题产品订单号
    String coverRange;
    Date produceDate;
    String spaceResolution;
    String timeResolution;
    String temporal;
    
    String path;
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getTaskId()
    {
        return taskId;
    }
    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }
    public String getCoverRange()
    {
        return coverRange;
    }
    public void setCoverRange(String coverRange)
    {
        this.coverRange = coverRange;
    }
    public Date getProduceDate()
    {
        return produceDate;
    }
    public void setProduceDate(Date produceDate)
    {
        this.produceDate = produceDate;
    }
    public String getSpaceResolution()
    {
        return spaceResolution;
    }
    public void setSpaceResolution(String spaceResolution)
    {
        this.spaceResolution = spaceResolution;
    }
    public String getTimeResolution()
    {
        return timeResolution;
    }
    public void setTimeResolution(String timeResolution)
    {
        this.timeResolution = timeResolution;
    }
    public String getTemporal()
    {
        return temporal;
    }
    public void setTemporal(String temporal)
    {
        this.temporal = temporal;
    }
}
