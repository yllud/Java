package crawling;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverWebtoon {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".menu a"); //<a class="nav">
			System.out.println(list.size());
			Element tag = list.get(2);
			System.out.println(tag.text());
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}