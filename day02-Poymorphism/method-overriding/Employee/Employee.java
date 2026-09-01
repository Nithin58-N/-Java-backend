//package day02-Poymorphism;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String showDetail(Employee object){
        return object.name;
    }
    public void giveRaise(Employee object) {
        object.baseSalary = object.baseSalary + 5000;
    }

    public double calculateBonus() {
        return baseSalary * 0.05;  // default: 5% bonus for regular employees
    }
}

