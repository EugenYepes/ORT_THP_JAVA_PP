package com.ej_11;

public class Turnera {
    private int turn;

    public Turnera (){
        turn = 0;
    }

    public void otorgarProximoTurno() {
        turn++;
    }

    public int obtenerUltimoNumeroOtorgado() {
        return turn;
    }

    public void resetearContador() {
        turn = 0;
    }

    public void resetearContador(int turnToReset) {
        if (turnToReset >= 0) {
            turn = turnToReset;
        }
    }
}
