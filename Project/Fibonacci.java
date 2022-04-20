
//typical fibonacci helper class to extract 1000 terms and a method to store them in a single array
public class Fibonacci {

   private double current=1, prev = 1, prevprev = 0;
   private double[] arr = new double[999];
   public Fibonacci() {}
       public double[] fibogen()
       {
    for(int i = 0; i < 999; i++) { 
    	arr[i]=current;
    	current = prev + prevprev; 
      
    prevprev = prev; 
    prev = current; 
    
    
    }
    return arr;
       }
    }
    