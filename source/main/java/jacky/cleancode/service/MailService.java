package jacky.cleancode.service;

public class MailService {

    public final String mailServerHost;
    public final int mailServerPort;
    public final String userName;


    public MailService(String mailServerHost, int mailServerPort, String userName) {
        this.mailServerHost = mailServerHost;
        this.mailServerPort = mailServerPort;
        this.userName = userName;
    }

    public void sendMail(String name) {

    }
}
