    package Models;

    public class Television extends Electrodomestico{
        private final double RESOLUCION = 20;
        private final boolean SINTONIZADOR_TDT = false;
        protected double resolucion;
        protected boolean sintonizador_tdt;

        public Television() {
            super();
            this.resolucion = RESOLUCION;
            this.sintonizador_tdt = SINTONIZADOR_TDT;
        }

        public Television(float precio, int peso) {
            super(precio, peso);
            this.resolucion = RESOLUCION;
            this.sintonizador_tdt = SINTONIZADOR_TDT;
        }

        public Television(float precio, String color, char consumo_energetico, int peso, double resolucion, boolean sintonizador_tdt) {
            super(precio, color, consumo_energetico, peso);
            this.resolucion = resolucion;
            this.sintonizador_tdt = sintonizador_tdt;
        }

        public double getResolucion() {
            return resolucion;
        }

        public boolean isSintonizador_tdt() {
            return sintonizador_tdt;
        }

        @Override
        public int precioFinal() {
            int precioFinal = super.precioFinal();

            if(resolucion>40){
            precioFinal *= 1.3;
            }
            if (sintonizador_tdt == true) {
            precioFinal += 50;
            }
            return precioFinal;
        }
    }
