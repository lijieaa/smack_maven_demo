import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.junit.Test;
import org.jxmpp.stringprep.XmppStringprepException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    @Test
    public void login() {


        try {
            final XMPPTCPConnectionConfiguration.Builder builder = XMPPTCPConnectionConfiguration.builder()
                    .setUsernameAndPassword("admin", "lijie101618")
                    .setServiceName("vszapp.com")
                    .setHost("vszapp.com")
                    .setPort(5222)
                    .setSendPresence(false)
                    .setCompressionEnabled(true)
                    .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled);
            AbstractXMPPConnection connection = new XMPPTCPConnection(builder.build());
            connection.connect();

        } catch (XMPPException e) {
            e.printStackTrace();
        } catch (SmackException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
