public class Main3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 30000);
        Employee e2 = new Manager("Nithin", 50000, 6);  // parent reference, child object

        Employee e3 = e1; //Assigning a object that referencing existing object.
        System.out.println(e1.showDetail(e3));

        System.out.println("name: "+e1.name+"\tBonusSalary: "+e1.calculateBonus());  // 1500.0  (Employee's version)
        System.out.println("name: "+e2.name+"\tBonusSalary: "+e2.calculateBonus());  // 7500.0  (Manager's version runs!)

        e3.name = "Suresh";

        PayrollService service = new PayrollService();
        service.giveRaise(e1);  // called through a PayrollService object
        System.out.println(e1.baseSalary);  // 35000

        System.out.println("name: "+e3.name+"\tBonusSalary: "+e3.calculateBonus());
    }
}
