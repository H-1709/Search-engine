package service;

import index.InvertedIndex;
import java.util.Set;

public class SearchService {

    private InvertedIndex index;

    public SearchService(InvertedIndex index) {
        this.index = index;
    }

    public Set<Integer> search(String keyword) {
        return index.search(keyword);
    }
}
