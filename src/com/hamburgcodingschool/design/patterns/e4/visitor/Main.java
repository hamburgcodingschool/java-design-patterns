package com.hamburgcodingschool.design.patterns.e4.visitor;

public class Main {

    public static void main(String[] args) {
        Corporation corporation = new Corporation("GiantDataPool Inc.");
        Division resourcesDevelopmentDivision = new Division("R&D Division");
        resourcesDevelopmentDivision.addCorporate(new Employee("Steve", "R&D", 6));
        resourcesDevelopmentDivision.addCorporate(new Employee("Mike", "R&D", 24));
        resourcesDevelopmentDivision.addCorporate(new Employee("Nancy", "R&D", 18));
        corporation.add(resourcesDevelopmentDivision);
        Division salesDivision = new Division("Sales Division");
        salesDivision.addCorporate(new Employee("Ted", "Sales", 10));
        salesDivision.addCorporate(new Employee("Bob", "Sales", 19));
        salesDivision.addCorporate(new Employee("Carol", "Sales", 35));
        salesDivision.addCorporate(new Employee("Alys", "Sales", 45));
        Division westernSalesDivision = new Division("Western Sales Division");
        westernSalesDivision.addCorporate(new Employee("Wally", "Western Sales", 8));
        westernSalesDivision.addCorporate(new Employee("Andre", "Western Sales", 12));
        salesDivision.addCorporate(westernSalesDivision);
        corporation.add(salesDivision);
        corporation.add(new Employee("Cary", "At large", 13));

        corporation.print();

        FireableVisitor visitor = new FireableVisitor();
        corporation.accept(visitor);
        for (Employee employee : visitor.getFireableEmployees()) {
            System.out.println(String.format("Fireable: %s", employee.getName()));
        }
    }
}
