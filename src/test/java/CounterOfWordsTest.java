import classes.CounterOfWords;
import org.junit.Assert;
import org.junit.Test;

public class CounterOfWordsTest {
    @Test
    public void CheckCounterOfWords() {
        String testText = "a, a. a! a? a) a( a; a: a[ a]";
        CounterOfWords counterOfWords = new CounterOfWords();

        Assert.assertEquals(counterOfWords.countWords(testText).get("a"), 10, 1);
    }
}
