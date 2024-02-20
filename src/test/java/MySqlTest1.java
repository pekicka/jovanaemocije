import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class MySqlTest1 extends BaseMySqlTest{

    @BeforeAll
    static void init1(){
        setDataDumpMySqlFile("emocije_data.sql");
        setEmptyDumpMySqlFile("emocije_drop_dump.sql");

        emptyData();
        fillData();




    }

    @Test
    void test() throws SQLException {
        statement.executeUpdate("INSERT INTO emocije VALUES (NULL,'Radost',\"Nema puta ka sreći, sreća je put. – Buddha\")");


    }

    @AfterAll
    static void showResult(){

        showTable();
        emptyData();

    }


}
