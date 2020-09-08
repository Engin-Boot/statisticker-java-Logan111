package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
    public static class Stats
    {
       Float average = Float.NaN;
       Float min = Float.NaN;
       Float max = Float.NaN;        
        
    }

    public static Stats getStatistics(List<Float> numbers)
    {
      if(numbers.isEmpty())
       {
          
           Stats empObj = new Stats();
           return empObj;
       }
       Float average = 0f;
       Float min =Collections.min(numbers);
       Float max = Collections.max(numbers);
       Float sum = 0f;
       
       for(Float num:numbers)
       {
           sum = sum+num;
       }
       
       average = sum / numbers.size();
       Stats returnObj = new Stats();
       returnObj.average = average;
       returnObj.max = max;
       returnObj.min = min;
       return returnObj;
    }
}
