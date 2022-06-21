package javase.test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class UNPKGDownLoad {
//    static String fileP = "/Users/lxzz24/Documents/themes/emoji/tw-weather/";
//    static String urlP = "https://unpkg.com/browse/@waline/emojis@1.0.1/tw-weather/";
//    static String urlF = "https://unpkg.com/@waline/emojis@1.0.1/tw-weather/";
    static String fileP = "/Users/lxzz24/Documents/themes/emoji/tw-weather/";
    static String urlP = "https://cdn.jsdelivr.net/gh/walinejs/emojis@1.0.1/tw-weather/";
    static String urlF = "https://cdn.jsdelivr.net/gh/walinejs/emojis@1.0.1/tw-weather/";
    public static void main(String[] args){
        try {
            GetPage("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("done ......");
    }
    static void GetPage(String after) throws Exception {
        System.out.println(urlP + after);
        new File(fileP + after).mkdir();
        HttpURLConnection http = (HttpURLConnection) (new URL(urlP + after)).openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3562.0 Safari/537.36");
        http.connect();
        if(http.getResponseCode() == 200) {
            InputStream inputStream = http.getInputStream();
            byte [] buffer = new byte[10240];
            ArrayList<byte []> byteList = new ArrayList<>();
            ArrayList<Integer> byteLength = new ArrayList<>();
            int length;
            int totalLength = 0;
            while( (length = inputStream.read(buffer)) != -1 ) {
                byteList.add(buffer);
                byteLength.add(length);
                totalLength += length;
                buffer = new byte[10240];
            }
            http.disconnect();
            byte [] all;
            all = new byte[totalLength];
            totalLength = 0;
            while(byteList.size() != 0) {
                System.arraycopy(byteList.get(0), 0, all, totalLength, byteLength.get(0));
                totalLength += byteLength.get(0);
                byteList.remove(0);
                byteLength.remove(0);
            }
            String content = new String(all, StandardCharsets.UTF_8);
            all = null;
            content = content.split("tbody")[1];
            String [] us = content.split("href=\"");
            for(int i = 1; i < us.length; i ++) {
                String href = us[i].split("\"", 2)[0];
                if(href.equals("../")) {
                    continue;
                }
                if(href.charAt(href.length() - 1) == '/') {
                    GetPage(after + href);
                } else {
                    //下载文件，失败重试，大部分是网络原因
                    try {
                        GetFile(after + href);
                    }catch (Exception e){
                        System.out.println(after + href + " 下载失败，重试");
                        GetFile(after + href);
                    }
                }
            }
        } else {
            GetPage(after);
        }
    }
    static void GetFile(String url) throws Exception{
        System.out.println(url);
        HttpURLConnection http;
        http = (HttpURLConnection) (new URL(urlF + url)).openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3562.0 Safari/537.36");
        http.connect();
        if(http.getResponseCode() == 200) {
            InputStream inputStream = http.getInputStream();
            byte [] buffer = new byte[10240];
            ArrayList<byte []> byteList = new ArrayList<>();
            ArrayList<Integer> byteLength = new ArrayList<>();
            int length;
            int totalLength = 0;
            while( (length = inputStream.read(buffer)) != -1 ) {
                byteList.add(buffer);
                byteLength.add(length);
                totalLength += length;
                buffer = new byte[10240];
            }
            http.disconnect();
            byte [] all;
            all = new byte[totalLength];
            totalLength = 0;
            while(byteList.size() != 0) {
                System.arraycopy(byteList.get(0), 0, all, totalLength, byteLength.get(0));
                totalLength += byteLength.get(0);
                byteList.remove(0);
                byteLength.remove(0);
            }
            File f = new File(fileP + url.replaceAll("/", "\\\\"));
            //文件存在，不重复下载
            if(f.exists()){
                System.out.println(f.getAbsoluteFile() + " 存在");
                return;
            }
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f, false);
            fos.write(all);
            fos.flush();
            fos.close();
        } else {
            GetFile(url);
        }
    }
}


