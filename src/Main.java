import Models.Electrodomestico;
import Models.Lavadora;
import Models.Television;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);

        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television());

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
