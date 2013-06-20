package org.okfn.data.datapkg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

import com.google.gson.Gson;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testValidRead()
    {
        try {
            DataPackageReader reader = new DataPackageReader();
            DataPackage pkg = reader.Read(new URL("http://data.okfn.org/data/cpi/datapackage.json"));
            System.out.println(pkg.toString());            

        } catch ( MalformedURLException e ) {
            System.out.println(e.toString());
        } catch ( IOException ioe ) {
            System.out.println(ioe.toString());
        }        
    }

    public void testValidWrite()
    {
        //try {
        DataPackageWriter writer = new DataPackageWriter();
        DataPackage pkg = new DataPackage();
        pkg.id = "test";
        System.out.println(writer.Write(pkg));            
        //} catch ( IOException ioe ) {
        //    System.out.println(ioe.toString());
        //}        
    }    
}
