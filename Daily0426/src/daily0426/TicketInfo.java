package daily0426;

public class TicketInfo {
	private int age, num, price; // 나이, 개수, 금액
	private long address; //주민번호
	private String type, prefer; // 권종, 할인
	
	private String[] types = {"", "주간권", "야간권"};
	private String[] prefers = {"", "없음", "장애인", "국가유공자", "다자녀", "임산부"};
	
	TicketInfo(int type, int age, int num, int prefer) {
		this.type = types[type];
		this.age = age;
		this.num = num;
		this.prefer = prefers[prefer];
		this.price = Calculator.calcPrice(type, age, num, prefer);
		
		TicketList.setList(this.type, this.age, this.num, this.prefer, price);
		
	}
}
