package daily0426;

import java.math.BigInteger;
import java.util.Scanner;

public class InputClass {

	static Scanner scan = new Scanner(System.in);

	public static int inputType() {
		int type;

		while (true) {
			System.out.println("권종을 선택하세요.\n1. 주간권\n2. 야간권");
			type = scan.nextInt();
			if (type != 1 && type != 2) {
				System.out.println("유효한 숫자를 입력하세요.");
			} else {
				return type;
			}
		} 
	}

	public static int inputAge() {
		long address; // 주민번호
		int age; // 나이

		Calculator c = new Calculator();

		while (true) {
			System.out.println("주민번호를 입력하세요.");

			address = scan.nextLong(); 

			if (address > 9999999999999L || address < 1000000000000L) {
				System.out.println("유효한 번호를 입력하세요.");
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
			System.out.println("몇 개를 주문하시겠습니까? (최대 10개)");
			num = scan.nextInt();

			if (num > 10 || num < 1) {
				System.out.println("유효한 값을 입력하세요.");
			} else {
				return num;
			}
		}
	}
	
	public static int inputPrefer() {
		int prefer;
		
		while(true) {
			System.out.println("우대사항을 선택하세요.\n1. 없음 (나이 우대는 자동처리)\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부");
			prefer = scan.nextInt();
			
			if(prefer < 1 || prefer > 5) {
				System.out.println("유효한 숫자를 입력하세요.");	
			}
			else return prefer;
		}
	}

	public static void input() {
		
		int type; // 권종
		int age; // 나이
		int num; // 티켓 개수
		int prefer; // 우대사항

		type = inputType();

		age = inputAge();
		
		num = inputNum();

		prefer = inputPrefer();
		
		TicketInfo t = new TicketInfo(type, age, num, prefer);
	}

	public static int checkNext() {

		while (true) {
			System.out.println("한 번 더 진행하시겠습니까? (yes: 1, no: 0)");
			int choice = scan.nextInt();

			if (choice != 0 && choice != 1) {
				System.out.println("유효한 값을 입력하세요.");
			} else {
				return choice;

			}
		}
	}
}
