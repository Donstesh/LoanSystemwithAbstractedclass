public class Client extends Loan {
     private  String Emploer;
     private  double Salary;
     private  double Rate = 0.14;
     private  double Totals;
     private double intrest;

     public Client(String Emploer, double Salary,  
             String Loanee_name, int Accnt_No, int Duration, double Loan_Amount)
     {
          super(Loanee_name, Accnt_No, Duration, Loan_Amount);
          this.Emploer = Emploer;
          this.Salary = Salary;
                   
            }
     @Override
     public void print()
     {
         System.out.println("Client Details");
         super.print();
         System.out.println("Employer: " + Emploer);
         System.out.println("Salary: " + Salary+ "Kshs");
         System.out.println("Intrest: "+calcintrest()+ "Kshs");
         System.out.println("Total Payable Loan Is: "+Totals()+ "Kshs");
     }    
     @Override
     public double calcintrest() {
          intrest = (Loan_Amount * Rate * Duration/100);
          return intrest;
             }
     @Override
     public double Totals(){
          Totals = ((intrest) + Loan_Amount);
          return Totals;
     }
   }

