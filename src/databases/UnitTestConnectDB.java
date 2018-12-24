package databases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {
    @Test
    public void connectionTest() {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        try {
            ConnectToSqlDB.connectToSqlDatabase();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
