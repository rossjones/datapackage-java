package org.okfn.data.datapkg;

public class Source  implements IValidItem  {
    public String name = "";
    public String web = "";
    public String email = "";    

    public boolean IsValid() {
        return name != "";
    }        

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" Name: "  + this.name + "\n");
        buffer.append(" Email: " + this.email + "\n");
        buffer.append(" Web: "  + this.web + "\n");
        return buffer.toString();
    }    
}