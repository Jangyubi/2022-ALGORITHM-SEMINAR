package kimkwan;

import java.util.Scanner;

public class input 
{
	public static void main(String[] args) 
	{
//		Scanner bb = new Scanner(System.in);
//		System.out.print("�̸��Է�:");
//		String a = bb.next();
//		System.out.printf("�̸�:%s",a);
		while(true)
		{
			Scanner ss = new Scanner(System.in);
			System.out.print("���Է�:");
			int a = ss.nextInt();
			switch(a)
			{
			case 2:
				System.out.println("28���Դϴ�");
				break;
			case 4,6,9,11:
				System.out.println("30���Դϴ�.");
				break;
			case 1,3,5,7,8,10,12:
				System.out.println("31���Դϴ�");
			
			}	
				
		}
		
	}
}
