package de.david.dhbw.semester3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufgabe2 {

    public static void main(String[] args) {

        //DBConnection wird zur Verbindung genutzt um Server, Benutzer und Passwort nicht mit zu veröffentlichen
        DBConnection db = new DBConnection().getInstance();
        Connection conn = db.getConnection("dev_2");

        try {

            System.out.println("a)\n");

            Statement stmt = conn.createStatement();
            String SQL = "SELECT AVG(Note) FROM Noten";

            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                double avg = rs.getDouble(1);
                System.out.println("Durchschnittsnote: " + avg);

            }

            System.out.println("\nb)\n");
            SQL = "SELECT Klausurnummer, AVG(Note) FROM Noten GROUP BY Klausurnummer";

            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int klausurnummer = rs.getInt(1);
                double avg = rs.getDouble(2);
                System.out.println("Klausur: " + klausurnummer + " Durchschnittsnote: " + avg);

            }

            System.out.println("\nc)\n");
            double search = 1;
            SQL = "SELECT Note FROM Noten WHERE Klausurnummer = " + (int) search;
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            int c4 = 0;
            int c5 = 0;

            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                double note = rs.getDouble(1);
                if (1.0 <= note && note < 2.0) {
                    c1++;
                }
                if (2.0 <= note && note < 3.0) {
                    c2++;
                }
                if (3.0 <= note && note < 4.0) {
                    c3++;
                }
                if (4.0 <= note && note < 5.0) {
                    c4++;
                }
                if (5.0 <= note) {
                    c5++;
                }

            }
            System.out.println("Notenspiegel für Klausurnummer: " + (int) search);
            System.out.println("Note 1.0 bis unter 2.0: " + c1);
            System.out.println("Note 2.0 bis unter 3.0: " + c2);
            System.out.println("Note 3.0 bis unter 4.0: " + c3);
            System.out.println("Note 4.0 bis unter 5.0: " + c4);
            System.out.println("Note 5.0: " + c5);



            System.out.println("\nd)\n");
            search = 1;
            SQL = "UPDATE Noten SET Note = Note*1.1 WHERE Klausurnummer = " + search;

            int update = stmt.executeUpdate(SQL);
            System.out.println(update + " Datensätze bearbeitet!");

            System.out.println("\ne)\n");
            SQL = "SELECT Matrikelnummer, AVG(Note) FROM Noten GROUP BY Matrikelnummer";

            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int mtr = rs.getInt(1);
                double avg = rs.getDouble(2);
                System.out.println("Matrikelnummer: " + mtr + " Durchschnitt: " + avg);

            }

            System.out.println("\nf)\n");
            search = 1234;
            SQL = "SELECT AVG(Note) FROM Noten WHERE Matrikelnummer = " + search + " GROUP BY Matrikelnummer";

            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                double avg = rs.getDouble(1);
                System.out.println("Matrikelnummer: " + (int) search + " Durchschnitt: " + avg);

            }

            System.out.println("\ng)\n");
            search = 1235;
            SQL = "SELECT AVG(Note) FROM Noten WHERE Matrikelnummer = ? GROUP BY Matrikelnummer";
            PreparedStatement pstmt_avgMtr = conn.prepareStatement(SQL);
            pstmt_avgMtr.setString(1, String.valueOf((int) search));
            rs = pstmt_avgMtr.executeQuery();
            while (rs.next()) {
                double avg = rs.getDouble(1);
                System.out.println("Matrikelnummer: " + search + " Durchschnitt: " + avg);

            }

            System.out.println("\nh)\n");
            SQL = "SELECT Vorname, Nachname, Studierende.Matrikelnummer, AVG(Note) FROM Noten inner join Studierende on Noten.Matrikelnummer = Studierende.Matrikelnummer GROUP BY Matrikelnummer";

            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String vname = rs.getString(1);
                String nname = rs.getString(2);
                int mtr = rs.getInt(3);
                double avg = rs.getDouble(4);
                System.out.println("Matrikelnummer: " + mtr + " Nachname: " + nname + " Vorname: " + vname + " Durchschnitt: " + avg);

            }

            System.out.println("\ni)\n");
            SQL = "SELECT Vorlesung, AVG(Note) FROM Noten inner join Klausur on Noten.Klausurnummer = Klausur.Klausurnummer GROUP BY Vorlesung";

            rs = stmt.executeQuery(SQL);
            List<String> vorlesung = new ArrayList<>();
            List<Double> avg = new ArrayList<>();

            while (rs.next()) {
                vorlesung.add(rs.getString(1));
                avg.add(rs.getDouble(2));
            }
            int max = avg.indexOf(Collections.max(avg));
            int min = avg.indexOf(Collections.min(avg));

            System.out.println("Beste Vorlesung: " + vorlesung.get(min) + " Note: " + avg.get(min));
            System.out.println("Schlechteste Vorlesung: " + vorlesung.get(max) + " Note: " + avg.get(max));


            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
