package objectMain;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import object.Diary;

public class DiaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setTitle("Diary");
		f.setSize(300, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("궁서", 1, 20);

		JLabel top = new JLabel();
		JLabel id = new JLabel("ID : ");
		JLabel pw = new JLabel("PW : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.jpeg");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.jpg");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.green);
		reset.setBackground(Color.green);

		// 1)button에 액션 기능
		// 2)클릭할떄 "어떤 부품" 처리 할지 "new로 생성"
		// 3)클릭할 때 "어떻게 처리할지" 작성

		reset.addActionListener(new ActionListener() {

			@Override
			// reset을 click 했을 때
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//id, pw text 초기화
				idText.setText(null);
				pwText.setText(null);

			}
		});

		login.addActionListener(new ActionListener() {

			@Override
			// login을 click 했을 때
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//id, pw text 가져오기
				String get_id=idText.getText();
				String get_pw=pwText.getText();
				
				//root 1234인지 비교 success or fail
				if(get_id.equals("root")&&get_pw.equals("1234")) {
					System.out.println("success");
					JOptionPane.showMessageDialog(f,"success");
					f.setVisible(false);
					Diary d=new Diary();
					d.open();
					
				}
				else {
					System.out.println("fail");
					JOptionPane.showMessageDialog(f, "fail");
					
				}
			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);
	}

}
