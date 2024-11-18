import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class ConsoleFunctions{

    static void printTitles(JsonResponse json){
        for (int i=0; i<json.getQuery().getSearch().size(); i++){
            System.out.println(i+1 + ". " +json.getQuery().getSearch().get(i).getTitle());
        }
    }

    static String readQuery() throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите запрос: ");
        String query = scanner.nextLine();
        query = URLEncoder.encode(query, StandardCharsets.UTF_8);
        return query;
    }
}
