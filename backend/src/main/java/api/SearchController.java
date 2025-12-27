package api;

import service.SearchService;
import static spark.Spark.*;
import com.google.gson.Gson;

public class SearchController {

    public static void start(SearchService service) {

        // CORS (MANDATORY for frontend)
        before((req, res) -> {
            res.header("Access-Control-Allow-Origin", "*");
            res.header("Access-Control-Allow-Methods", "GET");
        });

        get("/search", (req, res) -> {
            String query = req.queryParams("q");
            res.type("application/json");
            return new Gson().toJson(service.search(query));
        });
    }
}
