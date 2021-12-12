package edu.sda.grcy.patterns.structural.fasada;

import java.sql.Connection;

public class MySQLReportGenerator {
    public static Connection getMySQLConnection() {
        //tu powinna byc definicja polaczenia z MySQL
        System.out.println("Laczymy sie z baza MySQL");
        return null;
    }

    public MySQLReportGenerator() {
        System.out.println("Tworzymy obiekt generatora raportow");
    }

    public void generateMySQLPDFReport(String table, Connection conn) {
        System.out.println("Drukujemy raport PDF z tabeli" + table + " z bazy MySQL");
    }

    public void generateMySQLHTMLReport(String table, Connection conn) {
        System.out.println("Drukujemy raport HTML z tabeli" + table + " z bazy MySQL");
    }

}
