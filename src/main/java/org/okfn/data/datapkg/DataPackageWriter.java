package org.okfn.data.datapkg;

import java.nio.charset.Charset;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

import java.net.URL;

import com.google.gson.Gson;

/**
 * Given a DataPackage, writes out the corresponding JSON
 */
public class DataPackageWriter
{
    public Gson gson = new Gson();

    /**
    *
    **/
    public void Write(DataPackage pkg, OutputStreamWriter out) throws IOException {
        String json = gson.toJson(pkg);
        try{ 
            BufferedWriter writer = new BufferedWriter(out);
            writer.write(json);
            writer.flush();
        } catch ( IOException ioe ) {
            // Log error
            throw ioe;
        }
    }

}
