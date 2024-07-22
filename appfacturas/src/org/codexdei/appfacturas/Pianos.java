package org.codexdei.appfacturas;

public enum Pianos {
    YamahaU3("Yamaha", "Yamaha U3", 50000000),
    KawaiK300("Kawai", "Kawai K300", 35000000),
    RolandRP100("Roland", "Roland RP100", 8000000),
    KorgKROSS288("Korg", "Korg KROSS2 88", 5499000);

    private String fabricantePiano;
    private String nombrePiano;
    private int precioPiano;

    private Pianos(String fabricantePiano, String nombrePiano, int precioPiano) {
        this.fabricantePiano = fabricantePiano;
        this.nombrePiano = nombrePiano;
        this.precioPiano = precioPiano;
    }

    public String getFabricantePiano() {
        return this.fabricantePiano;
    }

    public String getNombrePiano() {
        return this.nombrePiano;
    }

    public int getPrecioPiano() {
        return this.precioPiano;
    }
}
