package hw;

import java.util.Scanner;
public class hw02_1050210XX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		int i,j,n=1,c=1,z=1;
		System.out.println("�п�J�Ĥ@�ӼƦr");
		i=scn.nextInt();
		System.out.println("�п�J�ĤG�ӼƦr");
		j=scn.nextInt();
		 for(int a=1;a<=i;a++){
			 n=n*a;
		 }
		 for(int b=1;b<=j;b++){
			 c=c*b;
		 }
		int sum=0;
		sum=i-j;
        for(int x=1;x<=sum;x++){
        	z=z*x;
        }
        System.out.println(n/(c*z));
	}

}
