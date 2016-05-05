/* a simple ingestor example 
	classes implement ingestor to simply ingest data- from JSON to output record type in EDAN
	ingested JSON should be valid JSON for the API calls

	no thought should be given to where it comes from, although the incoming format 
	like JSON in
	not sure it is necessary or useful to specify the output schema

	have a converter that generates data of schema type from incoming data of specified type
	have an ingestor that ingests the converted data
	have specific data connectors to connect to data sources, or maybe do this in the main program
*/

class EDANIngestTest {
  public static void main(String[] args){
	  
	  EDANIngestor_Exhibition s = new EDANIngestor_Exhibition();
	  //String sType = s.getIngestorType();	  
	  //System.out.println("ingestor schema type is " + sType);

	  EDANConverter_SqlServerView_Exhibition c = new EDANConverter_SqlServerView_Exhibition();
	  //sType = c.getSchemaType();	  
	  //System.out.println("converter schema type is " + sType);
	  
	  // this is where you would load the existing data
	  // c.getData(sConnectionParamsHere);
	  
	  // convert it
	  if(c.convert()) 
	  {
		  //System.out.println("converted stuff");		  
		  s.setData(c.dataRows);
		  
		  if(s.ingest()) 
		  {
			  // check for errors		  
			  //System.out.println("ingested Exhibitions");	  
		  }
		  
	  }
  
  }
}
