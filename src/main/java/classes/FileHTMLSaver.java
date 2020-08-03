package classes;

import interfaces.FileSaver;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FileHTMLSaver implements FileSaver {

    // Сохраняет файл HTML по указанному пути
    @Override
    public boolean saveFile(String addressURL, String toPath) {
        try (BufferedInputStream in = new BufferedInputStream(new URL(addressURL).openStream());
             FileOutputStream out = new FileOutputStream(toPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer, 0, 4096)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace(System.out);
            return false;
        }
    }
}
