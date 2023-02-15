package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Album {
	//전역 변수 설정
	static int start=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] grade = { 9.28, 9.72, 8.82, 6.62, 8.85 };
		
		JFrame f = new JFrame();
		f.setSize(420, 450);
		f.setTitle("Movie Album");
		f.getContentPane().setBackground(Color.DARK_GRAY);

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel top = new JLabel(title[start]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.LIGHT_GRAY);
		f.add(top, BorderLayout.NORTH);

		JLabel center = new JLabel();
		center.setFont(font);
		center.setHorizontalAlignment(0);
		ImageIcon icon = new ImageIcon(img[start]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);

		JLabel under = new JLabel(String.valueOf(grade[start]));
		under.setFont(font);
		under.setHorizontalAlignment(0);
		under.setForeground(Color.red);
		f.add(under, BorderLayout.SOUTH);
		
		
		JButton left = new JButton("<<");
		left.setFont(font);
		left.setBackground(Color.LIGHT_GRAY);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(start>0) {
					start--;
					top.setText(title[start]);
					under.setText(String.valueOf(grade[start]));
					ImageIcon icon=new ImageIcon(img[start]);
					center.setIcon(icon);
				}
				else {
					JOptionPane.showMessageDialog(f, "first page");
				}
			}
		});
		
		
		JButton right = new JButton(">>");
		right.setFont(font);
		right.setBackground(Color.LIGHT_GRAY);
		//f.add(right, BorderLayout.EAST); 아래랑 같음
		f.getContentPane().add(right,BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(start<4) {
					start++;
					top.setText(title[start]);
					under.setText(String.valueOf(grade[start]));
					ImageIcon icon=new ImageIcon(img[start]);
					center.setIcon(icon);
				}
				else {
					JOptionPane.showMessageDialog(f, "last page");
				}
			}
		});

		
		// 프로그램 끝나면 자동으로 exit
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
