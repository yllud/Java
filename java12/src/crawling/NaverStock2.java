package crawling;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverStock2 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); //html코드를 다 가지고온다.!
			Elements codeList = doc.select(".code"); 
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
			System.out.println(list.size());
			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + ": " + list.get(i));
			}
			System.out.println();
			System.out.println(list.get(12));
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			
			
			System.out.println(list.get(20));
			Element tag3 = list.get(20);
			String low = tag3.text();
			System.out.println("최저가 " + low);
			
			System.out.println(list.get(16));
			Element tag4 = list.get(16);
			String high = tag4.text();
			System.out.println("최고가 " + high);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
