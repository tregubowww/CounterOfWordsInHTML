package classes;

public class Application {
    public static void main(String[] args) {

        CounterOfWordsInHTML counterOfWordsInHTML1 =
                new CounterOfWordsInHTML("http://o-kuban.ru/", "C:\\unique_words_searcher\\src\\main\\resources\\page1.html");
        CounterOfWordsInHTML counterOfWordsInHTML2 =
                new CounterOfWordsInHTML("https://www.google.com/", "C:\\unique_words_searcher\\src\\main\\resources\\page2.html");
        CounterOfWordsInHTML counterOfWordsInHTML3 =
                new CounterOfWordsInHTML("https://yandex.ru/", "C:\\unique_words_searcher\\src\\main\\resources\\page3.html");

        counterOfWordsInHTML1.printQuantityOfWordsInHTML();

    }
}
