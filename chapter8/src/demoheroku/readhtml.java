package demoheroku;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class readhtml {
    public static void main(String[] args) throws IOException {
        File htmlFile = new File("C:\\Users\\nhan\\IdeaProjects\\chapter8\\src\\demoheroku\\index.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        String title = doc.title();
        System.out.println("Title : " + title);
        System.out.println("Content:\n");
        System.out.println(doc.toString());
    }
}