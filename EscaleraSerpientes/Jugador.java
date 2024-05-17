
package EscaleraSerpientes;

public class Jugador {
    private String nombre;
    private String ficha;
    private int posicion=0;

    public Jugador() {
    }

    public Jugador(String nombre, String ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", ficha=" + ficha + ", posicion=" + posicion + '}';
    }
    
    public void AumentarPosicion(){
        this.posicion=this.posicion+1;
    }
    
   
}