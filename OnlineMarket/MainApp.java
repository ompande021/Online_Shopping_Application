package OnlineMarket;

import java.util.Scanner;

import Util.DataAccessObject;
public class MainApp {

	private static Scanner s1=new Scanner(System.in);
	
	private static String adName="admin",adPwd="admin123";
	private static String userName="user",userPwd="user123";

	
	static DataAccessObject dao=new DataAccessObject();
	
	public static void main(String[] args) 
	{
		login();
		
	}
	
	static boolean status=true;
	private static void login()
	{
		while(status)
		{
			System.out.println("1. Admin login");
			System.out.println("2. User login");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Enter your choice:");
			int ch=s1.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					AdminDetail();
					break;
				}
				case 2:
				{
					userDetial();
					break;
				}
				case 3:
				{
					System.out.println("Exited....");
					status=false;
					break;
				}
				default:
				{
					System.out.println("You enter invalid option....Try again.");
				}
			}
		}
		
	}
	
	private static void AdminDetail()
	{
		System.out.println();
		System.out.print("Enter Admin Name: ");
		String tempName=s1.next();
		System.out.print("Enter Password: ");
		String tempPwd=s1.next();
		
		if(adName.equals(tempName)&& adPwd.equals(tempPwd))
		{
			System.out.println("Login Successful!..");
			displayOption();
		}
		else
		{
			System.out.println("There is something wrong....\nplz enter valid user name & password");
			AdminDetail();
		}
	}
	
	public static void displayOption()
	{
		System.out.println();
		System.out.println("1. Add Product");
		System.out.println("2. Display Product");
		System.out.println("3. logout");
		System.out.print("Select your option: ");
		int ch1=s1.nextInt();
		switch(ch1)
		{
			case 1:
			{
				dao.addProduct();
				break;
			}
			case 2:
			{
				dao.displayProducts();
				break;
			}
			case 3:
			{
				logout();
			}
			default:
			{
				System.out.println("Your Enter Invalid option");
				displayOption();
				break;
			}
		}
	}
	
	public static void userDetial()
	{
		System.out.println();
		System.out.print("Enter UserName: ");
		String uname=s1.next();
		System.out.print("Enter Password: ");
		String upwd=s1.next();
		
		if(uname.equals(userName) && upwd.equals(userPwd))
		{
			System.out.println("Login successful...");
			displayUserOption();
		}
		else
		{
			System.out.println("There is something wrong....\nplz enter valid user name & password");
			userDetial();
		}
	}
	
	public static void displayUserOption()
	{
		System.out.println();
		System.out.println("1. Display Available Products");
		System.out.println("2. Purchase Products");
		System.out.println("3. Display Bill");
		System.out.println("4. logout");
		System.out.print("Select your option: ");
		int ch1=s1.nextInt();
		switch(ch1)
		{
			case 1:
			{
				dao.displayProductToUser();
				break;
			}
			case 2:
			{
				dao.buyProduct();
				break;
			}
			case 3:
			{
				dao.generateBill();
				break;
			}
			case 4:
			{
				logout();
			}
			default:
			{
				System.out.println("Your Enter Invalid option");
				displayUserOption();
				break;
			}
		}
	}
	
	public static void logout()
	{
		System.out.print("Logout Successfully...");
		System.out.println();
		login();
	}
}
