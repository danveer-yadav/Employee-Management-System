package Questions;

public class Manager extends Employee implements  BonusEligible {


    private int teamSize;
    private String projectName;


    Manager(int employeeId , String name , double salary , String  department , int teamSize , String projectName){
        super(employeeId , name, salary, projectName);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void displayDetail(){
        super.displayDetail();
        System.out.println(" TeamSize " + teamSize);
        System.out.println(" ProjectName " + projectName);
    }

   
    public double calculateBonus(){

        return super.calculateBonus(30);
    }

    


    public void manageTeam(){
        System.out.println(" Managing Team ");
    }

    
    























}
