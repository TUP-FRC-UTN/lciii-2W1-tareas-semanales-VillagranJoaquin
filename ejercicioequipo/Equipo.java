
package ejercicioequipo;


public class Equipo {
    private String nombre;
    private int pGanados, pEmpatados, pPerdidos, golesFavor, golesContra, posicion;
    private Jugador jugadores[];
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getpGanados() {
        return pGanados;
    }

    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }

    public int getpEmpatados() {
        return pEmpatados;
    }

    public void setpEmpatados(int pEmpatados) {
        this.pEmpatados = pEmpatados;
    }

    public int getpPerdidos() {
        return pPerdidos;
    }

    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    

    public Equipo() {
        nombre=new String();
        pGanados=0;
        pEmpatados=0;
        pPerdidos=0;
        golesFavor=0;
        golesContra=0;
        posicion=0;
        jugadores= new Jugador[1];
    }

    public Equipo(String nombre, int pGanados, int pEmpatados, int pPerdidos, int golesFavor, int golesContra, int posicion, Jugador[] jugadores) {
        this.nombre = nombre;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posicion = posicion;
        this.jugadores = jugadores;
    }
    public void dimensionarArray(int tam)
    {
        jugadores= new Jugador[tam];
    }
    
    public int diferenciaGoles()
    {
        return golesFavor-golesContra;
    }
    public int calcularPuntos()
    {
        int puntaje= pGanados*3+pEmpatados;
        return puntaje;
    }
    public void insertarJugador(int posicion, Jugador nuevo)
    {
        jugadores[posicion]=nuevo;
    }
    public int jugadorMenos10Partidos()
    {
        int cant=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getCantPartJug()<10)
                cant++;
            
        }
        return cant;
    }
    public String mayorPresencia()
    {
        Jugador may=new Jugador();
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getCantPartJug()>may.getCantPartJug())
                may = jugadores[i];
        }
        return may.toString();
    }
    public double promedioEstado()
    {
        int sumador=0;
        double promedio;
        for (int i = 0; i < jugadores.length; i++) {
            sumador+=jugadores[i].getEstado();
        }
        promedio= (double) sumador/ jugadores.length;
        return promedio;
    }
    public Jugador busquedaXDorsal(int dorsal)
    {
        Jugador buscado= null;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getCamiseta()==dorsal){
                buscado=jugadores[i];
                break;
            }
                      
        }
        return buscado;
    }
    
    public double promedioJugadosArquero()
    {
        int cantJugadores=0, sumaPartidos=0;
        double promedio=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPosicion()==1){
                cantJugadores++;
                sumaPartidos+=jugadores[i].getCantPartJug();
            }
            
        }
        if(cantJugadores>0)
            promedio=(double)sumaPartidos/cantJugadores;
        return promedio;
    }
    public double promedioJugadosDefensa()
    {
        int cantJugadores=0, sumaPartidos=0;
        double promedio=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPosicion()==2){
                cantJugadores++;
                sumaPartidos+=jugadores[i].getCantPartJug();
            }
            
        }
        if(cantJugadores>0)
            promedio=(double)sumaPartidos/cantJugadores;
        return promedio;
    }
    public double promedioJugadosMediocampo()
    {
        int cantJugadores=0, sumaPartidos=0;
        double promedio=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPosicion()==3){
                cantJugadores++;
                sumaPartidos+=jugadores[i].getCantPartJug();
            }
            
        }
        if(cantJugadores>0)
            promedio=(double)sumaPartidos/cantJugadores;
        return promedio;
    }
    public double promedioJugadosDelantero()
    {
        int cantJugadores=0, sumaPartidos=0;
        double promedio=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPosicion()==4){
                cantJugadores++;
                sumaPartidos+=jugadores[i].getCantPartJug();
            }
            
        }
        if(cantJugadores>0)
            promedio=(double)sumaPartidos/cantJugadores;
        return promedio;
    }
    

    @Override
    public String toString() {
        String cadena;
        cadena= "Equipo: "+nombre+"\nVictorias: "+pGanados+" Empates: "+pEmpatados+" Derrotas: "+pPerdidos+" Puntos: "+this.calcularPuntos()+
                "\nPosicion: "+posicion+"\nGoles a favor: "+golesFavor+" Goles en contra: "+golesContra+" Diferencia de Goles:"+this.diferenciaGoles()+
                "\nPlantilla:\n";
        for (int i = 0; i < jugadores.length; i++) {
            cadena+=jugadores[i].toString()+"\n";
            
        }
        return cadena;
    }
    
}
