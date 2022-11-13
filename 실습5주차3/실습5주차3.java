package 실습5주차3;
import java.util.Scanner;

public class 실습5주차3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	      int i=0;
	      int n = 0;
	      System.out.println("input num: ");
	      n=input.nextInt();
	      
	      if(n%2==0&&n!=2) {	
	    	  System.out.println("result> "+n);
	    	  for(int a=2;a<=n;a++)
	    	  {
	    		  int b=n-a;	    		  
	    		  if(check(a)&&check(b)&&a<=b)
	    		  {
	    			  System.out.println("= ("+a+" + "+b+")");
	    			  
	    		  }
	    		  
	    	  }
	      }
	      else if(n>2){
	    	  System.out.println("result> error: num is not even");
	      }
	      else {
	    	  System.out.println("result> error: num is equal or smaller than 2");
	      }
	}
	 public static boolean check(int n)
	   {	      
	      for(int i=2;i<n;i++)
	      {
	         if(n%i==0)
	            return false;
	      }
	      return true;
	   }

}
