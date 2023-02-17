package static_;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int cnt; // 자동 초기화 0

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(300, 200);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", 1, 20);
		Font font2 = new Font("궁서", 1, 100);

		JButton b1 = new JButton("더하기 1");
		b1.setBackground(Color.green);
		f.add(b1);

		JButton b2 = new JButton("0으로 초기화");
		b2.setBackground(Color.blue);
		f.add(b2);

		JButton b3 = new JButton("빼기 1");
		b3.setBackground(Color.green);
		f.add(b3);

		JLabel result = new JLabel();
		result.setText(String.valueOf(cnt));
		result.setFont(font2);
		result.setForeground(Color.red);
		f.add(result);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cnt+=1;
				result.setText(String.valueOf(cnt));
				f.add(result);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cnt=0;
				result.setText(String.valueOf(cnt));
				f.add(result);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cnt-=1;
				result.setText(String.valueOf(cnt));
				f.add(result);
			}
		});

		f.setVisible(true);

	}

}
