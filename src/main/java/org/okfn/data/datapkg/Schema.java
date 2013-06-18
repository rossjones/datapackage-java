package org.okfn.data.datapkg;

import java.util.ArrayList;

public class Schema  implements IValidItem  {
    public ArrayList<Field> fields = new ArrayList<Field>();

    public boolean IsValid() {
        return true;
    }        
}