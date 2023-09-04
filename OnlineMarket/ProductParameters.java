package OnlineMarket;

public class ProductParameters 
{
	private int productId;
	private String productName;
	private int productQty;
	private double productPrice;
	
	//For Admin
	public int getProductId() 
	{
		return productId;
	}
	public void setProductId(int productId) 
	{
		this.productId = productId;
	}
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public int getProductQty() 
	{
		return productQty;
	}
	public void setProductQty(int productQty) 
	{
		this.productQty = productQty;
	}
	public double getProductPrice() 
	{
		return productPrice;
	}
	public void setProductPrice(double productPrice) 
	{
		this.productPrice = productPrice;
	}
	
	public ProductParameters(int productId, String productName, double productPrice,int qty) 
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty =qty;
	}
	@Override
	public String toString() {
		return "ID:"+productId+"\nProduct Name:"+productName+"\nProduct price:"+productPrice+"\nQantity:"+productQty;
	}
	
}
