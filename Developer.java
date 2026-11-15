package Questions;

 public class Developer extends Employee  implements BonusEligible{


    private String programmingLanguage;
    private int  experience;

    Developer(int employeeId , String department , String name , String programmingLanguage , double salary , int experience){
        super(employeeId, name, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
    }

    @Override 
    public void displayDetail() {
        super.displayDetail();
        System.out.println(" Programminglanguage " + programmingLanguage);
        System.out.println(" Experience; " + experience);
    }

    
    public double calculateBonus(){

        return super.calculateBonus(20);
    }

    public void writeCode(){
        System.out.println( " Developer is writing code  ");
    }


    public  String getprogrammingLanguage(){
        return programmingLanguage;
    }

    public int getExperience(){
        return experience;
    }


    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    
       


































    
}
