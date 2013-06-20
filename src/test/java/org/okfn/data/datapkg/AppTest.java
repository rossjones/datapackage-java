package org.okfn.data.datapkg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
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

            URL url = new URL("http://data.okfn.org/data/cpi/datapackage.json");
            URLConnection connection = url.openConnection();
            //connection.setConnectTimeout(connectTimeoutMS);
            //connection.setReadTimeout(readTimeoutMS);
            InputStreamReader in =  new InputStreamReader(connection.getInputStream());

            DataPackageReader reader = new DataPackageReader();
            DataPackage pkg = reader.Read(in);
            System.out.println(pkg.toString());            

        } catch ( MalformedURLException e ) {
            System.out.println(e.toString());
        } catch ( IOException ioe ) {
            System.out.println(ioe.toString());
        }        
    }

    public void testValidWrite()
    {
        try {
            DataPackageWriter writer = new DataPackageWriter();
            DataPackage pkg = new DataPackage();
            pkg.id = "test";
            writer.Write(pkg, new OutputStreamWriter(System.out));            
        } catch ( IOException ioe ) {
            System.out.println(ioe.toString());
        }        
    }    
}
