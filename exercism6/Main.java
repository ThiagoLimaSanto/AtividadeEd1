package exercism6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDinamicaEncadeada listaEncadeada = new ListaDinamicaEncadeada();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        
        for (int i = 0; i < 50; i++) {
            lista1.add((int) (Math.random() * 201) - 100); 
            lista2.add((int) (Math.random() * 201) - 100); 
        }

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        System.out.println("Lista 1 invertida: " + listaEncadeada.inverter(lista1));
        System.out.println("Lista de ímpares: " + listaEncadeada.retornarImpares(lista1, lista2));
        System.out.println("Lista concatenada: " + listaEncadeada.concatenar(lista1, lista2));
        System.out.println("Lista de interseção: " + listaEncadeada.conjuntoInterseccao(lista1, lista2));
        System.out.println("Lista intercalada 1: " + listaEncadeada.intercalar1(lista1, lista2));
        System.out.println("Lista intercalada 2 (ordenadamente): " + listaEncadeada.intercalar2(lista1, lista2));
    }
}
