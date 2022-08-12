package 성적관리프로그램;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		System.out.println(" <<<센텀대학교 성적관리 프로그램>>> ");
		List<Student> list = new ArrayList<Student>(10);
		Input input = new Input(list);
		input.fileInput();
/*		
		Calc calc = new Calc(array);
		calc.calc(count);
		
		Sort sort = new Sort(array, count);
		sort.bubbleSort();
		
		Output output = new Output();
		output.print(array, count);		*/
		System.out.println("성적관리프로그램 끝");
	}
}
