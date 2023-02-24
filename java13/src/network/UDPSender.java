package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//UDP용 소켓
		DatagramSocket socket=new DatagramSocket();
		
		//UDP용 패킷(데이터, 데이터크기, IP, Port)
		String s="I am a java programmer";	//데이터
		byte[] data=s.getBytes();	//데이터를 바이트로 변환해서 패킷에 넣어줌
		InetAddress ip=InetAddress.getByName("127.0.0.1");	// localhost = 127.0.0.1
		DatagramPacket packet = new DatagramPacket(data,data.length,ip,8888);
		
		//소켓을 이용해서 패킷을 리시버에게 보냄!
		socket.send(packet);
		socket.close();	//전화 끊음!
	}

}
