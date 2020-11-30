package HomeWork06;

import HomeWork05.EasySearch;
import HomeWork05.EasySearchDecorator;
import HomeWork05.ISearchEngine;

import java.util.concurrent.Callable;

public class SearchDecoratorCallableTask implements Callable<Long> {

    private final String text;

    private final String word;

    public SearchDecoratorCallableTask(String text, String word) {
        this.text = text;
        this.word = word;
    }

    @Override
    public Long call() throws Exception {
        ISearchEngine searchEngine = new EasySearchDecorator(new EasySearch());
        return searchEngine.search(text, word);
    }
}
