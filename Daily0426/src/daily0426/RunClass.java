package daily0426;

public class RunClass {

	// 1. 인풋을 받음
	// 2. 인풋받은 내용을 저장,* 그것을 리스트로 저장
	// 3. 다음 거래를 할 건지 물어보고 yes 선택시 1번 다시 진행
	// 4. no 선택시 저장했던 리스트 출력
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
