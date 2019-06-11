
import edu.duke.*;
import org.apache.commons.csv.*;

public class WhichCountriesExport
{
   
    public void listExporters(CSVParser parser, String exportOfInterest)
    {
        for (CSVRecord record: parser){
            String export = record.get("Exports");
            
            if (export.contains(exportOfInterest)){
                String country= record.get("Country");
                System.out.println(country);
            }
        }
        
    }
    public void countryInfo(CSVParser parser, String countryOfIntrest)
    {
        for (CSVRecord record: parser){
            String country = record.get("Country");
            
            if (country.contains(countryOfIntrest)){
                String export= record.get("Exports");
                String value = record.get("Value (dollars)");
                System.out.println(country+": " +export+ ": " +value);
            }
        }
        
    }
    public void listExportersTwoProducts(CSVParser parser, String exportItem1,String exportItem2)
    {
        for (CSVRecord record: parser){
            String export = record.get("Exports");
            
            if (export.contains(exportItem1)&&export.contains(exportItem2)){
                String country= record.get("Country");
                System.out.println(country);
            }
        }
        
    }
    public void recordSize(CSVParser parser)
    {
        for (CSVRecord record: parser){
            String value = record.get("Value (dollars)");
            String country= record.get("Country");
            if (value.length()>16){
                System.out.println(country+value);
            }
            
            
        }
        
    }
    public void tester(){
        FileResource fr= new FileResource();
        CSVParser parser =fr.getCSVParser();
        //listExporters(parser, "sugar");
        //countryInfo(parser, "Nauru");
        //listExportersTwoProducts(parser, "gold", "diamonds");
        recordSize(parser);
    }
}
