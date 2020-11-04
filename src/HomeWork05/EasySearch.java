package HomeWork05;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count = 0L;
        StringBuilder builder = new StringBuilder(text);
        boolean isMatchFound = false;
        boolean beforeWord = false;
        boolean afterWord = false;
        int indexFind = -1;
        int fromIndex = 0;
        do {
            indexFind = text.indexOf(word, fromIndex);
            if(indexFind == -1) {
                isMatchFound = false;
            } else {
                isMatchFound = true;
                fromIndex = indexFind + word.length();

                if(fromIndex >= text.length() - 1) {
                    afterWord = true;
                } else {
                    afterWord = !StringAnalyzer.isValidCharacter(text.charAt(fromIndex));
                }

                if(indexFind == 0) {
                    beforeWord = true;
                } else {
                    beforeWord = !StringAnalyzer.isValidCharacter(text.charAt(indexFind - 1));
                }

                if(beforeWord && afterWord) {
                    count++;
                }
            }
        } while(isMatchFound);

        return count;
    }

}
