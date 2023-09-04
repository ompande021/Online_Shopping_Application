package OnlineMarket;

public class UserParameter 
{
	//For User
		private String purchasedProduct;
		private int purchasedQty;
		private double purchasePrice;
		
		public String getPurchasedProduct()
		{
			return purchasedProduct;
		}
		public void setPurchasedProduct(String purchasedProduct)
		{
			this.purchasedProduct=purchasedProduct;
		}
		public int getPurchasedQty() 
		{
			return purchasedQty;
		}
		public void setPurchasedQty(int purchasedQty) 
		{
			this.purchasedQty = purchasedQty;
		}
		
		public double getPurchasePrice() {
			return purchasePrice;
		}
		public void setPurchasePrice(double purchasePrice) {
			this.purchasePrice = purchasePrice;
		}
		
		public UserParameter(String purchasedProduct, int purchasedQty,double purchasePrice)
		{
			this.purchasedProduct=purchasedProduct;
			this.purchasedQty=purchasedQty;
			this.purchasePrice=purchasePrice;
		}
		
		public String toString()
		{
			return "Purchased Product:"+purchasedProduct+"  Quantity:"+purchasedQty;
		}

}
