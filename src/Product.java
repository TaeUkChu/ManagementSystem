
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
		System.out.println("��ǰ��ȣ :" + N);
		System.out.println("��ǰ�� :" + name);
		System.out.println("������ :" + menufacturer);
		System.out.println("������� :" + timelimit);
		System.out.println("���� :" + price);
		
	}
	}


