/*
 * 객체 정렬하기
 * 1. 배열 정리하기	
 *  - Arrays.sort()
 *  - Comparable interface 를 재정의해야
 *  - compareTo()
 * 2. Collection 정렬하기 
 *  - Collections.sort()
 *  - Comparator
 */

package 성적관리프로그램;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	private List<Student> list;

	public Sort(List<Student> list) {
		this.list = list;
	}
	
	public void sort() {
		Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student front, Student back) {
//				return back.getTot() - front.getTot();
				return front.getName().compareTo(back.getName());
			}
		});
	}
/*
	public void sort() {
		Collections.sort(this.list, new MyComparator());
	}

	class MyComparator implements Comparator<Student>{

		@Override
		public int compare(Student front, Student back) {
			return back.getTot() - front.getTot();
		}
	}	*/
}