package de.david.dhbw.semester4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class A1_KleinerServer {

    private ServerSocket server = new ServerSocket(1234);

    private A1_KleinerServer() throws IOException {
        do {
            Socket client = server.accept();
            InputStream input = client.getInputStream();
            OutputStream output = client.getOutputStream();
            int zahl1 = input.read();
            int zahl2 = input.read();
            int zahl3 = input.read();
            int zahl4 = input.read();

            int op = input.read();
            int res;

            switch (op) {
                case 1://Add
                    res = (zahl1 + zahl2 + zahl3 + zahl4);
                    output.write(res);
                    output.write((res < 0 ? 1 : 0));
                    break;
                case 2://Sub
                    res = zahl1 - zahl2 - zahl3 - zahl4;
                    output.write(res);
                    output.write((res < 0 ? 1 : 0));
                    break;
                case 3://Mul
                    res = zahl1 * zahl2 * zahl3 * zahl4;
                    output.write(res);
                    output.write((res < 0 ? 1 : 0));
                    break;
                case 4://Div
                    res = zahl1 / zahl2 / zahl3 / zahl4;
                    output.write(res);
                    output.write((res < 0 ? 1 : 0));
                    break;
            }

            output.flush();
            input.close();
            output.close();
        } while (true);
    }

    public static void main(String[] args) {
        try {
            new A1_KleinerServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Es sollen nicht nur zwei, sondern bis zu vier Zahlen eingelesen werden können.
Außerdem soll der Benutzer angeben können, welche Grundrechenart (aus dem
Spektrum Addition, Subtraktion, Multiplikation) angewandt werden soll.
Bitte berücksichtigen Sie, dass - wie vorne beschrieben - mit den Klassen
InputStream und OutputStream nur Integer-Zahlen übertragen werden
können und überlegen Sie sich entsprechende „Tricks“.
 */