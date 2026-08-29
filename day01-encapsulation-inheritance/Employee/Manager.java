public class Manager extends Employee{
    private int teamSize;
    
    public Manager(String name, double baseSalary, int teamSize){
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    public void showTeamInfo(){
        System.out.println("teamSize:"+teamSize);
    }
}
