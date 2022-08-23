import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CSVPrinterTest {
    @Test
    public void testReadFile() throws IOException {
        CSVPrinter printer = new CSVPrinter("sample.csv");
        Iterable<CSVRecord> it = printer.read();
        int size = 0;
        for(CSVRecord r : it){
            size++;
            System.out.println(r.get(0));
        }
        Assertions.assertEquals(2, size);
    }

//    public void testSpilitComma() throws IOException {
//        CSVPrinter printer = new CSVPrinter("sample.csv");
//        Iterable<CSVRecord> record = printer.read();
//        ArrayList<CSVRecord> list = new ArrayList<CSVRecord>();
//        for(CSVRecord r : record){
//            list.add(record.toList())
//        }

    @Test
    public void testSpilitComma() throws IOException {
        CSVPrinter printer = new CSVPrinter("sample.csv");
        Iterable<CSVRecord> it = printer.read();
        for(CSVRecord r : it){
            Assertions.assertEquals(3, r.size());
            break;
        }
    }
    //junit4とjunit5は例外スローの記載が違う?
    @Test
    void testThrowsException() throws Exception{
        Assertions.assertThrows(FileNotFoundException.class, () ->{
            CSVPrinter printer = new CSVPrinter("aaa.csv");
        });
    }
}
