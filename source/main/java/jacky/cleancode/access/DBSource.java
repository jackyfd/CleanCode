package jacky.cleancode.access;

public class DBSource {

    public DbConnection getDbConnection() {
        return new DbConnection();
    }
}
