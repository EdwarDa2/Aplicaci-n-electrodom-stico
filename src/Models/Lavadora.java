package Models;

public class Lavadora extends Electrodomestico {
    private final int CARGA_DEFAULT = 5;
    protected int carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(float precio, int peso) {
        super(precio, peso);
        this.carga = CARGA_DEFAULT;
    }


    public Lavadora(int carga) {
        super();
        this.carga = carga;
    }

    public Lavadora(float precio, String color, char consumo_energetico, int peso, int carga) {
        super(precio, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
