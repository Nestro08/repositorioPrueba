import java.util.Random;
import java.util.Scanner;

public class Naves {
    private String nombre;
    private int vida;
    private int escudo;
    private int posicion;

    public Naves(String n, int v, int e, int p) {
        nombre = n;
        vida = v;
        escudo = e;
        posicion = p;
    }

    public String getNaves() {
        return nombre;
    }

    public void setNaves(String naves) {
        nombre = naves;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void ImprimirInfo() {
        System.out.println("Nombre: " + nombre + "\nVida: " + vida + "\nAtaque: " + escudo + "\nPosición: " + posicion);
    }
    //Acción de elegir a el numero de jugadores
    public static void EleccionJugadores() {
        System.out.println("¿Cuántos jugadores van a jugar?");
        Scanner scn = new Scanner(System.in);
        int NumJugadores = scn.nextInt();
        if (NumJugadores <= 2) {
            System.out.println("Bienvenidos capitanes, elijan sus naves: ");
        } else {
            System.out.println("Lo sentimos, no tenemos tantas naves disponibles, elija un número más bajo.");
        }
    }

    //Dado que definira la posicion y el avance del los jugadores
    public void tirarDado() {
        Random r = new Random();
        int numeroDado = r.nextInt(6) + 1;
        posicion =posicion+ numeroDado;
        System.out.println("El número del dado es : " + numeroDado);
        System.out.println("Ahora se encuentra en la casilla: " + posicion);
        if (posicion > 20){
            posicion = 20;
        }
    }
}
//N.M.M