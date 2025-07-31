package Models;

public class Electrodomestico {

private final String COLOR = "Blanco";
private final  char  CONSUMO_ENERGETICO = 'A';
private final  int  PESO = 5;
private final float PRECIO = 100;
private final String[] names = {"Blanco","Negro","Rojo","Azul","Gris"};
protected float precio;
protected String color;
protected char consumo_energetico;
protected int peso;

    public Electrodomestico() {
        this.precio = PRECIO;
        this.color = COLOR;
        this.consumo_energetico = CONSUMO_ENERGETICO;
        this.peso = PESO;

    }
    public Electrodomestico(float precio, int peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = COLOR;
        this.consumo_energetico = CONSUMO_ENERGETICO;

    }

    public Electrodomestico(float precio, String color, char consumo_energetico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }
    public String[] getNames() {
        return names;
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

    private char comprobarConsumoEnergetico(char letra){
        char[] letras = {'A','B','C','D','E','F'};
        boolean flag = false;
        for(int i = 0; i < letras.length && !flag; i++){
            if(letras[i] == letra){
                flag = true;
            }
        }
        return (flag) ? letra : CONSUMO_ENERGETICO;
    }
    private String comprobarColor(String names){
         String[] colores = {"Blanco","Negro","Rojo","Azul","Gris"};
        boolean flag = false;
        for(int i = 0; i < colores.length && !flag; i++){
            if(colores[i].equalsIgnoreCase(color)){
                flag = true;
            }
        }
        return (flag) ? color : COLOR;
    }
    public float precioFinal() {
        float precioFinal = 0;
        switch (consumo_energetico){
            case 'A' -> {
                precioFinal = 100;
            }
            case 'B' -> {
                precioFinal = 80;
            }
            case 'C' -> {
                precioFinal = 60;
            }
            case 'D' -> {
                precioFinal = 50;
            }
            case 'E' -> {
                precioFinal = 30;
            }
            case 'F' -> {
                precioFinal = 10;
            }
        }
       if(peso >0  && peso <=19){
            precioFinal += 10;
        }else if(peso >=20 && peso <=49){
           precioFinal += 50;
       }else if(peso >=50 && peso <=79){
           precioFinal += 80;
       }else if(peso >=80){
           precioFinal += 100;
       }else{
           System.out.println("PESO INVALIDO");
       }

        return precioFinal;
    }

}
