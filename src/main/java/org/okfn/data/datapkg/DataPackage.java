package org.okfn.data.datapkg;

import org.apache.commons.csv.CSVParser;

import java.util.List;
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
    public List<License> licenses = new ArrayList<License>();
    public List<Source> sources = new ArrayList<Source>();    
    public List<Resource> resources = new ArrayList<Resource>();        

    public List<Person> maintainers = new ArrayList<Person>();
    public List<Person> contributors = new ArrayList<Person>();    
    public List<Person> publisher = new ArrayList<Person>();        

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

        // Add more validation ...

        return true;
    }    

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("ID = " + this.id + "\n");
        buffer.append("Name = " + this.name + "\n");
        buffer.append("Title = " + this.title + "\n");        
        buffer.append("LastUpdated = " + this.last_updated + "\n");                
        buffer.append("Readme = " + this.readme + "\n");                
        buffer.append("Readme (HTML) = " + this.readme_html + "\n");                
        buffer.append("Version = " + this.version + "\n");                
        buffer.append("Download URL = " + this.download_url + "\n");  
        buffer.append("Keywords = ");
        for(Iterator<String> i = this.keywords.iterator(); i.hasNext(); ) {
            buffer.append( i.next() + ",");
        }
        buffer.append("\nLicenses = \n");
        for(Iterator<License> i = this.licenses.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }        
        buffer.append("\nSources = \n");
        for(Iterator<Source> i = this.sources.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }
        buffer.append("\nResources = \n");
        for(Iterator<Resource> i = this.resources.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }
        buffer.append("\nMaintainers = \n");
        for(Iterator<Person> i = this.maintainers.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }
        buffer.append("\nContributors = \n");
        for(Iterator<Person> i = this.contributors.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }
        buffer.append("\nPublishers = \n");
        for(Iterator<Person> i = this.contributors.iterator(); i.hasNext(); ) {
            buffer.append( i.next().toString() + "\n");
        }        
        return buffer.toString();
    }
}
