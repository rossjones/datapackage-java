package org.okfn.data.datapkg;

public class Source  implements IValidItem  {
    public String name = "";
    public String web = "";
    public String email = "";    

    public boolean IsValid() {
        return true;
    }        
}