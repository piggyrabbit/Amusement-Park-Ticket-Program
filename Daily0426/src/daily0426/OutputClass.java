package daily0426;

public class OutputClass {

	public static void printResult() {
		
		for (int i = 0; i < TicketList.getCnt(); i++) {
			System.out.print((i+1) + "��° �ŷ� - ");
			System.out.print("����: " + TicketList.getType(i));
			System.out.print(", ����: " + TicketList.getAge(i));
			System.out.print(", ���� ���: " + TicketList.getNum(i));
			System.out.print(", ������: " + TicketList.getPrefer(i));
			System.out.print(", ����: " + TicketList.getPrice(i) + "\n");
			
		}
	}

}
