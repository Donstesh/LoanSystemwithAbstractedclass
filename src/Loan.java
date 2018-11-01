public abstract class Loan {
     
     String Loanee_name;
     int Accnt_No;
     int Duration;
     double Loan_Amount;

     public Loan(String Loanee_name, int Accnt_No, int Duration, 
                         double Loan_Amount) 
     {
          this.Loanee_name = Loanee_name;
          this.Accnt_No = Accnt_No;
          this.Duration = Duration;
          this.Loan_Amount = Loan_Amount;
     }
     public abstract double calcintrest();
     public abstract double Totals();

    public void print(){
          System.out.println("\tName: "+Loanee_name+ "\tAccount number: " 
                  +Accnt_No+ "\tDuration: "+Duration+ "\tLoan Amount: "
                  +Loan_Amount + "Kshs");
          

    }
    }
