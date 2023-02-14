package object;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Diary {
	
	public void open() {
		JFrame f = new JFrame();
		FlowLayout flow=new FlowLayout();
		f.setLayout(flow);
		f.setTitle("Diary");
		f.setSize(300, 600);
		f.getContentPane().setBackground(Color.yellow);
		
		Font font = new Font("궁서", 1, 20);

		JLabel day = new JLabel("Today date: ");
		JLabel title = new JLabel("Today title: ");
		JLabel content = new JLabel("Today contents : ");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);
		
		JTextArea contentText=new JTextArea(5,10);
		contentText.setFont(font);
		
		JButton save=new JButton("save in diary");
		save.setFont(font);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String getDay=dayText.getText();
				String getTitle=titleText.getText();
				String getContent=contentText.getText();
				String result="Date: "+getDay+"\nTitle: "+getTitle+"\nContent: "+getContent;
				System.out.println(result);
				
				//save file
				//외부 파일, 네트워크 cpu 등 자바에서 연결할 떄
				//아주 위험한 상황이라고 인식
				//그래서 문제 발생시 어떻게 처리할지 "꼭 작성!"
				
				try {
					FileWriter file=new FileWriter(getDay+".txt");
					file.write(result);
					file.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("error");
				}
				
			}
		});
		
		f.add(day); f.add(dayText);
		f.add(title); f.add(titleText);
		f.add(content); f.add(contentText);
		f.add(save);		
		
		
		
		f.setVisible(true);
	}
}
