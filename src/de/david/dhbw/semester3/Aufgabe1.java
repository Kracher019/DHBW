package de.david.dhbw.semester3;

import java.sql.*;

public class Aufgabe1 {

    public static void main(String[] args) {

        //DBConnection wird zur Verbindung genutzt um Server, Benutzer und Passwort nicht mit zu veröffentlichen
        DBConnection db = new DBConnection().getInstance();
        Connection conn = db.getConnection("dev_2");

        try {
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM Studierende WHERE Matrikelnummer < 5555";

            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                int mtr = rs.getInt(1);
                String nachname = rs.getString(2);
                String vorname = rs.getString(3);
                Date geb = rs.getDate(4);

                System.out.println(mtr + " " + nachname + " " + vorname + " " + geb);

            }

            ResultSetMetaData rsm = rs.getMetaData();
            System.out.println("Spaltenanzahl: " + rsm.getColumnCount());
            StringBuilder name = new StringBuilder();
            StringBuilder label = new StringBuilder();
            StringBuilder type = new StringBuilder();
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                label.append(" ").append(i);
                name.append(" ").append(rsm.getColumnName(i));
                type.append(" ").append(rsm.getColumnTypeName(i));
            }
            System.out.println("Spaltendaten:");
            System.out.println(label);
            System.out.println(name);
            System.out.println(type);
            System.out.println();

            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println("URL: " + dbmd.getURL());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("DatabaseProductName: " + dbmd.getDatabaseProductName());
            System.out.println("DatabaseProductVersion: " + dbmd.getDatabaseProductVersion());
            System.out.println("DriverName: " + dbmd.getDriverName());
            System.out.println("DriverVersion: " + dbmd.getDriverVersion());

            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
