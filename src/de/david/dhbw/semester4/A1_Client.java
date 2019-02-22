package de.david.dhbw.semester4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class A1_Client {

    A1_Client() throws IOException {
        Socket server = new Socket("localhost", 1234);
        InputStream input = server.getInputStream();
        OutputStream output = server.getOutputStream();

        //4 Zahlen
        output.write(5);
        output.write(10);
        output.write(7);
        output.write(3);

        //Operation 1 für Addition 2 für Subtraktion 3 für Multiplikation und 4 für Division
        output.write(2);
        output.flush();
        int res = input.read();
        switch (input.read()) {
            case 0:
                System.out.println(res);
                break;
            case 1:
                System.out.println(res - 256);
                break;
        }
        server.close();
        input.close();
        output.close();
    }

    public static void main(String[] args) {
        try {
            new A1_Client();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
