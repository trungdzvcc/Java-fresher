package Day12.Excercise.CrawlNew;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNew {
    public static void main(String[] args) {
        URL url;

        {
            try {
                //Sử dụng URL của java.net để khởi tạo đường dẫn thư viện nhạc muốn lấy danh sách bài hát
                url = new URL("https://tienphong.vn/");
                //Mở stream và đưa nó vào InputStreamReader
                Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
                scanner.useDelimiter("\\Z");
                String content = scanner.next();
                scanner.close();
                //Xóa tất cả các new line trong content lấy được
                content = content.replaceAll("\\n+", "");
                Pattern p = Pattern.compile("title=\"(.*?)\">") ;
                Matcher m = p.matcher(content);
                while (m.find()) {
                    System.out.println(m.group(1));
                }
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // open the stream and put it into BufferedReader

    }


}
