package daily0426;

import java.math.BigInteger;
import java.util.Scanner;

public class InputClass {

	static Scanner scan = new Scanner(System.in);

	public static int inputType() {
		int type;

		while (true) {
			System.out.println("������ �����ϼ���.\n1. �ְ���\n2. �߰���");
			type = scan.nextInt();
			if (type != 1 && type != 2) {
				System.out.println("��ȿ�� ���ڸ� �Է��ϼ���.");
			} else {
				return type;
			}
		} 
	}

	public static int inputAge() {
		long address; // �ֹι�ȣ
		int age; // ����

		Calculator c = new Calculator();

		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���.");

			address = scan.nextLong(); 

			if (address > 9999999999999L || address < 1000000000000L) {
				System.out.println("��ȿ�� ��ȣ�� �Է��ϼ���.");
			} else {
				break;
			}
		}
		
		age = c.calcAge(address);
		return age;
	}
	
	public static int inputNum() {
		int num;
		
		while (true) {
			System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
			num = scan.nextInt();

			if (num > 10 || num < 1) {
				System.out.println("��ȿ�� ���� �Է��ϼ���.");
			} else {
				return num;
			}
		}
	}
	
	public static int inputPrefer() {
		int prefer;
		
		while(true) {
			System.out.println("�������� �����ϼ���.\n1. ���� (���� ���� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��");
			prefer = scan.nextInt();
			
			if(prefer < 1 || prefer > 5) {
				System.out.println("��ȿ�� ���ڸ� �Է��ϼ���.");	
			}
			else return prefer;
		}
	}

	public static void input() {
		
		int type; // ����
		int age; // ����
		int num; // Ƽ�� ����
		int prefer; // ������

		type = inputType();

		age = inputAge();
		
		num = inputNum();

		prefer = inputPrefer();
		
		TicketInfo t = new TicketInfo(type, age, num, prefer);
	}

	public static int checkNext() {

		while (true) {
			System.out.println("�� �� �� �����Ͻðڽ��ϱ�? (yes: 1, no: 0)");
			int choice = scan.nextInt();

			if (choice != 0 && choice != 1) {
				System.out.println("��ȿ�� ���� �Է��ϼ���.");
			} else {
				return choice;

			}
		}
	}
}
