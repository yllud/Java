package practice;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Order {
	static int totalCnt;
	static int[] cnt=new int[3];
	static int totalPay;
	final static int[] price = { 7000, 8000, 6000 };
	static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] img = { "006.jpeg", "007.jpeg", "008.jpeg" };
		
		JFrame f = new JFrame();
		f.setSize(350, 350);
		f.setBackground(Color.cyan);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("짬뽕: "+cnt[0]+"개"+"  우동: "+cnt[1]+"개"+"  짜장: "+cnt[2]+"개");

		Font font = new Font("궁서", 1, 15);

		JButton[] btn = new JButton[3];
		btn[0] = new JButton("짬뽕");
		btn[1] = new JButton("우동");
		btn[2] = new JButton("짜장");
		for (int i = 0; i < btn.length; i++) {
			btn[i].setFont(font);
			btn[i].setBackground(Color.red);
			btn[i].setForeground(Color.white);
			f.add(btn[i]);

		}


		JLabel cntText = new JLabel("개수");
		cntText.setFont(font);
		f.add(cntText);

		JLabel cntTotal = new JLabel(totalCnt + "개");
		cntTotal.setFont(font);
		f.add(cntTotal);

		ImageIcon icon = new ImageIcon(img[0]);
		JLabel mid = new JLabel(icon);
		f.add(mid);

		JLabel pay = new JLabel("전체 금액");
		pay.setFont(font);
		f.add(pay);
		
		for (int i = 0; i < btn.length; i++) {
			System.out.println(j);
			
			
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//인덱스로는 구분 안됌, getActioncommand로 문자열 받아와서 구분!!
					String name = e.getActionCommand();
					System.out.println(name);
					int j = 0; //
					if(name.equals("짬뽕")) {
						j = 0; //짬뽕
					}else if (name.equals("우동")) {
						j = 1; //우동
					}else{
						j = 2; //짜장
					}

					cnt[j]++;
					f.setTitle("짬뽕: "+cnt[0]+"개"+"  우동: "+cnt[1]+"개"+"  짜장: "+cnt[2]+"개");
					totalCnt++;
					cntTotal.setText(totalCnt + "개");
					ImageIcon icon = new ImageIcon(img[j]);
					mid.setIcon(icon);
					totalPay += price[j];
					pay.setText("전체 금액: " + totalPay + "원");
					
				}
			});
		}
	
//		btn[0].addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				cnt[0]++;
//				f.setTitle("짬뽕: "+cnt[0]+"개"+"  우동: "+cnt[1]+"개"+"  짜장: "+cnt[2]+"개");
//				totalCnt++;
//				cntTotal.setText(totalCnt + "개");
//				ImageIcon icon = new ImageIcon(img[0]);
//				mid.setIcon(icon);
//				totalPay += price[0];
//				pay.setText("전체 금액: " + totalPay + "원");
//			}
//		});
//
//		btn[1].addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				cnt[1]++;
//				f.setTitle("짬뽕: "+cnt[0]+"개"+"  우동: "+cnt[1]+"개"+"  짜장: "+cnt[2]+"개");
//				
//				totalCnt++;
//				cntTotal.setText(totalCnt + "개");
//				
//				ImageIcon icon = new ImageIcon(img[1]);
//				mid.setIcon(icon);
//				
//				totalPay += price[1];
//				pay.setText("전체 금액: " + totalPay + "원");
//			}
//		});
//
//		btn[2].addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				cnt[2]++;
//				f.setTitle("짬뽕: "+cnt[0]+"개"+"  우동: "+cnt[1]+"개"+"  짜장: "+cnt[2]+"개");
//				totalCnt++;
//				cntTotal.setText(totalCnt + "개");
//				ImageIcon icon = new ImageIcon(img[2]);
//				mid.setIcon(icon);
//				totalPay += price[2];
//				pay.setText("전체 금액: " + totalPay + "원");
//			}
//		});

		f.setVisible(true);

	}

}
