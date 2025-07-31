package Models;

public class Electrodomestico {

    private final String COLOR_DEFAULT = "Blanco";
    private final char CONSUMO_ENERGETICO_DEFAULT = 'F';
    private final int PESO_DEFAULT = 5;
    private final float PRECIO_DEFAULT = 100;
    private final String[] COLORES_DISPONIBLES = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

    protected float precio;
    protected String color;
    protected char consumo_energetico;
    protected int peso;

    public Electrodomestico() {
        this.precio = PRECIO_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumo_energetico = CONSUMO_ENERGETICO_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(float precio, int peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = COLOR_DEFAULT;
        this.consumo_energetico = CONSUMO_ENERGETICO_DEFAULT;
    }

    public Electrodomestico(float precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;

        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }


    public float getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public String getCOLOR_DEFAULT() {
        return COLOR_DEFAULT;
    }

    public char getCONSUMO_ENERGETICO_DEFAULT() {
        return CONSUMO_ENERGETICO_DEFAULT;
    }

    public int getPESO_DEFAULT() {
        return PESO_DEFAULT;
    }

    public float getPRECIO_DEFAULT() {
        return PRECIO_DEFAULT;
    }

    public String[] getCOLORES_DISPONIBLES() {
        return COLORES_DISPONIBLES;
    }


    private char comprobarConsumoEnergetico(char letra) {
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char l : letrasValidas) {
            if (Character.toUpperCase(letra) == l) {
                return Character.toUpperCase(letra);
            }
        }
        return CONSUMO_ENERGETICO_DEFAULT;
    }


    private String comprobarColor(String color) {
        for (String c : COLORES_DISPONIBLES) {
            if (c.equalsIgnoreCase(color)) {
                return c;
            }
        }
        return COLOR_DEFAULT;
    }

    public int precioFinal() {
        int precioFinal = 0;

        switch (consumo_energetico) {
            case 'A' -> {
                precioFinal += 100;
            }
            case 'B' -> {
                precioFinal += 80;
            }
            case 'C' -> {
                precioFinal += 60;
            }
            case 'D' -> {
                precioFinal += 50;
            }
            case 'E' -> {
                precioFinal += 30;
            }
            case 'F' -> {
                precioFinal += 10;
            }
        }


        if (peso > 0 && peso <= 19) {
            precioFinal += 10;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 50;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        } else {
            System.out.println("PESO INVALIDO");
        }
        return precioFinal;
    }
}