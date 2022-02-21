
public class Data extends BankAccount
  {

   /**
        Computes the average of the measures of the given objects.
        @param objects an array of Measurable objects
        @return the average of the measures
     */

    public static double average(Measurable[] objects)
    { 

 
       double sum = 0;
       int count = 0; 
       for (Measurable obj : objects) {

         if (obj instanceof BankAccount && ((BankAccount) obj).accept(Double.valueOf(((BankAccount) obj).getBalance()))) {
         // double limit = (double) Y; 
              sum = sum + ((BankAccount) obj).getMeasure();
              count++; 
         }
         else if (obj instanceof Country) {
           sum += ((Country) obj).getMeasure();
           count++; 
         }
         }
       if (objects.length > 0) { return sum / objects.length; }
       else { return 0; }
    }
   }
 //modify this class
 //you have to run bank account differently from the code here
 //do you come in as bank account or country?
 //go back to chapter 9, instance of 
 //wrap the code arond an if statement

         // BankAccount balance = new BankAccount();
        // //double num = abc.getBalance(); 
        //     if (balance instanceof BankAccount) {
        //       double num = balance.getBalance();  
        //       balance.accept(num); 
        //     }
       //write it for bankaccount specifically for the accept class 
