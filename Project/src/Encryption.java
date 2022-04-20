import java.io.*;
import java.util.*;
public class Encryption {

	public static void main(String[] args) throws IOException{
		int i = 0;
		String s = "";
		String[] arr1 = new String[100];
		Scanner scan1 = new Scanner(new File("C:\\Users\\Ghassan\\eclipse-workspace\\Project\\SuperSecretStuff.txt"));
		String S1 = "";
		while(scan1.hasNext()) {
			S1 = S1 + scan1.next() + " ";
		}
		Scanner scan2 = new Scanner(S1);
		scan2.useDelimiter("e");
		while(scan2.hasNext()) {
			s = scan2.next() + "e";
			arr1[i] = s;
			i++;
		}
		arr1[i-1] = s.substring(0, s.length()-2);
		Fibonacci f = new Fibonacci();
		int[] arr2 = f.generate();
		String[] arr3=  new String[100];
		i = 0;
		ArrayList<Integer> arrayn = new ArrayList<Integer>();
		ArrayList<Integer> arrayresult = new ArrayList<Integer>();
		int n = 0;
		int result;
	       for(int b=0; b<=90; b++)
	       {
	       for(int w=0;w<=arr1[b].length()-1;w++)
	       { 
	           switch(arr1[b].charAt(w)) {
	           case '!': i=1; break;
	           case '(': i=2; break;
	           case ')': i=3; break;
	           case 'q': i=4; break;
	           case 'Q': i=5; break;
	           case 'w': i=6; break;
	           case 'W': i=7; break;
	           case 'e': i=8; break;
	           case 'E': i=9; break;
	           case 'r': i=10; break;
	           case 'R': i=11; break;
	           case 't': i=12; break;
	           case 'T': i=13; break;
	           case 'y': i=14; break;
	           case 'Y': i=15; break;
	           case 'u': i=16; break;
	           case 'U': i=17; break;
	           case 'i': i=18; break;
	           case 'I': i=19; break;
	           case 'o': i=20; break;
	           case 'O': i=21; break;
	           case 'p': i=22; break;
	           case 'P': i=23; break;
	           case 'a': i=24; break;   
	           case 'A': i=25; break;
	           case 's': i=26; break;
	           case 'S': i=27; break;
	           case 'd': i=28; break;
	           case 'D': i=29; break;
	           case 'f': i=30; break;
	           case 'F': i=31; break;
	           case 'g': i=32; break;
	           case 'G': i=33; break;
	           case 'h': i=34; break;
	           case 'H': i=35; break;
	           case 'j': i=36; break;
	           case 'J': i=37; break;
	           case 'k': i=38; break;
	           case 'K': i=39; break;
	           case 'l': i=40; break;
	           case 'L': i=41; break;   
	           case ';': i=42; break;
	           case ':': i=43; break;
	           case 'z': i=44; break;
	           case 'Z': i=45; break;
	           case 'x': i=46; break;
	           case 'X': i=47; break;
	           case 'c': i=48; break;
	           case 'C': i=49; break;
	           case 'v': i=50; break;
	           case 'V': i=51; break;
	           case 'b': i=52; break;
	           case 'B': i=53; break;
	           case 'n': i=54; break;
	           case 'N': i=55; break;   
	           case 'm': i=56; break;
	           case 'M': i=57; break;
	           case ',': i=58; break;
	           case '.': i=59; break;
	           case '?': i=60; break;
	           case ' ': i=61; break;
	           }
	           int product = i * arr2[w] ;
	           n = (int)(product/61.0);
	           result = product - 61*n;	   
	           arrayn.add(n);
	           arrayresult.add(result);
	           }       
	       }	    
	       String wings = "";
	       String magic = "";
	       int karim = 0;
	       for(;karim<999;karim++) {
	       switch(arrayresult.get(karim)) {
	       case 1: wings = "!";break;
	       case 2: wings = "(";break;
	       case 3: wings = ")";break; 
	       case 4: wings = "q";break;
	       case 5: wings = "Q";break;
	       case 6: wings = "w";break;
	       case 7: wings = "W";break;
	       case 8: wings = "e";break;
	       case 9: wings = "E";break;
	       case 10:wings = "r";break;
	       case 11:wings = "R";break;
	       case 12:wings = "t";break;
	       case 13:wings = "T";break;
	       case 14:wings = "y";break;
	       case 15:wings = "Y";break;
	       case 16:wings = "u";break;
	       case 17:wings = "U";break;
	       case 18:wings = "i";break;
	       case 19:wings = "I";break;
	       case 20:wings = "o";break;
	       case 21:wings = "O";break;
	       case 22:wings = "p";break;
	       case 23:wings = "P";break;
	       case 24:wings = "a";break;
	       case 25:wings = "A";break;
	       case 26:wings = "s";break;
	       case 27:wings = "S";break;
	       case 28:wings = "d";break;
	       case 29:wings = "D";break;
	       case 30:wings = "f";break;
           case 31:wings = "F";break;
           case 32:wings = "g";break;
           case 33:wings = "G";break;
           case 34:wings = "h";break;
           case 35:wings = "H";break;
           case 36:wings = "j";break;
           case 37:wings = "j";break;
           case 38:wings = "K";break;
           case 39:wings = "K";break;
           case 40:wings = "l";break;
           case 41:wings = "L";break;
           case 42:wings = ";";break;
           case 43:wings = ":";break;
           case 44:wings = "z";break;
           case 45:wings = "Z";break;
           case 46:wings = "x";break;
           case 47:wings = "X";break;
           case 48:wings = "c";break;
           case 49:wings = "C";break;
           case 50:wings = "v";break;
           case 51:wings = "V";break;
           case 52:wings = "b";break;
           case 53:wings = "B";break;
           case 54:wings = "n";break;
           case 55:wings = "N";break;
           case 56:wings = "m";break;
           case 57:wings = "M";break;
           case 58:wings = ",";break;
           case 59:wings = ".";break;
           case 60:wings = "?";break;
           case 61:wings = " ";break;
	       }
	       magic +=wings; 
	       }
	       FileWriter fw = new FileWriter("SuperSecretStuff.txt");
	       PrintWriter pw = new PrintWriter(fw);
	       pw.println(magic);
	       pw.close();
	       
	       String username = "";
	       String password = "";
	       Scanner scanner = new Scanner(System.in);
	       System.out.println("Enter the username: ");
	       username = scanner.nextLine();
	       System.out.println("Enter the password: ");
	       password = scanner.nextLine();
	       while(!username.equals("admin") || !(!password.equals("admin"))) {
	    	   System.out.println("Access denied!!");
	    	   System.out.println("Enter the username: ");
		       username = scanner.nextLine();
		       System.out.println("Enter the password: ");
		       password = scanner.nextLine();	    	   
	       }
	       int batata = 0;
	       int j = 0;
	       int l = 0;
	       for(;batata <= 998;batata++) {
	    	   switch(magic.charAt(batata)) {
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
	           l = j + 61*arrayn.get(batata);
	         //  l = l/arr2[]
	       }
	       
	       
}
}