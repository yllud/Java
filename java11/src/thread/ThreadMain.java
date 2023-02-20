package thread;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadMain extends JFrame{

	JLabel count,image,time;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadMain f= new ThreadMain();
		//객체 생성시 클래스 이름과 동일한 메서드를 자동 호출
		//==>생성자 매서드!를 자동 호출
	}
	
	public ThreadMain() {
		setTitle("my thread graphic");
		setSize(400,250);
		FlowLayout flow= new FlowLayout();
		setLayout(flow);
		Font font=new Font("궁서",Font.BOLD,16);
		
		count=new JLabel("Counter");
		count.setFont(font);
		
		ImageIcon icon=new ImageIcon("1.png");
		image=new JLabel(icon);
		
		time=new JLabel("Time");
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);
		
		//thread 객체 3개 만들어서 start!
		ThreadTimer2 count2=new ThreadTimer2();
		ThreadImage2 image2=new ThreadImage2();
		ThreadCounter2 timer2 = new ThreadCounter2();
		
		count2.start();
		image2.start();
		timer2.start();
		
		setVisible(true);
	}
	
	public class ThreadCounter2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("count=>"+i);
				//cpu에게 스레드 쉬는 시간 텀을 알려줍시다.!!
				//thread를 잠깐 재울 수 있음.
				//cpu는 외부자원입니다. 
				//자바가 외부자원을 연결할 때는 엄청! 위험해!!!라는 상황으로 인식!!
				//만약에 문제가 생기면, 어떻게 할지를 코드를 반드시 해주어야 해ㅏㅁ.
				try {
					Thread.sleep(1000); //1초재워라!
				} catch (Exception e) {
					System.out.println("Cpu error");
				}
			}
		}
	}
	
	public class ThreadImage2 extends Thread {
		@Override
		public void run() {
			String[] images = {
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png",
					"1.png", "2.png", "3.png", "4.png", "5.png"
			};
			for (int i = 0; i < images.length; i++) {
				//System.out.println("Image>> " + images[i]);
				ImageIcon icon2=new ImageIcon((i+1)+".png");
				image.setIcon(icon2);
				try {
					ThreadTimer.sleep(5000); //5초재워라! //ms(밀리세컨즈)
				} catch (Exception e) {
					System.out.println("Error cpu");
				}
			}
		}
	}
	
	public class ThreadTimer2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText("Timer>> " + date);
				try {
					ThreadTimer.sleep(2000); // 2초재워라!
				} catch (Exception e) {
					System.out.println("Error cpu");
				}
			}
		}
	}
}
