import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //EjemploImplementacionList.ejecutarEjemploArrayList();
        //EjemploImplementacionList.ejecutarEjemploLinkedList();

        Set<String> hashSet = new HashSet<>();

        EjemploImplementacionesSet.ejecutarAgregacionDeSet(hashSet);
        EjemploImplementacionesSet.mostrarPaises(hashSet);
    }
}