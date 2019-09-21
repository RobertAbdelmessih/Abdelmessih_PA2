package Abdelmessih_P1;

import java.util.Scanner;

public class Encrypt_decrypt {

	public static void main(String[] args) {
		
{
		     getnum();       
}  
}	   
    public static int getnum()
{
	 int fourD = 0, stringSize = 0;
		    String fourDs; 
		     
	  var kb = new Scanner(System.in);
	  while (stringSize != 4)
{
		      System.out.println("Enter a four digit number:"); 
		      fourDs = kb.nextLine();
		      stringSize = fourDs.length();
		       
	 if (stringSize == 4)
{
		         
		        fourD = Integer.parseInt(fourDs);
}
}
		    encrypt(fourD);
	 return fourD;
}	 
    public static int encrypt(int num) 
 {
		 int a, b, c, d;
		 
		  a = num / 1000;
		  b = num / 100 % 10;
  	      c = num / 10 % 10;
	      d = num % 10;
		     
		    a = (a + 7)%10;
		    b = (b + 7)%10;
		    c = (c + 7)%10;
		    d = (d + 7)%10;
		     
		    System.out.println(""+a+b+c+d);;
	  return (c+d+a+b); 
 }
 }