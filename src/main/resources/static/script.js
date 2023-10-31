const BASE_URL = 'http://localhost:8080'; //Modificar por la base de datos 

function cargarClientes() {
    fetch(`${BASE_URL}/clientes`)
        .then(response => response.json())
        .then(data => {
            const clientesList = document.getElementById('clientesList');
            clientesList.innerHTML = '';

            data.forEach(cliente => {
                const listItem = document.createElement('li');
                listItem.textContent = `Nombre: ${cliente.nombre}, Dirección: ${cliente.direccion}, Correo: ${cliente.correo}`;
                clientesList.appendChild(listItem);
            });
        });
}

function cargarFacturas() {
    fetch(`${BASE_URL}/facturas`)
        .then(response => response.json())
        .then(data => {
            const facturasList = document.getElementById('facturasList');
            facturasList.innerHTML = '';

            data.forEach(factura => {
                const listItem = document.createElement('li');
                listItem.textContent = `Número de Factura: ${factura.numeroFactura}, Fecha: ${factura.fecha}`;
                facturasList.appendChild(listItem);
            });
        });
}

function cargarProductos() {
    fetch(`${BASE_URL}/productos`)
        .then(response => response.json())
        .then(data => {
            const productosList = document.getElementById('productosList');
            productosList.innerHTML = '';

            data.forEach(producto => {
                const listItem = document.createElement('li');
                listItem.textContent = `Nombre: ${producto.nombre}, Precio: ${producto.precio}, Stock: ${producto.stock}`;
                productosList.appendChild(listItem);
            });
        });
}

cargarClientes();
cargarFacturas();
cargarProductos();
