package HomeWork05;

public class EasySearchDecorator implements ISearchEngine {

    private EasySearch easySearch;

    public EasySearchDecorator(EasySearch easySearch) {
        this.easySearch = easySearch;
    }

    @Override
    public long search(String text, String word) {
        return this.easySearch.search(text.toLowerCase(), word.toLowerCase());
    }
}
