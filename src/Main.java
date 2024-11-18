import java.io.IOException;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder content = Wiki.request(ConsoleFunctions.readQuery());

        Gson gson = new Gson();
        JsonResponse json = gson.fromJson(String.valueOf(content), JsonResponse.class);

        ConsoleFunctions.printTitles(json);
        Wiki.openWebsite(json);
    }
}