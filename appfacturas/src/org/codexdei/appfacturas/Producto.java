package org.codexdei.appfacturas;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private int precioProducto;
    private static int ultimoIdProducto = 1001;

    public Producto() {
        this.idProducto = ++ultimoIdProducto;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return this.precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public static int getUltimoIdProducto() {
        return ultimoIdProducto;
    }

    public static void setUltimoIdProducto(int ultimoIdProducto) {
        Producto.ultimoIdProducto = ultimoIdProducto;
    }
}
