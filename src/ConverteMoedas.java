import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverteMoedas {
    public DadosConversao fazConversao(String moedaBase, String moedaAlvo, double quantidade) {
        String endereco = "https://v6.exchangerate-api.com/v6/3a92391e522392fe231b01b1/pair/"
                            + moedaBase + "/" + moedaAlvo + "/" + quantidade;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse
                            .BodyHandlers.ofString());
            String json = response.body();
            return new Gson().fromJson(json, DadosConversao.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui fazer a conversão!");
        }
    }
}
