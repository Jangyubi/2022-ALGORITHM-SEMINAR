package kimkwan;

import java.util.Scanner;

public class input 
{
	public static void main(String[] args) 
	{
//		Scanner bb = new Scanner(System.in);
//		System.out.print("이름입력:");
//		String a = bb.next();
//		System.out.printf("이름:%s",a);
		while(true)
		{
			Scanner ss = new Scanner(System.in);
			System.out.print("월입력:");
			int a = ss.nextInt();
			switch(a)
			{
			case 2:
				System.out.println("28일입니다");
				break;
			case 4,6,9,11:
				System.out.println("30일입니다.");
				break;
			case 1,3,5,7,8,10,12:
				System.out.println("31일입니다");
			
			}	
				
		}
		
	}
}
