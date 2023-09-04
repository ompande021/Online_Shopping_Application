package Util;

import java.util.Scanner;
import OnlineMarket.MainApp;
import OnlineMarket.ProductParameters;
import OnlineMarket.UserParameter;

public class DataAccessObject 
{
	private static Scanner s2=new Scanner(System.in);
	
	int i=0;
	int count1=0;
	ProductParameters[] productList=new ProductParameters[5];
	ProductParameters product=null;
	
	UserParameter[] buyerList=new UserParameter[5];
	UserParameter buyProduct=null;
	
	
	public void addProduct()
	{
		System.out.println("Do you want add product Y/N");
		String ans=s2.next().charAt(0)+"";
		
		if(ans.equalsIgnoreCase("Y")) 
		{
			System.out.print("Enter Product Id: ");
			int id=s2.nextInt();
			System.out.print("Enter Product Name: ");
			String PName=s2.next();
			System.out.print("Enter Product Price: ");
			double Pprice=s2.nextDouble();
			System.out.print("Enter Product Qty: ");
			int qty=s2.nextInt();
			
			product=new ProductParameters(id,PName,Pprice,qty);
			
			for(;i<productList.length;)
			{
				productList[i]=product;
				System.out.println("Product added successfully");
				i++;
				break;
			}
			if(i>=productList.length)
			{
				System.out.println("We can't add more product..");
			}
			addProduct();
		}
		else
		{
			MainApp.displayOption();
		}
	}
	
	int a=0;
	public void buyProduct()
	{
		System.out.print("Enter product name you want to buy: ");
		String bpdt=s2.next();
		System.out.print("Enter product quantity: ");
		int bqty=s2.nextInt();
		
		
		int count=1;
		boolean status=true;
		while(status) 
		{
			for(int i=0;i<productList.length;i++)
			{	
				if(productList[i]!=null)
				{
					if(productList[i].getProductName().equals(bpdt))
					{
						System.out.println("Product is available..");
						if(productList[i].getProductQty()>=bqty)
						{
							double bprice=productList[i].getProductPrice();
							buyProduct = new UserParameter(bpdt, bqty, bprice);
							buyerList[a]=buyProduct;
							a++;
							count1++;
							int x=productList[i].getProductQty()- bqty;
							productList[i].setProductQty(x);
							status=false;
							break;
						}
						else
						{
							System.out.println("The product quantity is not available right now... \nPlz check available product qyt\n");
							status=false;
							break;
						}
					}
					else
					{
						count++;
					}
				}
				else
				{
					System.out.println("Products are not available rigth now...");
					status=false;
					break;
				}	
			}
			if(count==productList.length)
			{
				System.out.println("This product is not available right now...");
				status=false;
			}
			
		}
		MainApp.displayUserOption();
	}
	
	public void generateBill()
	{	
		double sum=0;
		System.out.println("------------------------------------------");
		System.out.println("No."+"  Product Name"+"  Qty"+"  Price");
		for(int k=0;k<count1;k++)
		{	
			System.out.println(k+"."+"  "+buyerList[k].getPurchasedProduct()+"  "+buyerList[k].getPurchasedQty()+"  "+buyerList[k].getPurchasePrice());
			sum=sum+(buyerList[k].getPurchasePrice()*buyerList[k].getPurchasedQty());
		}
		System.out.println("The total amount: "+sum);
		double withGst=sum*0.18;
		double total=sum+withGst;
		System.out.println("With 18% GST. \nThe payable amount is: "+total);
		System.out.println("------------------------------------------");
		System.out.println();
		MainApp.displayUserOption();
	}

	public void displayProducts() 
	{
		for(int j=0;j<productList.length;j++)
		{
			if(productList[j]!=null)
			{
				System.out.println(productList[j]);
			}
			else
			{
				System.out.println("Product List is empty...");
				break;
			}
			System.out.println();
		}
		MainApp.displayOption();
	}
	
	
	public void displayProductToUser() 
	{
		for(int j=0;j<productList.length;j++)
		{
			if(productList[j]!=null)
			{
				System.out.println(productList[j]);
			}
			else
			{
				System.out.println("Product List is empty...");
				break;
			}
			System.out.println();
		}
		MainApp.displayUserOption();
	}
}
