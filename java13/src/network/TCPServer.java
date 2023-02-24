package network;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 1. 승인용 소켓을 만들어주자.
		// 2. 서버는 계속 살아있게 하기 위해 무한루프
		// 3. 요청이 있으면 승인을 해주고, 
		//    통신할 수 있는 소켓을 만들어주자.!
		
		ServerSocket server=new ServerSocket(9100);	//port
		System.out.println("socket start");
		System.out.println("wait connecting...");
		
		int cnt=0;
		while(true) {
			Socket socket=server.accept();	//socket 승인
			cnt+=1;
			System.out.println("number of clients: "+cnt);
			System.out.println("accept..! create socket");
		}
		
	}
}
