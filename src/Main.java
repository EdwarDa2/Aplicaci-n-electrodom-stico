import Models.Electrodomestico;
import Models.Lavadora;
import Models.Television;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);


        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora(280, 60));
        electrodomesticos.add(new Television(200, 10));
        electrodomesticos.add(new Lavadora(150, "rojo", 'B', 15, 25));
        electrodomesticos.add(new Television(100, "negro", 'C', 30, 50, true));
        electrodomesticos.add(new Lavadora(200, "gris", 'A', 40, 35));
        electrodomesticos.add(new Television(125, "azul", 'F', 85, 60, false));
        electrodomesticos.add(new Lavadora(85, 20));
        electrodomesticos.add(new Lavadora(110, "negro", 'C', 30, 35));

        double totalLavadoras = 0;
        double totalTelevisores = 0;
        double totalElectrodomesticos = 0;



        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioActual = electrodomestico.precioFinal();
            totalElectrodomesticos += precioActual;


            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += precioActual;
            } else if (electrodomestico instanceof Television) {
                totalTelevisores += precioActual;
            }
        }


        System.out.println("Total de Lavadoras: " + totalLavadoras);
        System.out.println("Total de Televisores: " + totalTelevisores);
        System.out.println("Total de Electrodomésticos: " + totalElectrodomesticos);
    }
}