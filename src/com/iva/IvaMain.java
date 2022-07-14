package com.iva;

public class IvaMain {
    public static void main(String[] args) {
        double precioIva = calcularIva(49.900);
        System.out.println(precioIva);
    }

    private static double calcularIva(double precio) {
        double iva = 0.19;
        double precioIva = precio * iva;
        double precioConIva = precio + precioIva;
        return precioConIva;
    }
}
