package crawling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NaverStockSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 320);
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 30);

		JButton b1 = new JButton("samsung");
		JButton b2 = new JButton("  kakao  ");
		JButton b3 = new JButton("  naver  ");
		JButton b4 = new JButton("start crawling");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b1.setBackground(Color.blue);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.green);
		b4.setBackground(Color.red);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 삼성전자 코드 주면서 크롤링하는 부품에게 크롤링 요청
				NaverStock3 c = new NaverStock3();
				c.naver("005930");

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 삼성전자 코드 주면서 크롤링하는 부품에게 크롤링 요청
				NaverStock3 c = new NaverStock3();
				c.naver("035720");
				
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 삼성전자 코드 주면서 크롤링하는 부품에게 크롤링 요청
				NaverStock3 c = new NaverStock3();
				c.naver("035420");
			}
		});


		JLabel label = new JLabel("  Code  ");
		label.setFont(font);

		JTextField text = new JTextField(7);
		text.setFont(font);
		
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 삼성전자 코드 주면서 크롤링하는 부품에게 크롤링 요청
				NaverStock3 c = new NaverStock3();
				c.naver(text.getText());
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);

	}

}
