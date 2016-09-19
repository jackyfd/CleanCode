package jacky.cleancode.access;

import jacky.cleancode.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccess {

    private final DBSource dbSource;

    @Autowired
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
