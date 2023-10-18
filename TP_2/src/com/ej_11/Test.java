package com.ej_11;

public class Test {
    public static void main(String[] args) {
        Turnera turnera = new Turnera();

        System.out.println(turnera.obtenerUltimoNumeroOtorgado());

        for (int i = 0; i < 10; i++) {
            turnera.otorgarProximoTurno();
        }
        System.out.println(turnera.obtenerUltimoNumeroOtorgado());
        turnera.resetearContador();
        System.out.println(turnera.obtenerUltimoNumeroOtorgado());
        for (int i = 0; i < 7; i++) {
            turnera.otorgarProximoTurno();
        }
        turnera.resetearContador(-2);
        System.out.println(turnera.obtenerUltimoNumeroOtorgado());
        turnera.resetearContador(15);
        System.out.println(turnera.obtenerUltimoNumeroOtorgado());        
    }
}
