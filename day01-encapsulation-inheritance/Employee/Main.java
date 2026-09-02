
public class Main{
    public static void main(String[] args) {
        Employee e1 = new Manager("Nithin", 500000, 6);
        e1.showDetails();
        
        Manager m1 = new Manager("Nithin",500000,6);
        m1.showDetails();
        m1.showTeamInfo();
    }
}