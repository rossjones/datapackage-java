package org.okfn.data.datapkg;

public class People implements IValidItem {
    public String name = "";
    public String email = "";    
    public String web = "";

    public boolean IsValid() {
        return true;
    }    
}
