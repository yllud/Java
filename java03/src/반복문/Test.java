package 반복문;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		for (; ;) {//무한루프(반복), while(true)
			System.out.println("잘쓰지 않음");
			String data = JOptionPane.showInputDialog("종료할까요? Y를 입력");
			// == 연산자는 기본데이터만 비교 가능
			// String 부품에서 제공하는 기능을 사용해서 비교해줘야 함.
			if (data.equals("y")) {
				System.out.println("안녕히 가세요!");
				break; //이 break는 for의 브레이크다.
			}
		}
	}

}