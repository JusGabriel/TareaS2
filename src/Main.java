//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Jugador {
    String nombre;
    String posicion;
    int edad;
    int numeroCamiseta;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Jugador jugador1= new Jugador();
        jugador1.nombre="Messi";
        jugador1.posicion ="Delantero";
        jugador1.edad =36;
        jugador1.numeroCamiseta= 10;

        Jugador jugador2 = new Jugador();
        jugador2.nombre ="Busquets";
        jugador2.posicion ="Centrocampista";
        jugador2.edad =35;
        jugador2.numeroCamiseta=5;

        System.out.println ("Jugador 1: "+jugador1.nombre+", "+ jugador1.posicion+", "+jugador1.edad+", "+jugador1.numeroCamiseta);
        System.out.println ("Jugador 2: "+jugador2.nombre+", "+ jugador2.posicion+", "+jugador2.edad+", "+jugador2.numeroCamiseta);

        Jugador nuevoJugador= new Jugador();
        System.out.print ("Ingrese el nombre del nuevo jugador: ");
        nuevoJugador.nombre =scanner.nextLine();
        System.out.print ("Ingrese la posición del jugador: ");
        nuevoJugador.posicion =scanner.nextLine();
        System.out.print ("Ingrese la edad: ");
        nuevoJugador.edad =scanner.nextInt();
        System.out.print ("Ingrese el número de camiseta: ");
        nuevoJugador.numeroCamiseta= scanner.nextInt();

        System.out.println("Nuevo Jugador: "+ nuevoJugador.nombre+", "+nuevoJugador.posicion+", "+nuevoJugador.edad+", "+nuevoJugador.numeroCamiseta);

        scanner.close();
    }
}


