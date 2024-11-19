import java.util.Random;
import java.util.Scanner;

public class Obstaculos {
    static Scanner scn = new Scanner(System.in);
    private static int vida = 100;

    public static int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
        Obstaculos.vida = vida;
    }
    //Creación de un metodo llamado planeta.
    public static void Planeta(Naves nave) {
        System.out.println("Se ha adentrado en un planeta desconocido, elija un número aleatorio y veamos si la suerte le sonríe.");
        int numero = scn.nextInt();
        if (numero <= 5) {
            System.out.println("Ha encontrado minerales preciosos, por esta vez ha tenido suerte, ha conseguido 15 puntos de vida.");
            nave.setVida(nave.getVida() + 15); // Actualiza la vida de la nave
        } else {
            System.out.println("Se ha adentrado en el planeta, pero sus habitantes los Vermyphus le han atacado, ha perdido la mitad de su vida.");
            nave.setVida(nave.getVida() / 2); // Actualiza la vida de la nave
            System.out.println("Ahora su vida es de: " + nave.getVida());
        // Comprueba si la vida es 0, si es vida=0 cambia la posicion a 0 y la vida a 100
        }if (nave.getVida()<=0){
            nave.setPosicion(0);
            nave.setVida(100);
            System.out.println("Has perdido toda tu vida capitán, vuelves al principio.");
        }
    }
    //Creación de un metodo llamado estrella.
    public static void Estrella(Naves nave) {
        System.out.println("Está pasando demasiado cerca de una estrella, realice las operaciones lo más rápido posible para no morir.");
        System.out.println("-----------------------");
        System.out.println("Realice las siguientes operaciones para reestabilizar la nave:");
        String[] preguntas = {"¿1+1?", "¿12+9?", "¿21+12?", "¿35-21?"};
        int[] soluciones = {2, 21, 33, 14};
        boolean todasCorrectas = true;  // Variable para verificar si todas las respuestas son correctas.
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            int solucionesCapitan = scn.nextInt();
            if (solucionesCapitan != soluciones[i]) {
                System.out.println("Ha sido absorbido por la estrella, has perdido 85 puntos de vida.");
                nave.setVida(nave.getVida() - 85); // Actualiza la vida de la nave.
                System.out.println("Ahora su vida es de: " + nave.getVida());
                if(nave.getVida()<=0){
                    System.out.println("Te has quedado sin vida capitán, vuelve al principio.");
                    nave.setPosicion(0);
                    nave.setVida(100);
                }
                todasCorrectas = false;  // Se marca como falso si alguna respuesta es incorrecta.
                break;
            }
        }
        // Si todas las respuestas fueron correctas, se muestra el mensaje de felicitaciones.
        if (todasCorrectas) {
            System.out.println("Felicidades, ha estabilizado la nave, ha conseguido 20 puntos de vida.");
            nave.setVida(nave.getVida() + 20); // Actualiza la vida de la nave
            System.out.println("Ahora su vida es de: " + nave.getVida());
        }if (nave.getVida()<=0){
            nave.setPosicion(0);
            System.out.println("Has perdido toda tu vida capitán, vuelves al principio.");
            nave.setVida(100);
        }
    }
    //Creación de un metodo llamado PulsoElectromagnetico.
    public static void PulsoElectromagnetico(Naves nave) {
        Random r = new Random();
        int numeroRandom = r.nextInt(10); // Random entre 0 y 5
        if (numeroRandom <= 5) {
            //Si impacta:
            System.out.println("Tu nave no ha podido esquivar el Pulso Electromagnético, has perdido 50 puntos de vida.");
            nave.setVida(100); // Actualiza la vida de la nave
            nave.setVida(nave.getVida()-50);
            System.out.println("Ahora está en la casilla: " + nave.getPosicion() + " y su vida es de " + nave.getVida());
        } else {//Si no impacta:
            System.out.println("Has esquivado el Pulso Electromagnético, has ganado 20 puntos de vida.");
            nave.setVida(nave.getVida() + 20); // Actualiza la vida de la nave
            System.out.println("Ahora su vida es de: " + nave.getVida());
        }if (nave.getVida()<=0){
            nave.setPosicion(0);
            nave.setVida(0);
            System.out.println("Has perdido toda tu vida capitán, vuelves al principio.");
        }
    }
    //Creación de un metodo llamado Agujero de Gusano
    public static void AgujeroDeGusano(Naves nave) {
        System.out.println("Has caído en un agujero de gusano, vas a retroceder un número de casillas, prepárate.");
        nave.setPosicion(nave.getPosicion() - 3); // Actualiza la posición
        System.out.println("Ahora está en la casilla: " + nave.getPosicion());
    }
    //Creación de un metodo llamado GranNaveKawami
    public static void GranNaveKawami(Naves nave) {
        System.out.println("Te ha atrapado la gran nave Kawami, esta se destruirá.");
        nave.setVida(100); // Actualiza la vida de la nave
        nave.setPosicion(0); // Reinicia la posición
        System.out.println("Ahora está en la casilla: " + nave.getPosicion() + " y su vida es de " + nave.getVida());
    }
    //Creación de un metodo que se llama Supernova
    public static void Supernova(Naves nave) {
        System.out.println("¡Una Supernova se acerca rápidamente hacia tu nave!");
        System.out.println("Tienes dos opciones: ");
        System.out.println("1. Tratar de esquivarla.");
        System.out.println("2. Activar los escudos para resistir el impacto.");
        System.out.print("Elige tu opción (1 o 2): ");
        Scanner scn = new Scanner(System.in);
        int opcion = scn.nextInt();
        if (opcion == 1) {
            // Probabilidad de esquivar el cometa
            Random r = new Random();
            int resultado = r.nextInt(5); // Número aleatorio entre 0 y 4
            if (resultado == 0) {
                System.out.println("¡Has logrado esquivar la Supernova con éxito! Ganas 10 puntos de vida.");
                nave.setVida(nave.getVida() + 10);
            } else {
                System.out.println("¡No pudiste esquivar la supernova! Has perdido 30 puntos de vida.");
                nave.setVida(nave.getVida() - 30);
            }
        } else if (opcion == 2) {
            // Activar escudos, perder menos vida pero seguro
            System.out.println("Has activado los escudos, pero no soportan todo el impacto. Pierdes 15 puntos de vida.");
            nave.setVida(nave.getVida() - 15);
        } else {
            // Opción inválida
            System.out.println("Opción inválida. El cometa impacta tu nave, y pierdes 50 puntos de vida.");
            nave.setVida(nave.getVida() - 50);
        }
        // Verificar si la nave se queda sin vida
        if (nave.getVida() <= 0) {
            System.out.println("Te has quedado sin vida, capitán. Vuelves al principio con la vida restablecida a 100.");
            nave.setPosicion(0);
            nave.setVida(100);
        }
        System.out.println("Ahora tu vida es de: " + nave.getVida());
    }

}
//N.M.M