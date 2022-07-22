
package com.gm.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    // Constructor vacio
    private Producto() {
        this.idProducto = ++contadorProductos;
    }
    
    // Constructor sobre cargado de dos argumentos
    public Producto (String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Metodos

    public int getIdProducto() {
        return idProducto;
    }

//    public void setIdProducto(int idProducto) {
//        this.idProducto = idProducto;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

//    public static void setContadorProductos(int contadorProductos) {
//        Producto.contadorProductos = contadorProductos;
//    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
