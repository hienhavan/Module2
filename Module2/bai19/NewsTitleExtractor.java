package bai19;//package bai19;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import java.io.IOException;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class HtmlParserExample {
//
//    public static void main(String[] args) {
//        String url = "https://example.com/news"; // Thay th? URL th?c t? ? ?ây
//
//        try {
//            // K?t n?i và t?i n?i dung t? URL
//            Document doc = Jsoup.connect(url).get();
//
//            // S? d?ng Selector c?a Jsoup ?? l?y các ph?n t? HTML ch?a thông tin b?n tin
//            Elements newsElements = doc.select("div.news-item"); // Thay th? b?ng selector th?c t?
//
//            // Regex ?? l?c các tiêu ?? t? các ph?n t? HTML l?y ???c
//            Pattern pattern = Pattern.compile("(<h2>(.*?)</h2>)");
//            Matcher matcher;
//
//            // Duy?t qua t?ng ph?n t? và l?c thông tin
//            for (Element element : newsElements) {
//                String htmlContent = element.html();
//                matcher = pattern.matcher(htmlContent);
//                if (matcher.find()) {
//                    String title = Jsoup.parse(matcher.group(1)).text();
//                    System.out.println("Title: " + title);
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsTitleExtractor {

    public static void main(String[] args) {
        String url = "https://www.24h.com.vn/tin-tuc-quoc-te/f-16-sap-xuat-hien-tren-bau-troi-ukraine-cuoc-choi-co-doi-chieu-c415a1582072.html";

        try {
            String htmlContent = getContentFromUrl(url);
            System.out.println(htmlContent);
            extractAndPrintNewsTitles(htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getContentFromUrl(String urlString) throws IOException {
        URL url = new URL(urlString);
        StringBuilder contentBuilder = new StringBuilder();

        try (Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"))) {
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine());
            }
        }

        return contentBuilder.toString();
    }

    public static void extractAndPrintNewsTitles(String htmlContent) {
        Pattern pattern = Pattern.compile("<h3 class=\"news-item__title\"><a href=\".*?\" title=\"(.*?)\">.*?</a></h3>");
        Matcher matcher = pattern.matcher(htmlContent);

        System.out.println("Danh sach cac ban tin tu trang web:");
        while (matcher.find()) {
            String title = matcher.group(1);
            System.out.println("- " + title);
        }
    }
}
