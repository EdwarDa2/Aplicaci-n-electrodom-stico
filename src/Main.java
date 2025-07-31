import Models.Electrodomestico;
import Models.Lavadora;
import Models.Television;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(10);

        electrodomesticos.add(new Lavadora(22, 26));
        electrodomesticos.add(new Television(100, 15));
        electrodomesticos.add(new Lavadora(200, 25));
        electrodomesticos.add(new Television(500, 20));
        electrodomesticos.add(new Lavadora(250, 30));
        electrodomesticos.add(new Television(300, 20));
        electrodomesticos.add(new Lavadora(150, 18));
        electrodomesticos.add(new Television(450, 26));
        electrodomesticos.add(new Lavadora(250, 31));
        electrodomesticos.add(new Television(200, 225));

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
