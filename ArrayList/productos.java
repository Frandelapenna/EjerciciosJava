package ArrayList;

public class productos {
    int cantidad;
    double precio;
    String nombre;

    public productos(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
    
    public double precioFinal(){
        return this.precio*this.cantidad;
    } 
}
