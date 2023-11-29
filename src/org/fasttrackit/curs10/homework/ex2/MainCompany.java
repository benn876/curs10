package org.fasttrackit.curs10.homework.ex2;

import static org.fasttrackit.curs10.homework.ex2.Welder.WELDER_POSITION;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company();
        company.employeeOnePerson(new Manager("Mihai",44));
        company.employeeOnePerson(new Manager("George",22));
        company.employeeOnePerson(new Carpenter("Ionel",51));
        company.employeeOnePerson(new Welder("Ana",31));
        company.employeeOnePerson(new Welder("Ionela",31));

        System.out.println(company.getEmployees());
        System.out.println(company.getPersons(WELDER_POSITION));
    }
}
