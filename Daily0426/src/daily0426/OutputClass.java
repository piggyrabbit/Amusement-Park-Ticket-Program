package daily0426;

public class OutputClass {

	public static void printResult() {
		
		for (int i = 0; i < TicketList.getCnt(); i++) {
			System.out.print((i+1) + "번째 거래 - ");
			System.out.print("권종: " + TicketList.getType(i));
			System.out.print(", 나이: " + TicketList.getAge(i));
			System.out.print(", 구매 장수: " + TicketList.getNum(i));
			System.out.print(", 우대사항: " + TicketList.getPrefer(i));
			System.out.print(", 가격: " + TicketList.getPrice(i) + "\n");
			
		}
	}

}
