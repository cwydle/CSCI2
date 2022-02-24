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
      double limit = 1000;
      int count = 0; 
      for (Measurable obj : objects)
      {
         if (obj instanceof BankAccount) {
            Filter X = (Filter) obj; 
            if (X.Accept(limit)) {
               sum = sum + obj.getMeasure();
               count++;
            }
         }

        else if { 
           sum = sum + obj.getMeasure();
            count++;
        }
      }
      if (objects.length > 0) { return sum / count; }
      else { return 0; }
   }
}
