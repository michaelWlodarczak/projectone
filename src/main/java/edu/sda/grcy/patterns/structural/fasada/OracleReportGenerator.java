package edu.sda.grcy.patterns.structural.fasada;

import java.sql.Connection;

public class OracleReportGenerator {
    public static Connection getOracleConnection() {
        //tu powinna byc definicja polaczenia z Oracle
        System.out.println("Laczymy sie z baza Oracle");
        return null;
    }

    public OracleReportGenerator() {
        System.out.println("Tworzymy obiekt generatora raportow");
    }

    public void generateOraclePDFReport(String table, Connection conn) {
        System.out.println("Drukujemy raport PDF z tabeli" + table + " z bazy Oracle");
    }

    public void generateOracleHTMLReport(String table, Connection conn) {
        System.out.println("Drukujemy raport HTML z tabeli" + table + " z bazy Oracle");
    }
}
