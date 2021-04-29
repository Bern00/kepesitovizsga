package hu.nive.ujratervezes.kepesitovizsga.jurrasic;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    MariaDbDataSource dataSource;

    public JurassicPark(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("root");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

    }



    public List<String> checkOverpopulation() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select `breed` from `dinosaur` where `actual` > `expected`")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("breed");
                names.add(name);
            }
            return names;
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select employees", se);
        }
    }
}
