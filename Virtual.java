import java.util.ArrayList;
import java.util.Scanner;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

class CarritoDeCompras {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println(producto.getNombre() + " agregado al carrito.");
    }

    public void mostrarCarrito() {
        System.out.println("\nProductos en el carrito:");
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void pagar() {
        double total = calcularTotal();
        if (total > 0) {
            System.out.println("Total a pagar: $" + total);
            System.out.println("¡Pago realizado con éxito! Gracias por su compra.");
            productos.clear(); // Vaciar el carrito después del pago
        } else {
            System.out.println("El carrito está vacío. No hay nada que pagar.");
        }
    }
}

public class Virtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarritoDeCompras carrito = new CarritoDeCompras();

        // Crear algunos productos disponibles en la tienda
        Producto p1 = new Producto("Laptop", 850.50);
        Producto p2 = new Producto("Smartphone", 500.99);
        Producto p3 = new Producto("Audífonos", 50.00);
        Producto p4 = new Producto("Monitor", 200.00);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Tienda Virtual ---");
            System.out.println("1. Agregar Laptop al carrito ($850.50)");
            System.out.println("2. Agregar Smartphone al carrito ($500.99)");
            System.out.println("3. Agregar Audífonos al carrito ($50.00)");
            System.out.println("4. Agregar Monitor al carrito ($200.00)");
            System.out.println("5. Mostrar carrito");
            System.out.println("6. Pagar");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    carrito.agregarProducto(p1);
                    break;
                case 2:
                    carrito.agregarProducto(p2);
                    break;
                case 3:
                    carrito.agregarProducto(p3);
                    break;
                case 4:
                    carrito.agregarProducto(p4);
                    break;
                case 5:
                    carrito.mostrarCarrito();
                    break;
                case 6:
                    carrito.pagar();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Gracias por visitar la Tienda Virtual.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
