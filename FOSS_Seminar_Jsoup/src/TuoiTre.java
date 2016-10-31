import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TuoiTre {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://tuoitre.vn/").get();
		Element element = doc.getElementsByClass("list-news").first();
		System.out.println(element);
		Elements elements = element.children();
		for (Element e : elements) {
			System.out.println(e.getElementsByTag("a").first().attr("href"));
			;
		}

	}
}
