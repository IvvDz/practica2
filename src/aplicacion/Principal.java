package aplicacion;

import mates.Aproximacion;

public class Principal {
    public static void main(String[] args) {
        int puntosTotales = 1000000;
        int puntosDentroCirculo = Aproximacion.calcularPuntosDentroCirculo(puntosTotales);
        double estimacionPi = Aproximacion.estimarPi(puntosDentroCirculo, puntosTotales);
        System.out.println("Estimación de Pi: " + estimacionPi);
    }
}

