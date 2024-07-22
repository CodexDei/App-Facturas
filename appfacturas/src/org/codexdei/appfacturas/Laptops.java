package org.codexdei.appfacturas;

public enum Laptops {
    ASUSVivobookX1504ZANJ372("ASUS", "ASUS Vivobook X1504ZA-NJ372", 3200000),
    HP240G9("HP", "HP 240 G9", 2900000),
    LenovoIdeaPadSlim315IAH8("LENOVO", "Lenovo IdeaPad Slim 3 15IAH8", 2900000),
    LenovoLOQ16("LENOVO", "Laptop Gamer Lenovo LOQ 16", 6099000);

    private String fabricanteLaptop;
    private String nombreLaptop;
    private int precioLaptop;

    private Laptops(String fabricanteLaptop, String nombreLaptop, int precioLaptop) {
        this.fabricanteLaptop = fabricanteLaptop;
        this.nombreLaptop = nombreLaptop;
        this.precioLaptop = precioLaptop;
    }

    public String getFabricanteLaptop() {
        return this.fabricanteLaptop;
    }

    public String getNombreLaptop() {
        return this.nombreLaptop;
    }

    public int getPrecioLaptop() {
        return this.precioLaptop;
    }
}
