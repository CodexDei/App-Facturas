package org.codexdei.appfacturas;

import java.util.Date;

public class Factura {
    private int idFactura;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] itemfacturas;
    private String descripcionCompra;
    private int indiceFacturas;
    private static int ultimoIdFactura;
    private static final int MAX_ITEMS = 12;

    public Factura(Cliente cliente, String descripcionProducto) {
        this.cliente = cliente;
        this.descripcionCompra = descripcionProducto;
        this.itemfacturas = new ItemFactura[12];
        this.idFactura = ++ultimoIdFactura;
        this.fecha = new Date();
    }

    public int getIdFactura() {
        return this.idFactura;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItemfacturas() {
        return this.itemfacturas;
    }

    public void addItemfacturas(ItemFactura itemfacturas) {
        if (this.indiceFacturas < 12) {
            this.itemfacturas[this.indiceFacturas++] = itemfacturas;
        }

    }

    public String getDescripcionCompra() {
        return this.descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public float calcularTotal() {
        float total = 0.0F;
        ItemFactura[] var2 = this.itemfacturas;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ItemFactura item = var2[var4];
            if (item != null) {
                total += item.calcularImporte();
            }
        }

        return total;
    }

    public String imprimirFactura() {
        StringBuilder sb = new StringBuilder("FACTURA No. ");
        sb.append(this.getIdFactura()).append("\n").append("Fecha: ").append(this.getFecha()).append("\n").append("Cliente: ").append(this.cliente.getNombreCliente()).append("\n").append("NIT: ").append(this.cliente.getNit()).append("\n").append("Descripcion: ").append(this.getDescripcionCompra()).append("\n");
        ItemFactura[] var2 = this.itemfacturas;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ItemFactura item = var2[var4];
            if (item != null) {
                sb.append(item.getCantidadItem()).append("\t").append(item.getProducto().getIdProducto()).append("\t").append(item.getProducto().getNombreProducto()).append("\t").append(item.getProducto().getPrecioProducto()).append("\t").append(item.calcularImporte()).append("\n");
            }
        }

        sb.append("Total: ").append(this.calcularTotal());
        return sb.toString();
    }
}


