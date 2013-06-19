package org.okfn.data.datapkg;

public class License  implements IValidItem 
{
    public String id = "";
    public String url = "";

    public boolean IsValid() {
        return url != "";
    }        

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" Id: "  + this.id + "\n");
        buffer.append(" Url: "  + this.url + "\n");        
        return buffer.toString();
    }    
}