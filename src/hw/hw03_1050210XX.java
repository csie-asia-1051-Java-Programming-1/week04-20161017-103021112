package hw;

import java.util.Scanner;
public class hw03_1050210XX {
public static void main(String args[]) 
{ 
	Scanner scn=new Scanner(System.in);
	int i,z=0,x=0,c=0,a=0;
	do
	{
		System.out.print("�п�J���N����Ʃέt��Ʃ�0�G"); 
		i=scn.nextInt();
	
	    		
		if(i>z)
		{
			x++;
			
		}
		else if(i<z)
		{
			c++;
			
		}
		else if(i==z)
		{
			a++;
			
		}
		 
	}		
	    while(i!=999);
	System.out.println("����Ʀ�"+x+"��"); 
	System.out.println("�t��Ʀ�"+c+"��"); 
	System.out.println("0��"+a+"��");
	}
}
