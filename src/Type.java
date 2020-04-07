import java.util.Scanner;

public class Type {
	Product product;
	Scanner input;
	Type(Scanner input){
		this.input=input;
	}
	
	public void ch1() {
		System.out.println("확인할 상품의 번호를 입력해주세요");
		int Num = input.nextInt();
		if (Num == product.N)
		product.productinfo();
		
	}
	public void ch2() {
		
		System.out.println("(2)새로운 물품 정보를 기입해주새요! (상품번호,상품명,제조사,유통기한,가격) ");
		System.out.print("1.상품 번호:" );
		product.N = input.nextInt(); 
		System.out.print("2.상품명:" );
		product.name = input.nextLine();
		System.out.print("3.제조사:" );
		product.menufacturer = input.nextLine();
		System.out.print("4.유통기한: ");
		product. timelimit = input.nextLine();
		System.out.print("5.가격: ");
		product.price = input.nextInt(); 
		
		System.out.print("1.상품 번호:" + product.N);
		System.out.println("2.상품명:" + product.name );
		System.out.println("3.제조사:" + product.menufacturer);
		System.out.println("4.유통기한: " + product.timelimit);
		System.out.println("5.가격: " + product.price);
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
		
	}
	public void ch3() {
		
		System.out.println("(3)상품 정보 수정 ");
		System.out.println("변경할 상품 번호를 골라주세요!");
		System.out.println("변경할 상품의 옵션을 골라주세요!");
		
		System.out.println("1.상품 번호: ");
		System.out.println("2.상품명: ");
		System.out.println("3.제조사: ");
		System.out.println("4.유통기한: ");
		System.out.println("5.가격: ");
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
	}
	public void ch4() {
		
		System.out.println("(4)상품 삭제 ");
		System.out.println("삭제할 상품 번호를 입력해주세요");
		int delproduct = input.nextInt();
		if (product == null) {
			System.out.println("삭제되지 않았습니다");
			System.out.println("*****************************");
			System.out.println("1-5중에 옵션을 선택해 주세요");
			return ;
		}
		else if (product.N == delproduct) {
			System.out.println("진짜로 삭제하시겠습니까? (o)or(x)");
			System.out.println("삭제되었습니다");
			product = null;
		}
		System.out.println("*****************************");
		System.out.println("1-5중에 옵션을 선택해 주세요");
}
}