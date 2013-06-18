package org.okfn.data.datapkg;

import java.util.ArrayList;

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
        return true;
    }    
}
