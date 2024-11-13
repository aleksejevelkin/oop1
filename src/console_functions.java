import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class console_functions{

    static void print_titles(JsonResponse json){

        for (int i=0; i<json.getQuery().getSearch().size(); i++){
            System.out.println(i+1 + ". " +json.getQuery().getSearch().get(i).getTitle());
        }
    }


    static String read() throws UnsupportedEncodingException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите запрос: ");

        String request = scanner.nextLine();

        request = URLEncoder.encode(request, StandardCharsets.UTF_8);

        return request;
    }

}
