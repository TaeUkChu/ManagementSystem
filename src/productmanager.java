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
		System.out.println("(1)������ ��ǰ ����! (����)");
		System.out.println("1.��ǰ��ȣ 1��");
		System.out.println("2.��ټ� 1.5L");
		System.out.println("3.������:����Ư����ġ�����߰���");
		System.out.println("4.������� :2021.10.31");
		System.out.println("5.���� :1200��");
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
		num = input.nextInt(); 
		continue;
	default:
		System.out.println("�̿����ּż� �����մϴ�!");
		num = input.nextInt(); 
		continue;
    }

}
	System.out.println("�̿����ּż� �����մϴ�!");
}
  }
