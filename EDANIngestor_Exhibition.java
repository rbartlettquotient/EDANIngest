public class EDANIngestor_Exhibition implements EDANIngestor {

	String incomingData;
	String[] dataRows;
	String schemaType;
	
	int countRowsInitial;
	int countRowsIngested;

	String[] ingestErrors;
	
	public EDANIngestor_Exhibition() {
		//constructor			
		dataRows = new String[0];
		countRowsInitial = 0;
		countRowsIngested = 0;
	}
	
	public String getIngestorType() {
		return "SqlserverViewExhibition";
	}
	
	public String getSchemaType() {
		return schemaType;
	}
	
	public void setSchemaType(String sType) {
		schemaType = sType;
	}
	
	// ingest the JSON into EDAN
    public boolean ingest() {

    	// ingest data to EDAN
    	// make sure we have data ingested and it's in a format we can cycle through    	
    	int countRows = dataRows.length;
    	for(int i = 0; i < countRows; i++)
    	{
    		// load one unit of data
    	
    		// does it fit our schema?
    	
    		// ingest it by making the API call to update a single item    		
    		// do we need to check for dups?
    		
    	}
    	return true;
    }
    
    public boolean ingestBulk(String sData) {
    	
    	incomingData = sData;
    	
    	// ingest data to EDAAN
    	
    	// load all units of data
    	
    	// do all rows fit our schema?
    	
    	// can we verify schema compliance in bulk? or should we just try to push all, and barf errors if no good?
    	
    	// ingest in bulk making a single API call
    	
    	return true;
    	
    }
    
	public int getCountRowsIn() 
	{
		return countRowsInitial;
	}
	
	public int getCountRowsIngested()
	{
		return countRowsIngested;
	}


    public String[] getErrors() {    	
    	// return errors
    	return ingestErrors;    	
    }
    
    // functions unique to this class
	public void setData(String[] incomingData) {
		
	}
    
}
