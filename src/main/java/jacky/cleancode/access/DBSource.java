package jacky.cleancode.access;

import org.springframework.stereotype.Repository;

@Repository
public class DBSource {

    public DbConnection getDbConnection() {
        return new DbConnection();
    }
}
