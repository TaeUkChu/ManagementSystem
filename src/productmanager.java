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
		System.out.println("4.��ǰ ���� ");
		System.out.println("������ ��ǰ�� �������ּ���");
		System.out.println("������ �����Ͻðڽ��ϱ�? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
		num = input.nextInt(); 
		continue;
	case 3:
		System.out.println("3.��ǰ ���� ���� ");
		System.out.println("������ ��ǰ�� ����ּ���!");
		System.out.println("������ ��ǰ�� �ɼ��� ����ּ���!");
		System.out.println("-1.��ǰ��: ");
		System.out.println("-2.�������: ");
		System.out.println("-3.����: ");
		System.out.println("�����Ͻðڽ��ϱ�? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
		num = input.nextInt(); 
		continue;
	case 2:
		System.out.println("2.���ο� ��ǰ ������ �������ֻ���! (��ǰ��,������,�������,����) ");
		String A = input.nextLine(); 
		System.out.println("��ǰ��:" + A );
		String B = input.nextLine(); 
		System.out.println("-1.������:" + B);
		String C = input.nextLine(); 
		System.out.println("-2.�������: " + C);
		String D = input.nextLine(); 
		System.out.println("-3.����: " + D);
		
		System.out.println("��ǰ��:" + A );
		System.out.println("-1.������:" + B);
		System.out.println("-2.�������: " + C);
		System.out.println("-3.����: " + D);
		System.out.println("�����Ͻðڽ��ϱ�? (O)or(X)");
		System.out.println("*****************************");
		System.out.println("1-5�߿� �ɼ��� ������ �ּ���");
		num = input.nextInt(); 
		continue;
	case 1:
		System.out.println("1.������ ��ǰ ����! (����)");
		System.out.println("��ټ� 1.5L");
		System.out.println("-1.������:����Ư����ġ�����߰���");
		System.out.println("-2.������� :2021.10.31");
		System.out.println("-3.���� :1200��");
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
