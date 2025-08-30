import java.util.TreeMap;

public class PhraseAnalyzer {

    static public TreeMap<String, Integer> wordCount(String text) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        String regex = "[\\s\\p{Punct}]+";
        
        String[] words = text.split(regex);

        for (String word: words) {
            word = word.toLowerCase();
            if (!treeMap.containsKey(word)) {
                treeMap.put(word, 1);
            }

            treeMap.put(word, treeMap.get(word) + 1);
        }

        return treeMap;
    }
}