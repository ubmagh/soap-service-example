package api;

import api.entities.ConvertResult;
import api.entities.SymbolsWrapper;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;


public class ApiService {

    private String apiKey = "ou1rJJ6wvs0FoITAZ2ahmMdv6tM1UGfs";
    private String apiEndPoint = "https://api.apilayer.com/exchangerates_data/";

    private OkHttpClient httpClient;
    private Gson gson ;

    public ApiService(){
         httpClient = new OkHttpClient().newBuilder().build();
         gson = new Gson();
    }


    public SymbolsWrapper getSymbols() throws IOException {
        Request request = new Request.Builder()
                .url( apiEndPoint + "symbols")
                .addHeader("apikey", apiKey)
                .method("GET", null)
            .build();
        Response response = httpClient.newCall(request).execute();
        String json =  response.body().string();
        SymbolsWrapper symbols = gson.fromJson(json, SymbolsWrapper.class);
        return symbols;
    }


    public ConvertResult convert( String from, String to, String amount) throws IOException {
        Request request = new Request.Builder()
                .url( apiEndPoint + "convert?to="+to+"&from="+from+"&amount="+amount)
                .addHeader("apikey", apiKey)
                .method("GET", null)
                .build();
        Response response = httpClient.newCall(request).execute();
        String json =  response.body().string();
        ConvertResult result = gson.fromJson(json, ConvertResult.class);
        return result;
    }

}
