package index;

import model.Document;
import java.util.*;

public class InvertedIndex {

    private Map<String, Set<Integer>> index = new HashMap<>();

    public void addDocument(Document doc) {
        String[] words = doc.getContent()
                            .toLowerCase()
                            .split("\\W+");

        for (String word : words) {
            index
                .computeIfAbsent(word, k -> new HashSet<>())
                .add(doc.getId());
        }
    }

    public Set<Integer> search(String keyword) {
        return index.getOrDefault(keyword.toLowerCase(), new HashSet<>());
    }
}
