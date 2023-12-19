import com.apollographql.apollo.ApolloClient;
import okhttp3.OkHttpClient;

public class ApolloConfig {

    private static final String BASE_URL = "URL_DE_TU_MICROSERVICIO_GRAPHQL";

    public static ApolloClient createApolloClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();

        return ApolloClient.builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient)
                .build();
    }
}
