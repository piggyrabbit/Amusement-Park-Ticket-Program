package daily0426;

public class TicketInfo {
	private int age, num, price; // ����, ����, �ݾ�
	private long address; //�ֹι�ȣ
	private String type, prefer; // ����, ����
	
	private String[] types = {"", "�ְ���", "�߰���"};
	private String[] prefers = {"", "����", "�����", "����������", "���ڳ�", "�ӻ��"};
	
	TicketInfo(int type, int age, int num, int prefer) {
		this.type = types[type];
		this.age = age;
		this.num = num;
		this.prefer = prefers[prefer];
		this.price = Calculator.calcPrice(type, age, num, prefer);
		
		TicketList.setList(this.type, this.age, this.num, this.prefer, price);
		
	}
}
