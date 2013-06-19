package org.okfn.data.datapkg;

public class Field  implements IValidItem 
{
    public String id = "";
    public String type = "";
    public String description = "";

    public boolean IsValid() {
        return id != "" && type != "";
    }    

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append("   Id: "  + this.id + "\n");
        buffer.append("   Type: " + this.type + "\n");
        buffer.append("   Description: "  + this.description + "\n");
        return buffer.toString();
    }    
}