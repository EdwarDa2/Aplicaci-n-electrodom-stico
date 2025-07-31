package Models;

public class Television extends Electrodomestico {
    private final double RESOLUCION_DEFAULT = 20;
    private final boolean SINTONIZADOR_TDT_DEFAULT = false;
    protected double resolucion;
    protected boolean sintonizador_tdt;

    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizador_tdt = SINTONIZADOR_TDT_DEFAULT;
    }

    public Television(float precio, int peso) {
        super(precio, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizador_tdt = SINTONIZADOR_TDT_DEFAULT;
    }


    public Television(double resolucion, boolean sintonizador_tdt) {
        super();
        this.resolucion = resolucion;
        this.sintonizador_tdt = sintonizador_tdt;
    }

    public Television(float precio, String color, char consumo_energetico, int peso, double resolucion, boolean sintonizador_tdt) {
        super(precio, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_tdt = sintonizador_tdt;
    }

    public double getResolucion() { // Método get de resolución
        return resolucion;
    }

    public boolean isSintonizador_tdt() { // Método get de sintonizador TDT
        return sintonizador_tdt;
    }

    @Override
    public int precioFinal() {
        int precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal = (int) (precioFinal * 1.3);
        }
        if (sintonizador_tdt) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}