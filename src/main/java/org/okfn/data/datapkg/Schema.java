package org.okfn.data.datapkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Schema  implements IValidItem  {
    public ArrayList<Field> fields = new ArrayList<Field>();

    /*  Schema is valid if the fields it contains are valid */
    public boolean IsValid() {
        for(Iterator<Field> i = this.fields.iterator(); i.hasNext(); ) {
            Field field = i.next();
            if ( ! field.IsValid() ) {
                return false;
            }
        }
        return true;
    }        

    public String toString()  {
        StringBuffer buffer = new StringBuffer();
        buffer.append(" Schema = \n");        
        buffer.append("  Fields = \n");
        for(Iterator<Field> i = this.fields.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }
        return buffer.toString();
    }
}