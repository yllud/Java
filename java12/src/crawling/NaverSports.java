package crawling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con=Jsoup.connect("https://sports.news.naver.com/index");
		System.out.println("success connection");
		
		Document doc=null;
		
		try {
			doc = con.get();
			Elements list=doc.select(".link_lnb");
			
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); //tag추출
				System.out.println(tag1);
				String text1 = tag1.text();
				//<a class="link">메일</a> ==> 태그사이의 텍스트 추출
				System.out.println(text1);

			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
