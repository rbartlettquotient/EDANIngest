public interface EDANConverter {
	// Use Strategy pattern - swap new algorithms and processes without altering the objects that use them.
	String getConverterType();
	String getSchemaType();
	
	// convert the incoming data to some JSON we can use
	boolean convert();

	int getCountRowsIn();
	
	int getCountRowsConverted();

    String[] getErrors();
 
}
