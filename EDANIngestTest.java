/* 
 	This example is simply to show how things would happen- but in the live system obviously this won't be happening sequentially.
 	
 	On live what would likely happen is:
	- converters will be running and dropping data into a bin
	- ingestors will be grabbing the JSON from the bin and ingesting into the specified record type 
	
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
			  //System.out.println("ingested Exhibitions");	  
		  }
		  else {
			  // handle errors
			  
		  }
		  
	  }
	  else {
		  // handle errors
	  }
  
  }
}
