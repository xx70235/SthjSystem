package com.xjd2.sthjsystem.instance;

import java.util.HashMap;

public class CommonProductNeeds
{

    String thematicProductName;
  
    HashMap<String, Boolean> cpNeeds;
    
    public String getThematicProductName()
    {
        return thematicProductName;
    }
    public void setThematicProductName(String thematicProductName)
    {
        this.thematicProductName = thematicProductName;
    }
    public HashMap<String, Boolean> getCpNeeds()
    {
        return cpNeeds;
    }
    public void setCpNeeds(HashMap<String, Boolean> cpNeeds)
    {
        this.cpNeeds = cpNeeds;
    }
}
