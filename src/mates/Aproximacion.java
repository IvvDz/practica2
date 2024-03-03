package mates;

public class Aproximacion {
    public static int calcularPuntosDentroCirculo(int puntos) {
        return calcularPuntosDentroCirculoRecursivo(puntos, 0);
    }

    public static int calcularPuntosDentroCirculoRecursivo(int puntos, int puntosDentro) {
        if (puntos == 0) {
            return puntosDentro;
        }

        double x = Math.random();
        double y = Math.random();

        if (x * x + y * y <= 1) {
            puntosDentro++;
        }

        return calcularPuntosDentroCirculoRecursivo(puntos - 1, puntosDentro);
    }

    public static double estimarPi(int puntosDentroCirculo, int puntosTotales) {
        return 4.0 * puntosDentroCirculo / puntosTotales;
    }
}

