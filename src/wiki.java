import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class wiki{

    static StringBuilder request(String query) throws IOException {

        String website = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=" + query;

        HttpURLConnection connection = (HttpURLConnection) new URL(website).openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            content.append(line);
        }

        in.close();
        connection.disconnect();

        return content;
    }

    static void open_website(JsonResponse json) throws IOException {

        System.out.print("Введите № запроса: ");
        Scanner scanner = new Scanner(System.in);

        int pageid = json.getQuery().getSearch().get(scanner.nextInt()-1).getPageid();
        Desktop desk = Desktop.getDesktop();

        URI uri = null;

        String website = "https://ru.wikipedia.org/w/index.php?curid=" + pageid;

        try {
            uri = new URI(website);
        } catch (URISyntaxException e) {
            System.out.println("uri error: " + e.getMessage());
        }

        desk.browse(uri);
    }

    
}
