package miPrincipal;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        float V;//Val.Entrada como real
        float T;//Val.Entrada como real
        float D;//Val.Salida como real
        System.out.println("Velocidad en M/S:");
        V = leer.nextFloat();
        System.out.println("Segundos:");
        T = leer.nextFloat();     
        D=V*T;
        System.out.println("Distancia: "+D);

    }
}