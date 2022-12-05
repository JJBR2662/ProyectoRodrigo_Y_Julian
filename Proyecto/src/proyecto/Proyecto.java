package proyecto;

import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        int juego = principio();
        boolean bandera;
        do{
            switch (juego){
                case 1:
                    unjug();
                    bandera = false;
                    break;
                case 2:
                    bandera = false;
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    System.out.println();
                    char back;
                    System.out.println("""
                                       1. Este juego esta basado en los dos juegos de pelea Super Smash Bros y Mortal Kombat
                                          y no queremos que nada de lo visto en estos momentos se practique en casa ni en cualquier otro lado. \n
                                       2. En el modo de juego de un jugador seras tu contra la maquina, seras capaz de elegir tu combatiente
                                          mientras la maquina elegira uno al azar. Cuando esten en la batalla tendras que elegir que ataque quieres hacer
                                          para que tu oponente reciba golpes y puede bajar su vida.\n
                                       3. El ganador es el que quede con vida no hay mas.\n
                                       4. En el modo de dos jugadores, las dos personas tendran que elegir sus combatientes y batallar hasta que quede uno
                                          quede vivo, y como se dice en el mundo real... QUE GANE EL MEJOR.\n
                                       5. Asi como seras capaz de elegir que combatiente quieres utilizar tambien seras capaz de crear tu propio personaje
                                          con sus propios golpes y mas.\n
                                       6. Este juego esta creado por la organizacion RJPogra1 Society Project (RJPSP) y esta creado no solo por el simple
                                          hecho de que valga puntos, si no por que queremos que sea el mejor proyecto que se presente en esta aula y que
                                          gane los Grammys y de paso los Oscar el proximo year. (No gana el mundial por que es un proyecto y no un pais)\n
                                       7. Septima y ultima regla pero no menos importante, Disfrute :).
                                       """);
                    do{
                        System.out.print("Presione la letra [v] para volver: ");
                        back = caso3.next().charAt(0);
                        if ((back!='v')&&(back!='V')) {
                            System.out.println("Solo se puede la letra v, ninguna mas. (Para que haya mas validaciones jajaja)");
                        }
                    }while((back!='v')&&(back!='V'));
                    juego = principio();
                    bandera = true;
                    break;
                case 4:
                    bandera = false;
                    break;
                default:
                    System.out.println("Modo de juego no valido.");
                    bandera = true;
                    break;
            }
        }while(bandera);
        System.out.println("Gracias por jugar este maravilloso y merecedor de todos los puntos juego.");
    }
    public static int principio(){
        Scanner modo = new Scanner(System.in);
        System.out.println("---------------------------BIENVENID@ A SUPERKOMBAT I---------------------------");
        System.out.println  ("""
                             Las reglas se diran como dice la inge a grosso modo, es un juego de dos personas, 
                             1 vs 1 o tu eliges si lo quieres jugar contra la maquina pero ten cuidado que la 
                             maquina le sabe bastante pero no te preocupes, seras capaz de elgir la dificultad.
                             
                             SIN MAS DILATACION......................................QUE EMPIEZE LA DIVERSION""");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< SELECCIONE EL MODO DE JUEGO QUE DESEA JUGAR >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println("                          [1. UN JUGADOR]                                            ");
        System.out.println("                          [2. DOS JUGADORES]                                         ");
        System.out.println("                          [3. INSTRUCCIONES]                                         ");
        System.out.println("                          [4. SALIR]                                                 ");
        System.out.println();
        int juego;
        do{
            System.out.print("Ingrese el modo de juego [1] o [2] que desee, [3] para saber las instrucciones, [4] para salir: ");
            juego = modo.nextInt();
            if ((juego>4)||(juego<1)){
                System.out.println("Modo de juego o seleccion no es valida, intentelo de nuevo.");
            }
        }while((juego>4)||(juego<1));
        return juego;
    }
    public static void unjug(){
        
    }
    
}
