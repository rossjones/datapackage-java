package org.okfn.data.datapkg;

public class Person implements IValidItem {
    public String name = "";
    public String email = "";    
    public String web = "";

    public boolean IsValid() {
        return this.name != "";
    }    

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" Name: "  + this.name + "\n");
        buffer.append(" Email: " + this.email + "\n");
        buffer.append(" Web: "  + this.web + "\n");
        return buffer.toString();
    }    
}
