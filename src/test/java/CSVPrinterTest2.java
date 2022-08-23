
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.*;

import java.io.IOException;

public class CSVPrinterTest2 {

    @BeforeAll
    public static void beforeAll() throws IOException{
        System.out.println("beforeall");
    }

    @Test
    public  void test() throws IOException{
        System.out.println("test");
    }

    @Test
    public  void test2() throws IOException{
        System.out.println("test2");
    }


    @BeforeEach
    public  void beforeEach() throws IOException{
        System.out.println("beforeEach");
    }

    @AfterAll
    public static void afterAll() throws IOException{
        System.out.println("afterAll");
    }
    @AfterEach
    public  void afterEach() throws IOException{
        System.out.println("aftereach");
    }




}
