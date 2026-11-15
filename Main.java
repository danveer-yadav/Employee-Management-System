package Questions;

public class Main {
    public static void main(String[] args) {

    //  ===== DEVELOPER DETAILS ====

   System.out.println("========== DEVELOPER =========="); 

  Developer d = new Developer(101, "IT", "Danveer","Java" , 500000 , 2);
  d.displayDetail();

  System.out.println(" Bonus : " + d.calculateBonus(20));

  d.writeCode();

  // Testing Encapsulation

  d.setSalary(500000);

  System.out.println(" Updated Salary: " + d.getSalary());
  System.out.println(" Updated Bonus : " + d.calculateBonus());

  
  // ===== MANAGER DETAILS =====

  System.out.println("========== MANAGER ==========");

 Manager m = new Manager(116, " Rohit ", 300000, " Banking ", 5, " Core Banking System Upgrade");
 m.displayDetail();

 System.out.println(" Bonus " + m.calculateBonus(30));

 // Testing Encapsulation
 
 m.setSalary(300000);

 System.out.println(" Updated Salary: " + m.getSalary());
 System.out.println(" Updated Bonus: " + m.calculateBonus());

 m.manageTeam();

  
 // ===== INTERFACE DEMONSTRATION =====

 System.out.println("\n========== Interface ==========");

 BonusEligible b = new Developer(101, " IT", " Danveer ", " Java" , 500000, 2);
 
 System.out.println(" Interface Bonus: "+ b.calculateBonus());



 









}








}




    

