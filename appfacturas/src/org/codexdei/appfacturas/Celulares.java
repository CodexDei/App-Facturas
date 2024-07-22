package org.codexdei.appfacturas;

public enum Celulares {
    iPhone15ProMax("Apple", "iPhone 15 Pro Max", 5199000),
    SamsungGalaxyA545G("Samsung", "Samsung Galaxy A54 5G", 2399000),
    MotorolaMotoG22("Motorola", "Motorola Moto G22 ", 649000),
    SamsungGalaxyS24Ultra("Samsung", "Samsung Galaxy S24 Ultra", 4499000),
    RedmiNote11("Xiaomi", "Redmi Note 11", 799000);

    private String fabricanteCelular;
    private String nombreCelular;
    private int precioCelular;

    private Celulares(String fabricanteCelular, String nombreCelular, int precioCelular) {
        this.fabricanteCelular = fabricanteCelular;
        this.nombreCelular = nombreCelular;
        this.precioCelular = precioCelular;
    }

    public String getFabricanteCelular() {
        return this.fabricanteCelular;
    }

    public String getNombreCelular() {
        return this.nombreCelular;
    }

    public int getPrecioCelular() {
        return this.precioCelular;
    }
}
