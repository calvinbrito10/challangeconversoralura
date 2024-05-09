package controller;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.ApiConversionModel;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class DirectConvertion {
    private ApiConversionModel apiConversionModel;
    private String apiKey;

    public DirectConvertion(String apiKey) {
        this.apiKey = apiKey;
    }

    //Utiliza recurso oferecido pela API para conversão direta
    public double amountConverted (String amount, String fromCurrence, String toCurrence) {
        try {
            HttpClient client = HttpClient.newBuilder()
                    .build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI
                            .create("https://v6.exchangerate-api.com/v6/"+ apiKey +"/pair/"+ fromCurrence +"/"+ toCurrence +"/"+ amount))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
            apiConversionModel = gson.fromJson(json, ApiConversionModel.class);
            System.out.println(apiConversionModel.toString());
            return apiConversionModel.conversionResult();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }



        return 0;
    }

    public ApiConversionModel getApiConversionModel() {
        return apiConversionModel;
    }

    public abstract void convert ();
}
