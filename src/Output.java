
public class Output {
	public void print(Student [] array, int count) {
		this.printLabel();
		for(int i = 0 ; i < count ; i++) {
			System.out.println(array[i]);    //array[i].toString()
		}
	}
	
	private void printLabel() {
		System.out.println("<<<<센텀대학교 성적관리프로그램>>>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점");
		System.out.println("--------------------------------------------------------------------");
	}
}
