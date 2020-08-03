import classes.FileHTMLSaver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class FileHTMLSaverTest {
    @Test
    public void checkFileSaved() throws Exception {
        FileHTMLSaver fileSave = new FileHTMLSaver();
        fileSave.saveFile("https://www.google.com/", "test.html");
        Assert.assertTrue(FileUtils.deleteQuietly(new File("test.html")));
    }
}
