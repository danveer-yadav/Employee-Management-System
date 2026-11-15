package Questions;

 abstract class Employee {

    // intiliase
    
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    // Construct

     Employee(){
    this.employeeId = -1;
    this.name = "";
    this.salary = -1;
    this.department = "";
   }
    

   Employee( int employeeId , String name , double salary , String department){
    this.employeeId = employeeId;
    this.name = name;
    this.salary = salary;
    this.department = department;
   }

   // Methods

    void displayDetail(){
    System.out.println(" Empolyee ID " +employeeId );
    System.out.println(" Name " + name);
    System.out.println(" Salary " + salary);
    System.out.println(" Department " + department);

   }

   // Condition of Bonus
   
   public double calculateBonus(double percentage){

    double bonus = salary*percentage/100;

    return bonus;

   
   }

   // Abstract Method

   public abstract double calculateBonus();


   // Getters

   public int getEmpolyeeId(){
    return employeeId;
   }

   public String getName(){
    return name;
   }

   public double getSalary(){
    return salary;
   }

   public String getDepartment(){
    return department;
   }


   // Setters

   public void setEmpolyeeId(int empolyeeId){
    this.employeeId = empolyeeId;
   }

   public void setName(String name){
    this.name = name;
   }

   public void setSalary( double salary){
    this.salary = salary;
   }

   public void setDepartment(String department){
    this.department = department;
   }
     
   
    

        
    

   
    

   


    
















    
}
