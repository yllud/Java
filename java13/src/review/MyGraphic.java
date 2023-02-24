package review;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("My event");
		f.setSize(200,200);
		JButton b=new JButton("Button");
		
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//처리할 내용
				//인터페이스에 반드시 actionPerformed()를
				//쓰라고 규칙이 정해져있음 이름 바꾸면 x
				System.out.println("button click");
			}
		});
		
		
		
		
		f.add(b);
		f.setVisible(true);
		
	}

}
