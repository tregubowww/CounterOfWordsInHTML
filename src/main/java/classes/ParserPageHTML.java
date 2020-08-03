package classes;

import interfaces.FileParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class ParserPageHTML implements FileParser {

    //Парсит HTML  файл в  текст (который видит пользователь на странице браузера)
    @Override
    public String parsePage(String path) {
        File htmlFile;
        Document doc;
        try {
            htmlFile = new File(path);
            doc = Jsoup.parse(htmlFile, "UTF-8");
            return doc.text();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return "";
    }
}
