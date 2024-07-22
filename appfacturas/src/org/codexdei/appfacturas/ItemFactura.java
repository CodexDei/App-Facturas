package org.codexdei.appfacturas;

public class ItemFactura {
    private Producto producto;
    private int cantidadItem;

    public ItemFactura(Producto producto, int cantidadItem) {
        this.producto = producto;
        this.cantidadItem = cantidadItem;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadItem() {
        return this.cantidadItem;
    }

    public void setCantidadItem(int cantidadItem) {
        this.cantidadItem = cantidadItem;
    }

    public float calcularImporte() {
        return (float)(this.getCantidadItem() * this.producto.getPrecioProducto());
    }
}
