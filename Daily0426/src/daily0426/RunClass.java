package daily0426;

public class RunClass {

	// 1. ��ǲ�� ����
	// 2. ��ǲ���� ������ ����,* �װ��� ����Ʈ�� ����
	// 3. ���� �ŷ��� �� ���� ����� yes ���ý� 1�� �ٽ� ����
	// 4. no ���ý� �����ߴ� ����Ʈ ���
	public static void Run() {
		while (true) {
			InputClass.input();
			
			if(InputClass.checkNext() == 0) {
				break;
			}
		}
		
		OutputClass.printResult();
		
		
	}
}
