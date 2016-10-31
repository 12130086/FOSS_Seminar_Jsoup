import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class VietnamWorks {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.vietnamworks.com/Java-Application-Developer+in-ho-chi-minh-v29-en")
				.get();
		Elements elements = doc.getElementsByAttributeValueMatching("class", "col-sm-8 col-sm-pull-3");
		for (Element e : elements) {
			String title = e.child(0).text();
			String info = e.child(4).text();
			System.out.println(title + "\n" + info + "\n");
		}

	}
}
