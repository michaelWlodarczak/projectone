package edu.sda.grcy.patterns.structural.fasada;

import java.sql.Connection;

public class ReportGeneratorFacade {
    public static void generateReport(DBType dbType, ReportType reportType, String table) {
        Connection conn;
        switch (dbType) {
            case MYSQL:
                conn = MySQLReportGenerator.getMySQLConnection();
                MySQLReportGenerator reportGenerator = new MySQLReportGenerator();
                switch (reportType) {
                    case HTML:
                        reportGenerator.generateMySQLHTMLReport(table, conn);
                    case PDF:
                        reportGenerator.generateMySQLPDFReport(table,conn);
                }
            case ORACLE:
                conn = OracleReportGenerator.getOracleConnection();
                OracleReportGenerator reportGenerator1 = new OracleReportGenerator();
                switch (reportType){
                    case HTML:
                        reportGenerator1.generateOracleHTMLReport(table,conn);
                    case PDF:
                        reportGenerator1.generateOraclePDFReport(table,conn);
                }
        }
    }

    public enum DBType {
        MYSQL, ORACLE
    }

    public enum ReportType {
        HTML, PDF
    }

}
