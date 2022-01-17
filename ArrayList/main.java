package ArrayList;

import java.util.*;

public class main {
    public static void generaProductos(ArrayList<productos> lista){
        int numeroProducto = numerosAleatorios.generaNumeroAleatorio(1, 8);
        int cantidad;
        double precio;     
        for (int i=0;i<numeroProducto;i++){
            cantidad = numerosAleatorios.generaNumeroAleatorio(1, 10);
            precio = numerosAleatorios.generaNumeroRealAleatorio(0.5, 50.1);           
            lista.add(new productos(cantidad,precio));
        }             
    }
    
    public static void main(String[] args){
        
        ArrayList<productos> producto = new ArrayList<>();
        
        generaProductos(producto);
        double precioTotal = 0;
        productos productoActual;
        Iterator<productos> it = producto.iterator();
        for (int i=0;it.hasNext();i++){
            productoActual = it.next();
            precioTotal += productoActual.precioFinal();
            System.out.println("Producto "+(i+1));
            System.out.println("Cantidad: " + productoActual.getCantidad());
            System.out.println("Precio: " + productoActual.getPrecio());
            System.out.println("Precio Final Producto: " + productoActual.precioFinal());
        }
        System.out.println("Precio Total Final: " + precioTotal);     
    }
}
