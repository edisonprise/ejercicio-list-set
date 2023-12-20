import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploImplementacionList {
    public static void ejecutarEjemploArrayList() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add(2, "Naranja");

        String primerElemento = arrayList.get(1);
        String segundoElemento = arrayList.get(2);

        System.out.println("Elemento 1: " + primerElemento);
        System.out.println("Elemento 2: " + segundoElemento);

        System.out.println("Iteracion con bucle for");
        for(String elemento: arrayList) {
            System.out.println("Elemento: " + elemento);
        }

        boolean contieneNaranja = arrayList.contains("Naranja");
        System.out.println("El arrayList tiene Naranja?: " + contieneNaranja);

        int cantidadElementos = arrayList.size();
        System.out.println("Tamaño del arrayList: " + cantidadElementos);
    }

    public static void ejecutarEjemploLinkedList() {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.remove(Integer.valueOf(20));

        System.out.println("BUCLE DE LINKEDLIST");
        for(Integer num : linkedList){
            System.out.println(num);
        }
        boolean contains20 = linkedList.contains(20);
        System.out.println("Elemento 20 esta?: " + contains20);

        int cantidadElementos = linkedList.size();
        System.out.println("Cantidad de elementos: " + cantidadElementos);
    }


}
