package shambhavi;
import java.util.Scanner;

public class electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your Electric Unit:");
		int input= obj.nextInt();
		
		if(input<=100)
		{
			System.out.println("Your bill amount is: "+input*1.2);
		}
		else if(input<=300)
		{
			System.out.println("Your bill amount is: "+100*1.20+(input-100)*2);
		}
		else
		{
			System.out.println("Your bill amount is:"+(100*1.2)+(200*2.0)+(input-300)*3.0);
			
			
		}
		
		

	}

}
