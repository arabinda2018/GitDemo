package numericalprograms;

public class EcommerceApplicaton {
//build pattern
	public EcommerceApplicaton login() {
		System.out.println("Login to flipkart");
		return this;
	}
	
	public EcommerceApplicaton SearchProduct(String productname,char size) {
		System.out.println("product name "+productname);
		System.out.println("Size :"+size);
		return this;
	}
	public EcommerceApplicaton addTokart(int quantity) {
		System.out.println("quantity"+quantity);
		return this;
	}
	public EcommerceApplicaton buyNow(String address) {
		System.out.println("Entered address :"+address);
		return this;
	}
	
public static void main(String[] args) {
	EcommerceApplicaton ea = new EcommerceApplicaton();
	ea.login().SearchProduct("shirt", 'm').buyNow("Bangalore");
	System.out.println("****************");
	
	ea.addTokart(4).buyNow("hyd");
	System.out.println("*******8");
	
	ea.login().addTokart(7);
}

	
	
}
