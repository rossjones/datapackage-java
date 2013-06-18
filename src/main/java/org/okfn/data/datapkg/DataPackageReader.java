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

    public static String ReadFromUrl(URL source) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream is = source.openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            int read = 0;
            while ((read = rd.read()) != -1) {
                sb.append((char) read);
            }
            return sb.toString();
        } finally {
            is.close();
        }        
    }

    public static DataPackage GetPackage(URL source) {
        DataPackage pkg = new DataPackage();
        try {
            String data = ReadFromUrl(source);
            //Gson gson = new Gson();
            //pkg = gson.fromJson(data, DataPackage.class);           
        } catch (IOException e) {

        }
        return pkg;
    }
}
