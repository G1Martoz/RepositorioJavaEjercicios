package guia8ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    //ATRIBUTOS
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    private Integer cantidadJugadores;

    //CONSTRUCTORES
    public Juego() {
        this.jugadores = new ArrayList();
    }

    
    //METODOS
    public void llenarJuego() {//1
        Scanner leer = new Scanner(System.in);
        Integer cantidad;
        do {
            System.out.println("Ingrese la cantidad de jugadores [NO MAXIMO DE 6 Y MENOR QUE 2]");
            cantidad = leer.nextInt();
        } while (!(cantidad <= 6 && cantidad >= 2));
        
        for (int i = 0; i < cantidad; i++) {//agrega la "cantidad de jugadores" y los agrega al ArrayList;
            //agrega un jugador;
            this.jugadores.add(new Jugador(i));
        }
        //crea un revolver;
        this.revolver = new Revolver();
        this.revolver.llenarRevolver();
    }

    public void ronda() {//2
        boolean mojado = false;
        //recorrer jugadores;
        System.out.println(this.revolver.toString());
        for (Jugador player : jugadores) {
            //mojado var aux que usa disparar revolver. revolver atributo;
            mojado = player.disparoRevolver(this.revolver);
            if (mojado == true) {
                System.out.println(player);
                break;
            }
        }
    }
}
