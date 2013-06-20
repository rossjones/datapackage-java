package org.okfn.data.datapkg;

import java.nio.charset.Charset;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

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
    public String Write(DataPackage pkg) { // throws IOException {
        StringBuffer buffer = new StringBuffer();
        //try {
        buffer.append(gson.toJson(pkg));           
        //} catch (IOException ioe) {
            //throw ioe;
        //}
        return buffer.toString();
    }

}
