import java.util.Scanner;

import org.codexdei.appfacturas.*;

public class EjemploFactura {
    public EjemploFactura() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombreCliente("MUEBLES NAVARRO");
        cliente.setNit(1030456449);
        Factura factura = new Factura(cliente, "Computadores");
        Producto producto1 = new Producto();
        producto1.setNombreProducto(Laptops.HP240G9.getNombreLaptop());
        producto1.setPrecioProducto(Laptops.HP240G9.getPrecioLaptop());
        Producto producto2 = new Producto();
        producto2.setNombreProducto(Laptops.LenovoLOQ16.getNombreLaptop());
        producto2.setPrecioProducto(Laptops.LenovoLOQ16.getPrecioLaptop());
        ItemFactura item1 = new ItemFactura(producto1, 3);
        ItemFactura item2 = new ItemFactura(producto2, 4);
        factura.addItemfacturas(item1);
        factura.addItemfacturas(item2);
        String impresion = factura.imprimirFactura();
        System.out.println(impresion);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas facturas desea generar?: ");
        int cantidadFacturas = sc.nextInt();

        for(int i = 0; i < cantidadFacturas; ++i) {
            Cliente cliente2 = new Cliente();
            System.out.print("Ingrese el nombre del cliente:");
            cliente2.setNombreCliente(sc.next());
            System.out.print("Ingrese el Nit del cliente:");
            cliente2.setNit(sc.nextInt());
            System.out.print("Ingrese la descripcion de la compra:");
            Factura factura2 = new Factura(cliente2, sc.next());
            int cantidadItems = 0;
            System.out.print("Ingrese la cantidad de items o productos  a comprar: ");
            cantidadItems = sc.nextInt();
            System.out.println();

            for(int j = 0; j < cantidadItems; ++j) {
                Producto producto = new Producto();
                System.out.print("Ingrese el nombre del producto " + (j + 1) + ":");
                producto.setNombreProducto(sc.next());
                System.out.print("Ingrese la cantidad de productos del item " + producto.getNombreProducto() + ":");
                factura2.addItemfacturas(new ItemFactura(producto, sc.nextInt()));
                System.out.print("Ingrese el precio del producto " + producto.getNombreProducto() + ":");
                producto.setPrecioProducto(sc.nextInt());
                System.out.println();
            }

            String impresion2 = factura2.imprimirFactura();
            System.out.println(impresion2);
            System.out.println("\n");
        }

    }
}
