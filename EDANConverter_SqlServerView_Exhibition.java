public class EDANConverter_SqlServerView_Exhibition implements EDANConverter {

	String incomingData;
	String[] dataRows;
	String schemaType;
	String converterType;
	String[] convertErrors;

	int countRowsInitial;
	int countRowsConverted;
	
	public EDANConverter_SqlServerView_Exhibition() {
		//constructor
		schemaType = "Exhibition";
		converterType = "SqlServerView";
		
		countRowsInitial = 0;
		countRowsConverted = 0;
	}
	
	public String getConverterType() {
		return converterType;
	}
	
	public String getSchemaType() {
		return schemaType;
	}
	
	// convert the incoming data to some JSON we can use
	public boolean convert() {
		
    	// make sure we have data ingested
		
		// check all rows
		
		// fail if can't convert 1 or more
		
		// set convertErrors
		
		return true;
	}
	
	public int getCountRowsIn()
	{
		return countRowsInitial;
	}
	
	public int getCountRowsConverted()
	{
		return countRowsConverted;
	}

    public String[] getErrors() {    	
    	// return errors
    	return convertErrors;    	
    }
    
    // functions unique to this class
    
	public void getData(String sConnectionParamsHere) {
		// connect to the datasource and get the data
		// maybe pass connection params for the datasource
		
	}

}
