import java.util.Scanner;

public class Type {
	Product product;
	Scanner input;
	Type(Scanner input){
		this.input=input;
	}
	
	public void ch1() {
		System.out.println("Ȯ���� ��ǰ�� ��ȣ�� �Է����ּ���");
		int Num = input.nextInt();
		if (Num == product.N)
		product.productinfo();
		
	}
	public void ch2() {
		
		System.out.println("(2)���ο� ��ǰ ������ �������ֻ���! (��ǰ��ȣ,��ǰ��,������,�������,����) ");
		System.out.print("1.��ǰ ��ȣ:" );
		product.N = input.nextInt(); 
		System.out.print("2.��ǰ��:" );
		product.name = input.nextLine();
		System.out.print("3.������:" );
		product.menufacturer = input.nextLine();
		System.out.print("4.�������: ");
		product. timelimit = input.nextLine();
		System.out.print("5.����: ");
		product.price = input.nextInt(); 
		
		System.out.print("1.��ǰ ��ȣ:" + product.N);
		System.out.println("2.��ǰ��:" + product.name );
		System.out.println("3.������:" + product.menufacturer);
		System.out.println("4.�������: " + product.timelimit);
		System.out.println("5.����: " + product.price);
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
		
	}
	public void ch3() {
		
		System.out.println("(3)��ǰ ���� ���� ");
		System.out.println("������ ��ǰ ��ȣ�� ����ּ���!");
		System.out.println("������ ��ǰ�� �ɼ��� ����ּ���!");
		
		System.out.println("1.��ǰ ��ȣ: ");
		System.out.println("2.��ǰ��: ");
		System.out.println("3.������: ");
		System.out.println("4.�������: ");
		System.out.println("5.����: ");
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
	}
	public void ch4() {
		
		System.out.println("(4)��ǰ ���� ");
		System.out.println("������ ��ǰ ��ȣ�� �Է����ּ���");
		int delproduct = input.nextInt();
		if (product == null) {
			System.out.println("�������� �ʾҽ��ϴ�");
			System.out.println("*****************************");
			System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
			return ;
		}
		else if (product.N == delproduct) {
			System.out.println("��¥�� �����Ͻðڽ��ϱ�? (o)or(x)");
			System.out.println("�����Ǿ����ϴ�");
			product = null;
		}
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
}
}