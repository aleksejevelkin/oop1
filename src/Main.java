import java.io.IOException;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder content = wiki.request(console_functions.read());

        Gson gson = new Gson();
        JsonResponse json = gson.fromJson(String.valueOf(content), JsonResponse.class);

        console_functions.print_titles(json);

        wiki.open_website(json);
    }
}