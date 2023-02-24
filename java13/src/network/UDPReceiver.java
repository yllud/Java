package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 1. 받을 소켓이 있어야함 (port)
		DatagramSocket socket=new DatagramSocket(8888);
		System.out.println("wait receiving...");
		
		// 2. 패킷을 받기 때문에 빈 패킷을 만들어두자,
		//	  빈 패킷안에는 빈 byte[]가 있어야 한다.
		byte[] data=new byte[256];
		DatagramPacket packet= new DatagramPacket(data, data.length);
		
		// 3. 소켓 받아서 빈 패킷에 넣는다.
		socket.receive(packet);
		
		// 4. byte[]에 있는 String으로 바꾸어준다.
		System.out.println("receive data: "+new String(data));
		socket.close();
		
	}

}
