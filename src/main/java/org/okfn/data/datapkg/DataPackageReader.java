package org.okfn.data.datapkg;

import java.nio.charset.Charset;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.net.URL;

import com.google.gson.Gson;

/**
 * Loads a JSON file and populates a DataPackage object with 
 * the data it finds.
 */
public class DataPackageReader
{
    public Gson gson = new Gson();


    public DataPackage Read(InputStreamReader source) throws IOException {
        DataPackage pkg = new DataPackage();
        try {
            String data = ReadFromUrl(source);
            pkg = gson.fromJson(data, DataPackage.class);           
        } catch (IOException ioe) {
            // Do some logging here.
            throw ioe;
        }
        return pkg;
    }

    private String ReadFromUrl(InputStreamReader input) throws IOException {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader rd = new BufferedReader(input);
            int read = 0;
            while ((read = rd.read()) != -1) {
                sb.append((char) read);
            }
            return sb.toString();
        } catch (IOException ioe) {
            // log
            throw ioe;
        }        
    }    
}
