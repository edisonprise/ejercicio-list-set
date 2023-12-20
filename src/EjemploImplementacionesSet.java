import java.util.Set;
import java.util.TreeSet;

public class EjemploImplementacionesSet {

    public static void ejecutarAgregacionDeSet(Set<String> setPaises) {

        setPaises.add("Argentina");
        setPaises.add("Colombia");
        setPaises.add("Brazil");

        boolean esDuplicado = setPaises.add("Chile");
        System.out.println("Se agrego elemento al conjunto?: " + esDuplicado);

        System.out.println("MOSTRANDO LISTADO");
        for(String pais : setPaises){
            System.out.println(pais);
        }

    }

    public static void mostrarPaises(Set<String> setPaises) {
        Set<String> setPaisesOrdenados = new TreeSet<>(setPaises);
        System.out.println("MOSTRANDO LISTADO ORDENADOs");
        for(String pais : setPaisesOrdenados){
            System.out.println(pais);
        }
    }
}
