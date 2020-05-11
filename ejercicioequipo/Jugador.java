
package ejercicioequipo;


public class Jugador {
    private String nombre;
    private int posicion, camiseta, cantPartJug, estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public int getCantPartJug() {
        return cantPartJug;
    }

    public void setCantPartJug(int cantPartJug) {
        this.cantPartJug = cantPartJug;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Jugador(String nombre, int posicion, int camiseta, int cantPartJug, int estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.camiseta = camiseta;
        this.cantPartJug = cantPartJug;
        this.estado = estado;
    }

    public Jugador() {
        nombre="";
        posicion=0;
        camiseta=0;
        cantPartJug=0;
        estado=0;
    }

    @Override
    public String toString() {
        return "Jugador: Nombre: " + nombre + ", Camiseta nº: " + camiseta + "\nPosicion: " + this.mostrarPosicion() + ", Cantidad de Partidos Jugados: " + cantPartJug + ", Estado Físico: " + estado + '%';
    }

    private String mostrarPosicion() {
        switch (posicion) {
            case 1:
                return "Arquero";
            case 2:
                return "Defensor";
            case 3: 
                return "Mediocampo";
            case 4:
                return "Delantero";
            default:
                return "Posición no indicada";
        }
    }
    
    
    
    
    
    
}
