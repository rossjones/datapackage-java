# Datapackage

A simple [datapackage](http://data.okfn.org/standards/data-package) library for Java.


## How to use it

This is still incomplete, but should work in reading most datapackage.json files.  Looks at src/main/java/org/okfn/data/datapkg/DataPackage.java to find the names of the fields until the Javadocs are added.

        try {
            DataPackage pkg = DataPackageReader.GetPackage(new URL("http://data.okfn.org/data/cpi/datapackage.json"));
            System.out.println(pkg.description);            
        } catch ( MalformedURLException e ) {
            System.out.println(e.toString());
        }


## Todo

1. Make sure it follows [the spec](http://www.dataprotocols.org/en/latest/data-packages.html)
2. Add validation
3. Add javadocs
4. Allow writing as well as reading
