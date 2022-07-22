
package ventas;

import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto ("Camisa", 50);
        Producto producto2 = new Producto ("Pantalon", 100);
        
        // Crear objeto tipo orden
        Orden orden1 = new Orden ();
        
        // Agregar los productos al objeto orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        // Imprimir orde
        orden1.mostrarOrden();
    }
    
}
