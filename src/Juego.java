import java.util.Scanner;

public class Juego {
    static String[] Casillas = new String[21];

    public static void main(String[] args) {
       menu();
    }
    //Clase comprobar obtaculos
    private static void comprobarObstaculo(Naves nave) {
        // Lógica para determinar el resultado de la casilla en la que cae la nave
        switch (nave.getPosicion()) {
            case 0:
                System.out.println("Aquí empieza su aventura, prepárese.");
                System.out.println("------------------------");
                break;
            case 1:
                System.out.println("Estás viajando por una zona sin peligro, no te preocupes y sigue adelante.");
                System.out.println("------------------------");
                break;
            case 2:
                Obstaculos.Planeta(nave);
                System.out.println("------------------------");
                break;
            case 3:
                Obstaculos.AgujeroDeGusano(nave);
                System.out.println("------------------------");
                break;
            case 4:
                System.out.println("Relájate un poco capitán, aprovecha la zona segura.");
                System.out.println("------------------------");
                break;
            case 5:
                Obstaculos.Estrella(nave);
                System.out.println("------------------------");
                break;
            case 6:
                System.out.println("Estás dentro de una zona de seguridad, las naves amigas te protegerán.");
                System.out.println("------------------------");
                break;
            case 7:
                Obstaculos.PulsoElectromagnetico(nave);
                System.out.println("------------------------");
                break;
            case 8:
                Obstaculos.Supernova(nave);
                System.out.println("------------------------");
                break;
            case 9:
                Obstaculos.Planeta(nave);
                System.out.println("------------------------");
                break;
            case 10:
                System.out.println("Zona segura, no corres ningún peligro.");
                System.out.println("------------------------");
                break;
            case 11:
                Obstaculos.Estrella(nave);
                System.out.println("------------------------");
                break;
            case 12:
                Obstaculos.Planeta(nave);
                System.out.println("------------------------");
                break;
            case 13:
                Obstaculos.AgujeroDeGusano(nave);
                System.out.println("------------------------");
                break;
            case 14:
                System.out.println("Relájate un poco capitán, aprovecha la zona segura.");
                System.out.println("------------------------");
                break;
            case 15:
                Obstaculos.Estrella(nave);
                System.out.println("------------------------");
                break;
            case 16:
                System.out.println("Estás dentro de una zona de seguridad, las naves amigas te protegerán.");
                System.out.println("------------------------");
                break;
            case 17:
                Obstaculos.PulsoElectromagnetico(nave);
                System.out.println("------------------------");
                break;
            case 18:
                Obstaculos.Supernova(nave);
                System.out.println("------------------------");
                break;
            case 19:
                Obstaculos.GranNaveKawami(nave);
                System.out.println("------------------------");
                break;
            case 20:
                System.out.println("Final, has llegado a la Gran Estación, enhorabuena, eres el mejor capitán del Universo.\nFelicidades!!!");
                System.out.println("------------------------");
                break;
        }
    }
    //Clase imprimir tablero
    public static void imprimirTablero() {
        System.out.println("TABLERO");
        for (int i = 0; i < Casillas.length; i++) {
            System.out.println("Casilla " + i + ": " + Casillas[i]);
        }
    }
    //Clase menú con sus opciones
    public static void menu(){
        System.out.println("--------------------------------");
        System.out.println("1.Nueva Partida.");
        System.out.println("2.Instrucciones.");
        System.out.println("3.Especies y obstaculos.");
        Scanner scn = new Scanner(System.in);
        int menu = scn.nextInt();
        switch (menu){
            case 1:
                System.out.println("Nueva Partida");
                // Inicialización de las casillas del tablero
                Casillas[0] = " |    |"; // Casilla 1
                Casillas[1] = " |    |"; // Casilla 2
                Casillas[2] = " | PL |"; // Casilla 3
                Casillas[3] = " | AG |"; // Casilla 4
                Casillas[4] = " |    |"; // Casilla 5
                Casillas[5] = " | ES |"; // Casilla 6
                Casillas[6] = " |    |"; // Casilla 7
                Casillas[7] = " | PE |"; // Casilla 8
                Casillas[8] = " | SN |"; // Casilla 9
                Casillas[9] = " | PL |"; // Casilla 10
                Casillas[10] = "|    |"; // Casilla 11
                Casillas[11] = "| ES |"; // Casilla 12
                Casillas[12] = "| PL |"; // Casilla 13
                Casillas[13] = "| AG |"; // Casilla 14
                Casillas[14] = "|    |"; // Casilla 15
                Casillas[15] = "| ES |"; // Casilla 16
                Casillas[16] = "|    |"; // Casilla 17
                Casillas[17] = "| PL |"; // Casilla 18
                Casillas[18] = "| SN |"; // Casilla 19
                Casillas[19] = "| GK |"; // Casilla 20
                Casillas[20] = "| FIN|"; // Casilla 21

                Naves n1 = new Naves("Stellar Voyager", 100, 100, 0);
                Naves n2 = new Naves("Nebula Runner", 100, 100, 0);
                Naves n3 = new Naves("Galactic Explorer", 100, 100, 0);
                Naves n4 = new Naves("Space Adventure",100,100,0);

                Naves[] listaNav = new Naves[]{n1, n2,n3,n4};

                System.out.println("Bienvenido a SpaceAdventure: ");
                System.out.println("-----------------------------");
                System.out.println("En esta aventura recorrerán el espacio en sus naves y el primero en llegar a la Gran Estación será recompensado con el medallón de Capitán Galáctico, pero tengan cuidado, \n la Gran Nave está custodiada por los Kawami, evitad que os atrapen.\n Buena suerte viajeros, y que el espacio esté de su parte.");
                System.out.println("------------------------------");
                Naves.EleccionJugadores();
                System.out.println("-------------------------------");
                System.out.println("Elija una nave: 1-4");
                System.out.println("-----------------------------");
                for (int i = 0; i < listaNav.length; i++) {
                    System.out.println(i + ". " + listaNav[i].getNaves());
                }
                int op1 = scn.nextInt();
                n1 = listaNav[op1];
                n1.ImprimirInfo();
                System.out.println("--------------------");

                int op2 = scn.nextInt();
                n2 = listaNav[op2];
                n2.ImprimirInfo();
                System.out.println("--------------------");

                System.out.println("----------------------");
                System.out.println("Empieza el juego;");
                System.out.println("Este es su tablero: ");
                imprimirTablero();
                System.out.println("---------------------");

                // Juego en un bucle hasta que un jugador llegue a la casilla final
                while (n1.getPosicion() < 20 && n2.getPosicion() < 20) {
                    // Turno de n1
                    System.out.println("Turno del jugador 1:");
                    n1.tirarDado();
                    n1.ImprimirInfo();
                    System.out.println("----------------");
                    comprobarObstaculo(n1); // Comprobar si hay obstáculo después de tirar el dado
                    if (n1.getPosicion() >= 20) {
                        System.out.println("Ha terminado el juego, el ganador es: " + n1.getNaves()+"🎖️");
                        break; // Salir del bucle si n1 ha ganado
                    }
                    // Turno de n2
                    System.out.println("Turno del Jugador 2: ");
                    n2.tirarDado();
                    n2.ImprimirInfo();
                    System.out.println("-----------------");
                    comprobarObstaculo(n2); // Comprobar si hay obstáculo después de tirar el dado
                    if (n2.getPosicion() >= 20) {
                        System.out.println("Ha terminado el juego, el ganador es: " + n2.getNaves()+"🎖️");
                        break; // Salir del bucle si n2 ha ganado
                    }
                }break;
            case 2:
                System.out.println("Instrucciones:");
                System.out.println("En este juego formaran parte de tripulaciones espaciales, las cuales, deberan llegar hasta\n"+
                                    "la Gran Estación, el primero que lo consigua se ganara el reconocimiento de Capitan Galáctico. Mucha suete.");
                System.out.println("-----------------------------");
                menu();
            case 3:
                System.out.println("Especies y obstaculos.");
                System.out.println("Kawami: estos son una especie muy agresiva, la cual vaga por la galaxia buscando y capturando naves espaciales para saquearlas y destruir a la tripulación,\n nadie nunca ha conseguido sobrevivir a ellos,  no dejes que te atrapen.");
                System.out.println("Vermyphus: los Vermyphus son una especie con millones de años de historia, estos protegen su planeta contra visitantes no deseados,\n solo con suerte alguien puede entrar en el planeta y requisar algunos objetos, seréis  vosotros? ");
                System.out.println("Estrella: Estrella: se trata de una estrella multiforme de millones de años, esta se encuentra en un estado de inestabilidad quántica continua, \n resuelve las operaciones lo más rápido posible los problemas para poder reestablecer la nave.");
                System.out.println("Pulso Electromagnético: este produce un campo electromagnético muy potente, es posible escaparse de él, pero es muy difícil." );
                System.out.println("Agujero de gusano: este es inevitable, este te succionará y te hará retroceder en el espacio tiempo.");
                System.out.println("Cometa colosal: si este cometa se acerca hasta tu nave tienes dos opciones, activa los escudos gamaticos para defenderte de él, \n también puedes tratar de esquivarlo, pero no te lo recomiendo.");
                System.out.println("-------------------------------");
                menu();
            default:
                System.out.println("Esa opción no está dentro de nuestros archivos, por favor elija otra.");
                System.out.println("--------------------------------");
                menu();
        }

        }

    }
//N.M.M