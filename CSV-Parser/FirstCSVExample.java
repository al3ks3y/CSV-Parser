
import edu.duke.*;
import org.apache.commons.csv.*;

public class FirstCSVExample
{
    // instance variables - replace the example below with your own
    
    public void readFood()
    {
        FileResource fr = new FileResource();
        CSVParser parser =fr.getCSVParser();
        for (CSVRecord record :parser){
            System.out.print(record.get("Name")+ "  ");
            System.out.print(record.get("Favorite Color")+ "  ");
            System.out.println(record.get("Favorite Food"));
        }
    }

    
}
