package htmljframe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class readhtml {
    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    private String st;
    public String rw() throws IOException {

       try {
           Document doc = Jsoup.connect("https://sinhvien.uneti.edu.vn/").get();
            return doc.toString();
       }
       catch (Exception e)
       {
           return "lỗi";
       }

    }
}