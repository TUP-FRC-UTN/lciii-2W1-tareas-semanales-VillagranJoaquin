
package ejercicioequipo;

import java.util.Scanner;


public class EjercicioEquipo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Equipo e=new Equipo();
        int pos, estado;
        System.out.println("Ingrese nombre del equipo:");
        e.setNombre(sc.nextLine());
        System.out.println("Ingrese Posicion en la liga");
        e.setPosicion(sc.nextInt());
        System.out.println("Ingrese cantidad de partidos GANADOS");
        e.setpGanados(sc.nextInt());
        System.out.println("Ingrese cantidad de partidos EMPATADOS");
        e.setpEmpatados(sc.nextInt());
        System.out.println("Ingrese cantidad de partidos PERDIDOS");
        e.setpPerdidos(sc.nextInt());
        System.out.println("Ingrese cantidad de goles A FAVOR");
        e.setGolesFavor(sc.nextInt());
        System.out.println("Ingrese cantidad de goles EN CONTRA");
        e.setGolesContra(sc.nextInt());
        
        System.out.println("Ingrese cantidad de jugadores que conforman la Plantilla:");
        e.dimensionarArray(sc.nextInt());
        for (int i = 0; i < e.getJugadores().length; i++) {
            Jugador j= new Jugador();
            System.out.println("Ingrese nombre del Jugador:");
            sc.nextLine();
            j.setNombre(sc.nextLine());
            do {
                pos=0;
                System.out.println("Ingrese posición del jugador (indique con 1- Arquero, 2- Defensa,3- Mediocampo y 4- Delantero):");
                pos=sc.nextInt();
            } while (pos!=1 && pos!=2 && pos!=3 && pos!=4);
            j.setPosicion(pos);
            System.out.println("Ingrese número de Camiseta:");
            j.setCamiseta(sc.nextInt());
            System.out.println("Ingrese cantidad de Partidos que ha disputado:");
            j.setCantPartJug(sc.nextInt());
            do {
                estado=0;
                System.out.println("Ingrese el estado físioc del jugador (utilice de 0 a 100):");
                estado=sc.nextInt();
            } while (estado<0 || estado>100);
            j.setEstado(estado);
            
            e.insertarJugador(i, j);
            System.out.println("Jugador guardado en el Equipo");
            
            
        }
        System.out.println("Plantilla Completa");
        
        System.out.println("Cantidad de Jugadores con menos de 10 partidos disputados: "+e.jugadorMenos10Partidos());
        System.out.println("El jugador que más partidos ha disputado es:\n"+e.mayorPresencia());
        System.out.println("El promedio de estado físico del equipo es de: "+e.promedioEstado()+"%");
        
        System.out.print("Ingrese nº de Camiseta que desea buscar: ");
        Jugador busqueda=e.busquedaXDorsal(sc.nextInt());
        System.out.println("El estado físico del jugador que busca es: "+busqueda.getEstado()+"%");
        
        System.out.println("Promedio de partidos Jugados por ARQUEROS: "+e.promedioJugadosArquero());
        System.out.println("Promedio de partidos Jugados por DEFENSAS: "+e.promedioJugadosDefensa());
        System.out.println("Promedio de partidos Jugados por MEDIOCAMPOS: "+e.promedioJugadosMediocampo());
        System.out.println("Promedio de partidos Jugados por DELANTEROS: "+e.promedioJugadosDelantero());

        
        
        System.out.println("Equipo que ha sido cargado:");
        System.out.println(e.toString());
    }
    
}
