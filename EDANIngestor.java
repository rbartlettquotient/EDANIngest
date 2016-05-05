public interface EDANIngestor {
	// Use Strategy pattern - swap new algorithms and processes without altering the objects that use them.

	void setSchemaType(String schemaType);
	String getSchemaType();

	// ingest the JSON into EDAN
    boolean ingest();
    
    // bulk ingest records
    boolean ingestBulk(String incomingData);
    
	int getCountRowsIn();

	int getCountRowsIngested();

    String[] getErrors();
       
}