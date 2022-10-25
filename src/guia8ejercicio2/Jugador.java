package guia8ejercicio2;

public class Jugador {

    //ATRIBUTOS
    private Integer id;
    private String Jugador;
    private boolean mojado;

    //CONSTRUCTORES
    public Jugador() {
    }

    public Jugador(Integer id) {
        this.id = id + (1);
        this.Jugador = "Jugador " + this.id;
        this.mojado = false;
    }

    //GET&SET
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getJugador() {
        return Jugador;
    }
    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }
    public boolean isMojado() {
        return mojado;
    }
    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    
    //METODO
    public boolean disparoRevolver(Revolver r) {
        boolean mojadazo;
        if (r.mojar() == true) {
            this.mojado = true;
            mojadazo = true;
            System.out.println("Perdiste!");
        } else {
            this.mojado = false;
            mojadazo = false;
            System.out.println("Que suerte!");
        }
        //llamamos al siguiente chorro para saber la posicion y si se moja o no en la ronda siguiente;
        r.siguienteChorro();
        return mojadazo;
    }

    //ToString
    @Override
    public String toString() {
        return Jugador + ", [MOJADO]" + mojado;
    }

}
