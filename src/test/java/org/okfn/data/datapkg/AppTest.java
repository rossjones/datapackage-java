package org.okfn.data.datapkg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
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

    public void testValid()
    {
        try {
            DataPackage pkg = DataPackageReader.GetPackage(new URL("http://data.okfn.org/data/cpi/"));
            pkg.description = "This is a description";

            //Gson gson = new Gson();
            //String json = gson.toJson(pkg);              
            //System.out.println(json);
        } catch ( MalformedURLException e ) {
            System.out.println(e.toString());
        }
    }
}
