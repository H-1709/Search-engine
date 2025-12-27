package app;

import api.SearchController;
import index.InvertedIndex;
import model.Document;
import service.SearchService;

public class Main {
    public static void main(String[] args) {
        InvertedIndex index = new InvertedIndex();

        index.addDocument(new Document(1, "Java is fast and powerful"));
        index.addDocument(new Document(2, "Search engines use inverted index"));
        index.addDocument(new Document(3, "React frontend connects to Java backend"));

        SearchService service = new SearchService(index);
        SearchController.start(service);

        System.out.println("Search Engine running on http://localhost:4567");
    }
}
