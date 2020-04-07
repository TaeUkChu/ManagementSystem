
public class Product {
	int N ;
	String name ;
	String menufacturer ;
	String timelimit ;
	int price ;
	
	
	public Product(int N ,String name,String menufacturer,String timelimit,int price) {
		this.N = N;
		this.name = name;
		this.menufacturer=menufacturer;
		this.timelimit = timelimit;
		this.price = price;
		
	}
	public void productinfo() {
		System.out.println("상품번호 :" + N);
		System.out.println("상품명 :" + name);
		System.out.println("제조사 :" + menufacturer);
		System.out.println("유통기한 :" + timelimit);
		System.out.println("가격 :" + price);
		
	}
	}


