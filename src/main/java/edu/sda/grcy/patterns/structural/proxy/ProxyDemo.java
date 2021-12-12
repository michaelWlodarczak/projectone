package edu.sda.grcy.patterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        CompanyEmployees companyEmployees = new CompanyEmployees();
        companyEmployees.addEmployee("Jan Kowalski");
        companyEmployees.addEmployee("Zofia Nowak");
        companyEmployees.addEmployee("Robert Lewandowski");

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetNetwork();

        internetNetwork.getAccess("Jan Kowalski");
        internetNetwork.getAccess("Jakub Blaszczykowski");
        internetNetwork.getAccess("Leo Messi");
        internetNetwork.getAccess("Robert Lewandowski");
    }
}
