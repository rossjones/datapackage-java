package org.okfn.data.datapkg;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * DataPackage is a POJO that is filled in with data either directly
 * to create a new .json file, or from a DataPackageReader which will
 * load a remote datapackage ready for use.
 */
public class DataPackage implements IValidItem 
{
    public String id = "";     
    public String name = "";
    public String title = "";    
    public String description = "";
    public ArrayList<String> keywords = new ArrayList<String>();
    public String last_updated = "";
    public ArrayList<License> licenses = new ArrayList<License>();
    public ArrayList<Source> sources = new ArrayList<Source>();    
    public ArrayList<Resource> resources = new ArrayList<Resource>();        

    public ArrayList<People> maintainers = new ArrayList<People>();
    public ArrayList<People> contributors = new ArrayList<People>();    
    public ArrayList<People> publisher = new ArrayList<People>();        

    public String readme = "";
    public String readme_html = "";
    public String version = "";
    public String download_url = "";

    public boolean IsValid() {
        // Iterate over the lists and check they claim to be valid. Don't do it like
        // this, use a list of types to check....
        for(Iterator<License> i = this.licenses.iterator(); i.hasNext(); ) {        
            License license = i.next();
            if ( ! license.IsValid() ) {
                return false;
            }
        }


        return true;
    }    
}
