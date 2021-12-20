package edu.sda.grcy.patterns.structural.fasada;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        String table = "Employee";

//        //generujemy raport z tabeli z bazy Oracle
//        Connection connection = OracleReportGenerator.getOracleConnection();
//        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
//        oracleReportGenerator.generateOraclePDFReport(table,connection);
//
//        //a teraz z MySQL raport HTML
//        Connection connection1 = MySQLReportGenerator.getMySQLConnection();
//        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
//        mySQLReportGenerator.generateMySQLHTMLReport(table,connection1);

        /**
         * Problem: Klient (aplikacja ktora uzywa generatora raportow)
         * musi wykonac kilka krokow zanim dostanie to o co naprawde jej chodzi
         */
        ReportGeneratorFacade.generateReport(ReportGeneratorFacade.DBType.ORACLE,
                ReportGeneratorFacade.ReportType.HTML,
                table);

        ReportGeneratorFacade.generateReport(ReportGeneratorFacade.DBType.MYSQL,
                ReportGeneratorFacade.ReportType.PDF,
                table);
    }
}
