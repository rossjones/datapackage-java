package org.okfn.data.datapkg;

public class License  implements IValidItem 
{
    public String id = "";
    public String url = "";

    public boolean IsValid() {
        return true;
    }        
}