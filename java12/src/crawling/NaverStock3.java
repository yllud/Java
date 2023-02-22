package crawling;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverStock3 {

	public void naver(String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+code2);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); //html코드를 다 가지고온다.!
			Elements codeList = doc.select(".code"); 
//			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
//			System.out.println("코드는 " + code);
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
//			System.out.println(list.size());
//			System.out.println(list);
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(i + ": " + list.get(i));
//			}
//			System.out.println(list.get(12));
			
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			
			
//			System.out.println(list.get(20));
			Element tag3 = list.get(20);
			String low = tag3.text();
			System.out.println("최저가 " + low);
			
//			System.out.println(list.get(16));
			Element tag4 = list.get(16);
			String high = tag4.text();
			System.out.println("최고가 " + high+"\n");
			
			//심화)) 파일에 저장(파일명: 005930.txt)
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2 + "\n");
			file.write(today + "\n");
			file.write(low + "\n");
			file.write(high + "\n");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
