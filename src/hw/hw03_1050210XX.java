package hw;

import java.util.Scanner;
public class hw03_1050210XX {
public static void main(String args[]) 
{ 
	Scanner scn=new Scanner(System.in);
	int i,z=0,x=0,c=0,a=0;
	do
	{
		System.out.print("請輸入任意正整數或負整數或0："); 
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
	System.out.println("正整數有"+x+"個"); 
	System.out.println("負整數有"+c+"個"); 
	System.out.println("0有"+a+"個");
	}
}
