import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;


import java.util.List;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    @Autowired
    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<Factura> obtenerTodasLasFacturas() {
        return facturaRepository.findAll();
    }

    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

}

public class FacturaService {

    private final ApolloClient apolloClient;

    public FacturaService(ApolloClient apolloClient) {
        this.apolloClient = apolloClient;
    }

    public void obtenerDatosDesdeOtroMicroservicioGraphQL() {
        apolloClient.query(OtroMicroservicioQuery.builder().build())
                .enqueue(new ApolloCall.Callback<OtroMicroservicioQuery.Data>() {
                    @Override
                    public void onResponse(@NotNull Response<OtroMicroservicioQuery.Data> response) {
                        // Manejar la respuesta aquí
                        OtroMicroservicioQuery.Data data = response.data();
                        // ...
                    }

                    @Override
                    public void onFailure(@NotNull ApolloException e) {
                        // Manejar el error aquí
                    }
                });
    }
}

