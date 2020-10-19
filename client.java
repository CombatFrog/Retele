import java.net.*;
import java.io.*;

public class client {
    public static void main(String args[]) throws Exception
    {
        String ip = args[0];
        int port = Integer.parseInt(args[1]);

        Socket c = new Socket(ip, port);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader socketIn = new BufferedReader(new InputStreamReader(c.getInputStream()));
        DataOutputStream socketOut = new DataOutputStream(c.getOutputStream());

        System.out.println("Introduceti un sir de numere: ");
        String sir = reader.readLine();
        socketOut.writeUTF(sir);
        socketOut.flush();


        System.out.println(socketIn.readLine());
        System.out.println(socketIn.readLine());
        reader.close();
        c.close();
    }
}
