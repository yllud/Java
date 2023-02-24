package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerB extends JFrame {

	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	Date d = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
	String date = sdf1.format(d);
	

	public MessengerB() {
		try {
			socket = new DatagramSocket(5555);
		} catch (SocketException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("Messenger B");
		setSize(500, 500);
		list.setBackground(Color.green);
		list.setEditable(false);
		list.append(date+"\n");
		input.setBackground(Color.pink);

		Font font = new Font("궁서", Font.BOLD, 20);
		list.setFont(font);
		input.setFont(font);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 입력한 값 가져옴=>데이터
				String s = input.getText();

				try {
					// UDP용 소켓
					DatagramSocket socket = new DatagramSocket();

					// UDP용 패킷(데이터, 데이터크기, IP, Port)
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1"); // localhost = 127.0.0.1
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777); // 7777(A)로 가버려

					// 리스트에 올리고, 인풋 초기화
					SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
				    String now = sdf2.format(d);
					list.append(now+"\tme: " + new String(data)+"\n");
					input.setText("");

					// 소켓을 이용해서 패킷을 리시버에게 보냄!
					socket.send(packet);
					socket.close(); // 전화 끊음!
				} catch (SocketException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				//

			}
		});

		setVisible(true);

	}

	public void process() {
		while (true) {
			try {
				// 1. 받을 소켓이 있어야함 (port)
				// DatagramSocket socket=new DatagramSocket(5555); //5555(B)로 받아올거야
				System.out.println("wait receiving...");

				// 2. 패킷을 받기 때문에 빈 패킷을 만들어두자,
				// 빈 패킷안에는 빈 byte[]가 있어야 한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);

				// 3. 소켓 받아서 빈 패킷에 넣는다.
				socket.receive(packet);

				// 4. byte[]에 있는 String으로 바꾸어준다.
				//System.out.println(now);
				SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
			    String now = sdf2.format(d);
				list.append(now+"\tyou: " + new String(data)+"\n");
				// socket.close();
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessengerB b = new MessengerB();
		b.process();

	}

}
