
package EscaleraSerpientes;

import java.util.Random;


public class Juego {
    private int dado;
    private int turno=0;
    private boolean enJuego;

    
    public Juego() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void lanzarDado(){
        Random random =new Random();
        this.dado=random.nextInt(6)+1;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public void setEnJuego(boolean enJuego) {
        this.enJuego = enJuego;
    }
   
    
}
