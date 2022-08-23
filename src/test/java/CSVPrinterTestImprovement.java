import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class CSVPrinterTestImprovement {
    static ArrayList<CSVRecord> it;
    @BeforeAll
    public static void read() throws IOException{
        CSVPrinter printer = new CSVPrinter("sample.csv");
        it = new ArrayList<>();
        for(CSVRecord r : printer.read()){
            it.add(r);
        }
    }

    @Test
    public void testReadFile(){
        int size = 0;
        for(CSVRecord r : it){
            size++;
            System.out.println(r.get(0));
        }
        Assertions.assertEquals(2, size);
    }

    @Test
    public void testSpilit(){
        for(CSVRecord r : it){
            Assertions.assertEquals(3, r.size());
            break;
        }

    }

    @Test
    void testThrowsException() throws Exception{
        Assertions.assertThrows(FileNotFoundException.class, () ->{
            CSVPrinter printer = new CSVPrinter("aaa.csv");
        });
    }


}
