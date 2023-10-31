package microservicio.facturacion.Facturacion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClienteServiceTest {

    @Autowired
    private ClienteService clienteService;

    @Test
    @Transactional
    public void testCrearCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente de prueba");
        cliente.setDireccion("Calle de prueba");
        cliente.setCorreo("cliente_prueba@example.com");

        Cliente clienteGuardado = clienteService.crearCliente(cliente);

        assertNotNull(clienteGuardado);
        assertEquals("Cliente de prueba", clienteGuardado.getNombre());
    }

    @Test
    @Transactional
    public void testObtenerTodosLosClientes() {
        List<Cliente> clientes = clienteService.obtenerTodosLosClientes();
        assertNotNull(clientes);
        assertEquals(1, clientes.size());
    }
}

