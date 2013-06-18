package org.okfn.data.datapkg;

public class Field  implements IValidItem 
{
    public String id = "";
    public String type = "";
    public String description = "";

    public boolean IsValid() {
        return id != "" && type != "";
    }        
}