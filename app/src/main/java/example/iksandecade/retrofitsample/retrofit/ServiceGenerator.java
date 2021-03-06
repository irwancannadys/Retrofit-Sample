package example.iksandecade.retrofitsample.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by
 * Name         : Ihksan Sukmawan
 * Alias        : iksandecade
 * Email        : iksandecade@gmail.com
 * Company      : Meridian.id
 * Date         : 05-Jan-17
 * Project      : MyApplication
 */

public class ServiceGenerator {

    public static final String API_BASE_URL = "http://ibacor.com";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}
