public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary  = baseSalary;
    }

    public void showDetails(){
        System.out.println("name: "+name+"\tbaseSalary: "+baseSalary);
    }

    public double calculateBonus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateBonus'");
    }
}
