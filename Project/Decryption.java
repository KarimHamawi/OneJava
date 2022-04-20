//the code is meant to take each character, take a number from it which is it's position on the keyboard,
//multiple it by a number from the fibonacci sequence which the term of is its position of the character in the whole paragraph
//then, it divides this big number by 61 which is the total number of characters we needed and
//it gives a number n, which if we remove the decimal of leaves how many times we need to subtract 61 from our big number to leave us
//with a number between 1 and 61, which we then translate also from position on keyboard to a new encrypted character and code
//then, all in reverse to get the decryption 
import java.io.*;
import java.util.*;
public class Decryption {
    public static void main(String args[])throws IOException 
    {
    	
    	//here we are getting the information from the txt file
    	String str="";
    	Scanner S=new Scanner(new File("SuperSecretStuff.txt"));
        while (S.hasNext())
    	{ 
        	str+= S.next()+" ";
    	}
       //used loop to put it all in a string
       
        Scanner S1=new Scanner (str);
       //we used a delimiter which is non existing so that it doesnt seperate tokens
        S1.useDelimiter("~");
       Fibonacci f = new Fibonacci();
       
       //this array now contains 1000 terms of fibonacci from helper class so we use them
       double[] array1 = f.fibogen(); 
      
       String R1=  "";
       R1=S1.next();
       //string R1 now has all the paragraph
       //here we declared a couple variables being a double because it is the only thing to contain such huge numbers from fibonacci
       //and an integer for the resulting number to be turned into encryption 
       double n=0;
       int result=0;       
       //declared two arraylists to store all the ns and the results and we needed arraylist since arrays cant do that in a repeating loop
       ArrayList<Double> arrayn = new ArrayList<Double>();
       ArrayList<Integer> arrayresult = new ArrayList<Integer>();
       
       //for loop changing all characters to integers with switch
       for(int w=0;w<=R1.length()-2;w++)
       { 
    	   double product=0;
    	   int k=0;
    	   switch (R1.charAt(w))
    	   {
    	   
    	   case '!': k=1; break;
           case '(': k=2; break;
           case ')': k=3; break;
           case 'q': k=4; break;
           case 'Q': k=5; break;
           case 'w': k=6; break;
           case 'W': k=7; break;
           case 'e': k=8; break;
           case 'E': k=9; break;
           case 'r': k=10; break;
           case 'R': k=11; break;
           case 't': k=12; break;
           case 'T': k=13; break;
           case 'y': k=14; break;
           case 'Y': k=15; break;
           case 'u': k=16; break;
           case 'U': k=17; break;
           case 'i': k=18; break;
           case 'I': k=19; break;
           case 'o': k=20; break;
           case 'O': k=21; break;
           case 'p': k=22; break;
           case 'P': k=23; break;
           case 'a': k=24; break;
           case 'A': k=25; break;
           case 's': k=26; break;
           case 'S': k=27; break;
           case 'd': k=28; break;
           case 'D': k=29; break;
           case 'f': k=30; break;
           case 'F': k=31; break;
           case 'g': k=32; break;
           case 'G': k=33; break;
           case 'h': k=34; break;
           case 'H': k=35; break;
           case 'j': k=36; break;
           case 'J': k=37; break;
           case 'k': k=38; break;
           case 'K': k=39; break;
           case 'l': k=40; break;
           case 'L': k=41; break;
           case ';': k=42; break;
           case ':': k=43; break;
           case 'z': k=44; break;
           case 'Z': k=45; break;
           case 'x': k=46; break;
           case 'X': k=47; break;
           case 'c': k=48; break;
           case 'C': k=49; break;
           case 'v': k=50; break;
           case 'V': k=51; break;
           case 'b': k=52; break;
           case 'B': k=53; break;
           case 'n': k=54; break;
           case 'N': k=55; break;
           case 'm': k=56; break;
           case 'M': k=57; break;
           case ',': k=58; break;
           case '.': k=59; break;
           case '?': k=60; break;
           case ' ': k=61; break;
    	   }
       //most important part which is the product being the fibonacci multiplied by the integer
    	   // and we got n with an ingenius use of the floor method since the casting with int removed too many numbers and we got the result and stored
    	   //in arraylist using add method and stored all the n's in other arraylist
       product=k*array1[w];
       n = Math.floor((product/61.0));
       result=(int)(product-(61*n));     
       arrayn.add(n);   
       arrayresult.add(result);
       
       }
      
       
   
       
       String wings="";
       String magic="";
       //for loop for  new encryption
       for (int s=0;s<999;s++)      
       {
       switch (arrayresult.get(s))
       {
       case 1:wings= "!";break;
       case 2:wings= "(";break;
       case 3:wings= ")";break; 
       case 4: wings= "q";break;
       case 5:wings= "Q";break;
       case 6:wings= "w";break;
       case 7:wings= "W";break;
       case 8:wings= "e";break;
       case 9:wings= "E";break;
       case 10:wings= "r";break;
       case 11:wings= "R";break;
       case 12:wings= "t";break;
       case 13:wings= "T";break;
       case 14:wings= "y";break;
       case 15:wings= "Y";break;
       case 16:wings= "u";break;
       case 17:wings= "U";break;
       case 18:wings= "i";break;
       case 19:wings= "I";break;
       case 20:wings= "o";break;
       case 21:wings= "O";break;
       case 22:wings= "p";break;
       case 23:wings= "P";break;
       case 24:wings= "a";break;
       case 25:wings= "A";break;
       case 26:wings= "s";break;
       case 27:wings= "S";break;
       case 28:wings= "d";break;
       case 29:wings= "D";break;
       case 30:wings= "f";break;
       case 31: wings = "F";break;
       case 32: wings = "g";break;
       case 33: wings = "G";break;
       case 34: wings = "h";break;
       case 35: wings = "H";break;
       case 36: wings = "j";break;
       case 37: wings = "J";break;
       case 38: wings = "k";break;
       case 39: wings = "K";break;
       case 40: wings = "l";break;
       case 41: wings = "L";break;
       case 42: wings = ";";break;
       case 43: wings = ":";break;
       case 44: wings = "z";break;
       case 45: wings = "Z";break;
       case 46: wings = "x";break;
       case 47: wings = "X";break;
       case 48: wings = "c";break;
       case 49: wings = "C";break;
       case 50: wings = "v";break;
       case 51: wings = "V";break;
       case 52: wings = "b";break;
       case 53: wings = "B";break;
       case 54: wings = "n";break;
       case 55: wings = "N";break;
       case 56: wings = "m";break;
       case 57: wings = "M";break;
       case 58: wings = ",";break;
       case 59: wings = ".";break;
       case 60: wings = "?";break;
       case 61: wings = " ";break;          
      
    	   
       }
       magic+=wings;
       // all encryption is now in wings string
       }
       //printing it..
       FileWriter fw = new FileWriter("SuperSecretStuff.txt");
       PrintWriter pw = new PrintWriter(fw);
       pw.println(magic);
       pw.close();
   //while loop for logging in with scanner etc...
       String username="";
       String password="";
       String admin="admin";
      Scanner Mohammad=new Scanner(System.in);
      System.out.println("Enter Username: ");
       username=Mohammad.nextLine();
       System.out.println("Enter Password: "); 
      password=Mohammad.nextLine();
       
      
      while(!(password.contentEquals(admin))||!(username.contentEquals(admin)))
	   {
    	 System.out.println("Access Denied.") ;
    	 System.out.println("Enter Username: ");
         username=Mohammad.nextLine();
         System.out.println("Enter Password: "); 
        password=Mohammad.nextLine();
	   }
	  
      
      if(password.contentEquals(admin)&&username.contentEquals(admin))
	  {
		 
    	  //changing every encrypted letter into number by same switch and for loops
    	  
    	  double laban=0;
		  int l=0;
		  int j=0;
		  char jawad=0;
		  String pewds="";
		  String brofist="";
		  for(int batata=0;batata<=998;batata++)
		  {
			jawad=magic.charAt(batata);
		 switch (jawad)
		 {
		 case '!': j=1; break;
         case '(': j=2; break;
         case ')': j=3; break;
         case 'q': j=4; break;
         case 'Q': j=5; break;
         case 'w': j=6; break;
         case 'W': j=7; break;
         case 'e': j=8; break;
         case 'E': j=9; break;
         case 'r': j=10; break;
         case 'R': j=11; break;
         case 't': j=12; break;
         case 'T': j=13; break;
         case 'y': j=14; break;
         case 'Y': j=15; break;
         case 'u': j=16; break;
         case 'U': j=17; break;
         case 'i': j=18; break;
         case 'I': j=19; break;
         case 'o': j=20; break;
         case 'O': j=21; break;
         case 'p': j=22; break;
         case 'P': j=23; break;
         case 'a': j=24; break;   
         case 'A': j=25; break;
         case 's': j=26; break;
         case 'S': j=27; break;
         case 'd': j=28; break;
         case 'D': j=29; break;
         case 'f': j=30; break;
         case 'F': j=31; break;
         case 'g': j=32; break;
         case 'G': j=33; break;
         case 'h': j=34; break;
         case 'H': j=35; break;
         case 'j': j=36; break;
         case 'J': j=37; break;
         case 'k': j=38; break;
         case 'K': j=39; break;
         case 'l': j=40; break;
         case 'L': j=41; break;   
         case ';': j=42; break;
         case ':': j=43; break;
         case 'z': j=44; break;
         case 'Z': j=45; break;
         case 'x': j=46; break;
         case 'X': j=47; break;
         case 'c': j=48; break;
         case 'C': j=49; break;
         case 'v': j=50; break;
         case 'V': j=51; break;
         case 'b': j=52; break;
         case 'B': j=53; break;
         case 'n': j=54; break;
         case 'N': j=55; break;   
         case 'm': j=56; break;
         case 'M': j=57; break;
         case ',': j=58; break;
         case '.': j=59; break;
         case '?': j=60; break;
         case ' ': j=61; break;
		 }
		
		//critical part where we made laban a double so it can store huge numbers and l an integer to store the smaller integer of decrypted code we desire
		 //then switch statement to change back
		 
		 laban=j+(61*(arrayn.get(batata)));
		 laban=laban/(array1[batata]);
		 l=(int)laban;
		 switch (l)
		 {
		   case 1:pewds= "!";break;
	       case 2:pewds= "(";break;
	       case 3:pewds= ")";break; 
	       case 4: pewds= "q";break;
	       case 5:pewds= "Q";break;
	       case 6:pewds= "w";break;
	       case 7:pewds= "W";break;
	       case 8:pewds= "e";break;
	       case 9:pewds= "E";break;
	       case 10:pewds= "r";break;
	       case 11:pewds= "R";break;
	       case 12:pewds= "t";break;
	       case 13:pewds= "T";break;
	       case 14:pewds= "y";break;
	       case 15:pewds= "Y";break;
	       case 16:pewds= "u";break;
	       case 17:pewds= "U";break;
	       case 18:pewds= "i";break;
	       case 19:pewds= "I";break;
	       case 20:pewds= "o";break;
	       case 21:pewds= "O";break;
	       case 22:pewds= "p";break;
	       case 23:pewds= "P";break;
	       case 24:pewds= "a";break;
	       case 25:pewds= "A";break;
	       case 26:pewds= "s";break;
	       case 27:pewds= "S";break;
	       case 28:pewds= "d";break;
	       case 29:pewds= "D";break;
	       case 30:pewds= "f";break;
	       case 31: pewds = "F";break;
	       case 32: pewds = "g";break;
	       case 33: pewds = "G";break;
	       case 34: pewds = "h";break;
	       case 35: pewds = "H";break;
	       case 36: pewds = "j";break;
	       case 37: pewds = "J";break;
	       case 38: pewds = "k";break;
	       case 39: pewds = "K";break;
	       case 40: pewds = "l";break;
	       case 41: pewds = "L";break;
	       case 42: pewds = ";";break;
	       case 43: pewds = ":";break;
	       case 44: pewds = "z";break;
	       case 45: pewds = "Z";break;
	       case 46: pewds = "x";break;
	       case 47: pewds = "X";break;
	       case 48: pewds = "c";break;
	       case 49: pewds = "C";break;
	       case 50: pewds = "v";break;
	       case 51: pewds = "V";break;
	       case 52: pewds = "b";break;
	       case 53: pewds = "B";break;
	       case 54: pewds = "n";break;
	       case 55: pewds = "N";break;
	       case 56: pewds = "m";break;
	       case 57: pewds = "M";break;
	       case 58: pewds = ",";break;
	       case 59: pewds = ".";break;
	       case 60: pewds = "?";break;
	       case 61: pewds = " ";break;
		 }
		brofist+=pewds;
		  //storing in single string
		  }
		 //last while loop and file and printwriter for logging out...
		  FileWriter fw1= new FileWriter("SuperSecretStuff.txt");
		  PrintWriter pw1= new PrintWriter("SuperSecretStuff.txt");
		  pw1.println(brofist);
	      pw1.close();
	  
	  }
	System.out.println("Logout?: type \"yes\"; otherwise type anything.");	  
    String labne= Mohammad.nextLine();
    while(!(labne.contentEquals("yes")))
    		{
    	System.out.println("Logout?: type \"yes\"; otherwise type anything.");
    	 labne= Mohammad.nextLine();
    		}
  FileWriter fw2= new FileWriter("SuperSecretStuff.txt");
  PrintWriter pw2= new PrintWriter(fw2);  
  if((labne.contentEquals("yes")))
   {
	  pw2.println(magic);
   }
   pw2.close();
    }
		  }
	  
	  
