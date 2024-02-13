package miPrincipal;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float V;//Val.Entrada como real
        float T;//Val.Entrada como real
        float D;//Val.Salida como real
        System.out.println("Velocidad en M/S:");
        V = entrada.nextFloat();
        System.out.println("Segundos:");
        T = entrada.nextFloat();     
        D=V*T;
        System.out.println("Distancia: "+D);

    }
}