import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {

    private static String app_url = "http://0.0.0.0:9191/";

    public static void main(String[] args) {
        Endpoint.publish(app_url, new BankService());
        System.out.println(" 🚀 App launched on : "+app_url);
    }

}
