import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String binary = Integer.toBinaryString(n);
	    
	    int count = 0;
	    int max = 0;
	   
	    for(int i=0;i<binary.length();i++)
	    {
	        if(binary.charAt(i)=='1')
	        {
	           count++;
	        }
           
           else
           {
           if(count>max)
	       {
	            max=count;
	       }
	            count =0;
           }
           
           if(i==binary.length()-1)
           {
               if(count>max)
               {
                   max=count;
               }
           }
	    }
    System.out.println(max);
	}
}
