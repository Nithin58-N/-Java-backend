//package day02-Poymorphism;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.15;  // Managers get a different bonus rule entirely
    }
}

