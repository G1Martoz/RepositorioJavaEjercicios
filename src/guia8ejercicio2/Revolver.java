package guia8ejercicio2;

public class Revolver {

    //ATRIBUTOS
    private Integer posicionActual;
    private Integer posicionAgua;

    //CONSTRUCTORES
    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    //GET&SET
    public Integer getPosicionActual() {
        return posicionActual;
    }
    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }
    public Integer getPosicionAgua() {
        return posicionAgua;
    }
    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //METODO
    public void llenarRevolver() {
        //generar el nro aleatorio de posicionActual
        Double a = Math.random() * 6 + 1;
        this.setPosicionActual(a.intValue());

        //nro random posicion del agua
        Double aux = Math.random() * 6 + 1;
        this.setPosicionAgua(aux.intValue());
    }

    public boolean mojar() {
        //si posicion actual coincide con posicion de agua es true
        if (this.posicionAgua == this.posicionActual) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro() {
        //para saber si la posicion actual corre hasta mod 6.
        this.setPosicionActual(((this.posicionActual++) % 6) + 1);
    }

    //ToString
    @Override
    public String toString() {
        return "REVOLVER MAJESTIC" + "[POSICION ACTUAL]" + posicionActual + ", [POSICION DEL AGUA]" + posicionAgua;
    }
}
