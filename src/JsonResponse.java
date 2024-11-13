import java.util.List;

public class JsonResponse {

    private Query query;

    public Query getQuery() {
        return query;
    }

    public static class Query {

        private List<Search> search;

        public List<Search> getSearch() {
            return search;
        }


    }

    public static class Search {
        private String title;
        private int pageid;

        public String getTitle() {
            return title;
        }

        public int getPageid() {
            return pageid;
        }
    }

}
