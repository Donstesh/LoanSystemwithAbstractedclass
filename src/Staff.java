public class Staff extends Loan{
     private int Staff_No;
     private String Department;
     private double intreststaff;
     private double Totalsstaff;
     private double Rate = 0.05;

     public Staff(int Staff_No, String Department, String Loanee_name, 
             int Accnt_No, int Duration, double Loan_Amount) {
          super(Loanee_name, Accnt_No, Duration, Loan_Amount);
          this.Staff_No = Staff_No;
          this.Department = Department;
         
     }
     @Override
     public void print(){
     System.out.println("Staff Details");
         super.print();
         
         System.out.println("Staff No: " + Staff_No);
         System.out.println("Department: " + Department);
         System.out.println("Intrest: " + calcintrest()+ "Kshs");
         System.out.println("Total Payable Loan Is: " + Totals()+ "Kshs");
     }         

     @Override
     public double calcintrest() {
          intreststaff = (Loan_Amount * Rate * Duration/100);
          return intreststaff;
     }
     @Override
     public double Totals() {
          Totalsstaff = ((intreststaff) + Loan_Amount);
          return Totalsstaff;
    }
     }
     
     

