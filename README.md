# Datapackage

A simple [datapackage](http://data.okfn.org/standards/data-package) library for Java.


## How to use it

This is still incomplete, but should work in reading most datapackage.json files.  Looks at src/main/java/org/okfn/data/datapkg/DataPackage.java to find the names of the fields until the Javadocs are added.

```java
try {
    // Create an input stream from "http://data.okfn.org/data/cpi/datapackage.json" called inp
    DataPackageReader reader = new DataPackageReader();
    DataPackage pkg = reader.Read( new InputStreamReader(inp) );
    System.out.println(pkg.description);            
} catch ( MalformedURLException e ) {
    System.out.println(e.toString());
} catch ( IOException ioe ) {
    System.out.println(ioe.toString());
}
```

For writing something like 

```java
try {
    DataPackageWriter writer = new DataPackageWriter();
    DataPackage pkg = new DataPackage();
    pkg.id = "test";
    writer.Write(pkg, new OutputStreamWriter(System.out));            
} catch ( IOException ioe ) {
    System.out.println(ioe.toString());
}
```

Both of these examples will change once validation is implemented.

## Todo

- [ ] Make sure it follows [the spec](http://www.dataprotocols.org/en/latest/data-packages.html)
- [ ] Add validation
- [ ] Add javadocs
- [ ] Allow writing as well as reading
