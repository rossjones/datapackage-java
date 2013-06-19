package org.okfn.data.datapkg;

import java.util.ArrayList;

public class Resource  implements IValidItem {
    public String path = "";
    public String url = "";    
    public Schema schema = new Schema();

    public boolean IsValid() {
        return path != "" && url != "";
    }    

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" Path: "  + this.path + "\n");
        buffer.append(" Url: " + this.url + "\n");
        buffer.append(" Schema: "  + this.schema.toString() + "\n");
        return buffer.toString();
    }    
}
