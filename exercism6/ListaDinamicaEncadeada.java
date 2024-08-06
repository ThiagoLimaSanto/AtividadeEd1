package exercism6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDinamicaEncadeada {
    public List<Integer> inverter(List<Integer> lista) {
        List<Integer> listaInvertida = new ArrayList<>(lista);
        int size = listaInvertida.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = listaInvertida.get(i);
            listaInvertida.set(i, listaInvertida.get(size - 1 - i));
            listaInvertida.set(size - 1 - i, temp);
        }
        return listaInvertida;
    }
    public List<Integer> retornarImpares(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaImpares = new ArrayList<>();
        for (int numero : lista1) {
            if (numero % 2 != 0) {
                listaImpares.add(numero);
            }
        }
        for (int numero : lista2) {
            if (numero % 2 != 0) {
                listaImpares.add(numero);
            }
        }
        return listaImpares;
    }

    // Método para concatenar duas listas
    public List<Integer> concatenar(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaConcatenada = new ArrayList<>(lista1);
        listaConcatenada.addAll(lista2);
        return listaConcatenada;
    }

    // Método para encontrar a interseção entre duas listas
    public List<Integer> conjuntoInterseccao(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaInterseccao = new LinkedList<>();
        for (int elemento : lista1) {
            if (lista2.contains(elemento) && !listaInterseccao.contains(elemento)) {
                listaInterseccao.add(elemento);
            }
        }
        return listaInterseccao;
    }

    // Método para intercalar duas listas (na ordem de aparecimento)
    public List<Integer> intercalar1(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaIntercalada = new ArrayList<>();
        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            listaIntercalada.add(lista1.get(i++));
            listaIntercalada.add(lista2.get(j++));
        }
        while (i < lista1.size()) {
            listaIntercalada.add(lista1.get(i++));
        }
        while (j < lista2.size()) {
            listaIntercalada.add(lista2.get(j++));
        }
        return listaIntercalada;
    }

    // Método para intercalar duas listas (ordenadamente)
    public List<Integer> intercalar2(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaIntercalada = new ArrayList<>(lista1);
        listaIntercalada.addAll(lista2);
        listaIntercalada.sort(null); // Ordena a lista
        return listaIntercalada;
    }
}
