import java.util.Scanner;

public class productmanager {
  public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	  Type type = new Type(input);
	
	System.out.println("*** Product inventory Manager ***");
	System.out.println("**Choose selection 1-5**");
	System.out.println("1. View Product");
	System.out.println("2. Add New Product");
	System.out.println("3. Edit Product");
	System.out.println("4. Delete Product");
	System.out.println("5. Bye");
	
	int num;
	num = input.nextInt(); 
	
	while(num<5) {  

    switch (num) {
    
	case 4:
		type.ch4();
		num = input.nextInt(); 
		continue;
	case 3:
		type.ch3();
		num = input.nextInt(); 
		continue;
	case 2:
		type.ch2();
		num = input.nextInt(); 
		continue;
	case 1:
		type.ch1();
		System.out.println("(1)진열된 상품 정보! (예시)");
		System.out.println("1.상품번호 1번");
		System.out.println("2.삼다수 1.5L");
		System.out.println("3.제조사:제주특별자치도개발공사");
		System.out.println("4.유통기한 :2021.10.31");
		System.out.println("5.가격 :1200원");
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
		num = input.nextInt(); 
		continue;
	default:
		System.out.println("이용해주셔서 감사합니다!");
		num = input.nextInt(); 
		continue;
    }

}
	System.out.println("이용해주셔서 감사합니다!");
}
  }
