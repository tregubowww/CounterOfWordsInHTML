package classes;

import java.util.Map;

public class CounterOfWordsInHTML {
    private String addressURL;
    private String pathForSave;

    public CounterOfWordsInHTML(String addressURL, String pathForSave) {
        this.addressURL = addressURL;
        this.pathForSave = pathForSave;
    }

    /* Метод printQuantityOfWordsInHTML() реализует следующую логику. Скачивает web-страницу, сохраняет ее на жесткий диск.
     Затем текстовый контент, который есть на ней (который видит пользователь на странице браузера),
     разбивает на слова и подсчитывает количество нахождений на странице каждого слова.
     Разделителями слов считает следующие символы: {' ', ',', '.', '!', '?','"', ';', ':', '[', ']', '(', ')', '\n', '\r', '\t'}
     */

    public void printQuantityOfWordsInHTML() {

        boolean isFileSaver = new FileHTMLSaver().saveFile(addressURL, pathForSave);
        if (!isFileSaver) {
            return;
        }
        String text = new ParserPageHTML().parsePage(pathForSave);
        if (!text.isEmpty()) {
            Map<String, Integer> map = new CounterOfWords().countWords(text);
            for (Map.Entry<String, Integer> pair : map.entrySet()
            ) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }
    }
}
