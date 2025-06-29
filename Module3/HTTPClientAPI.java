import java.net.URI; import java.net.http.HttpClient; import java.net.http.HttpRequest; import java.net.http.HttpResponse;

public class HTTPClientAPI {
    public static void main(String[] args) {
        HttpClient sparkFetchEngine = HttpClient.newHttpClient();
        HttpRequest rippleRequest = HttpRequest.newBuilder().uri(URI.create("https://www.github.com")).build();
        sparkFetchEngine.sendAsync(rippleRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();
    }
}
