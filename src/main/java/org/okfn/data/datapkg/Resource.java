package org.okfn.data.datapkg;

import java.util.ArrayList;

public class Resource  implements IValidItem {
    public String path = "";
    public String url = "";    
    public ArrayList<Schema> schema = new ArrayList<Schema>();

    public boolean IsValid() {
        return true;
    }    
}
