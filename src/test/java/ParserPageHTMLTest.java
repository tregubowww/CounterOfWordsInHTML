import classes.ParserPageHTML;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class ParserPageHTMLTest {
    @Test
    public void CheckParserPage() {
        String pageHTML = "<div class=\"grid_home_posts__media\">\n</div><p>Проверочный текст</p>\n";
        String returnText = "Проверочный текст";
        File newHtmlFile = null;
        try {
            newHtmlFile = File.createTempFile("new", ".html");
            FileUtils.writeStringToFile(newHtmlFile, pageHTML, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ParserPageHTML parserPageHTML = new ParserPageHTML();
        Assert.assertEquals(returnText, parserPageHTML.parsePage(newHtmlFile.getPath()));
    }
}
