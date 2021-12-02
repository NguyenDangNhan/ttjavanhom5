package htmljframe;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SelectorDemo1 {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://sinhvien.uneti.edu.vn/").get();
        // Phần tử <div> đầu tiên có class ="related-container".
        Element div = doc.select("div").first();
        System.out.println(div.text());
        // Danh sách các phần tử <h3>, con trực tiếp của phần tử hiện tại.
        Elements h3Elements = doc.select("> div");
        // Lấy phần tử h3 đầu tiên
        System.out.println(h3Elements.text());
        Elements aElements = doc.select("a");
        // Truy vấn trong danh sách phần tử hiện tại.
        // Các phần tử mà href có chứa từ installing.
        Elements aEclipses = aElements.select("[href*=Installing]");
        Iterator<Element> iterator = aEclipses.iterator();

        while (iterator.hasNext()) {
            Element a = iterator.next();
            System.out.println("Document: "+ a.text());
        }
    }
}
