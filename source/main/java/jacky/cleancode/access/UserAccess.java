package jacky.cleancode.access;

import jacky.cleancode.domain.User;

public class UserAccess {

    public final DBSource dbSource;

    public UserAccess(DBSource dbSource) {
        this.dbSource = dbSource;
    }

    public void addUser(User user) {
        DbConnection dbConnection = dbSource.getDbConnection();
        boolean result = dbConnection.perform(" blabla");
        if(!result) {
            throw new RuntimeException("unabled to add user "  + user);
        }
    }
}
