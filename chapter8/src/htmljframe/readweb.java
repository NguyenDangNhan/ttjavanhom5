package htmljframe;

import org.jsoup.Jsoup;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Iterator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class readweb extends readhtml {
    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;
    private JPanel jpane1;
    private JButton Button2;
    private JTextField textField2;
    private JButton ghiDữLiệuRaButton;


    public readweb() throws IOException {


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url=textField1.getText();
                try {
                    Document doc = Jsoup.connect(url).get();
                    textArea1.setText(doc.toString());
                }
                catch (Exception E)
                {
                    textArea1.setText(E.toString());
                }


            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url=textField1.getText();
                String tagName=textField2.getText();
                String a="";
                int sothe=0;
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements aElements = doc.getElementsByTag(tagName);
                    for (Element aElement : aElements) {
                        String href = aElement.attr("href");
                        String src = aElement.attr("src");
                        String text = aElement.text();
                       a=a+"{ "+"\n"+"text: "+text+"\n"+"href: "+href+"\n"+"src: "+src+"\n"+"}"+"\n" ;
                        sothe++;
                    }
                    textArea1.setText("Số thẻ : "+sothe+"\nNội dung : \n"+a);
                }
                catch (Exception E)
                {
                    textArea1.setText(E.toString());
                }
            }
        });

        ghiDữLiệuRaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
                    FileOutputStream fos = new FileOutputStream("F:\\demoreadhtml/mydata1.html");
                    Writer dos = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("F:\\demoreadhtml/mydata1.html"), "UTF-8"));
                    //Bước 2: Ghi dữ liệu


                    dos.write(textArea1.getText());
                    //Bước 3: Đóng luồng
                    fos.close();
                    dos.close();
                    System.out.println("Done!");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JFrame frame= new JFrame("Tao Hoa Don");
                frame.setContentPane(new alert().alert);
                frame.setSize(400,400);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width/2, dim.height/2);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    public static void main(String[] args)throws IOException{
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new readweb().jpane1);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        ;

    }

    private void createUIComponents() {

    }
}
