import java.util.Scanner;

public class productmanager {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
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
		System.out.println("4.상품 삭제 ");
		System.out.println("삭제할 상품을 선택해주세요");
		System.out.println("정말로 삭제하시겠습니까? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
		num = input.nextInt(); 
		continue;
	case 3:
		System.out.println("3.상품 정보 수정 ");
		System.out.println("변경할 상품을 골라주세요!");
		System.out.println("변경할 상품의 옵션을 골라주세요!");
		System.out.println("-1.상품명: ");
		System.out.println("-2.유통기한: ");
		System.out.println("-3.가격: ");
		System.out.println("저장하시겠습니까? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
		num = input.nextInt(); 
		continue;
	case 2:
		System.out.println("2.새로운 물품 정보를 기입해주새요! (상품명,제조사,유통기한,가격) ");
		String A = input.nextLine(); 
		System.out.println("상품명:" + A );
		String B = input.nextLine(); 
		System.out.println("-1.제조사:" + B);
		String C = input.nextLine(); 
		System.out.println("-2.유통기한: " + C);
		String D = input.nextLine(); 
		System.out.println("-3.가격: " + D);
		
		System.out.println("상품명:" + A );
		System.out.println("-1.제조사:" + B);
		System.out.println("-2.유통기한: " + C);
		System.out.println("-3.가격: " + D);
		System.out.println("저장하시겠습니까? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
		num = input.nextInt(); 
		continue;
	case 1:
		System.out.println("1.진열된 상품 정보! (예시)");
		System.out.println("삼다수 1.5L");
		System.out.println("-1.제조사:제주특별자치도개발공사");
		System.out.println("-2.유통기한 :2021.10.31");
		System.out.println("-3.가격 :1200원");
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
