package com.mycompany.atividade05;

public class Lista {

    No cabeca;
    int tamanho;

    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void inicializar() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public boolean isVazia() {
        return this.cabeca == null;
    }

    public void inserir(int valor) {
        No novo = new No(valor);
        if (cabeca == null || cabeca.info >= valor) {
            novo.prox = cabeca;
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info < valor) {
                atual = atual.prox;
            }
            novo.prox = atual.prox;
            atual.prox = novo;
        }
        tamanho++;
    }

    // Remover um dado elemento
    public void remover(int valor) {
        if (cabeca == null) {
            System.out.println("Nao existe esse numero na lista!");
            return;
        }

        if (cabeca.info == valor) {
            cabeca = cabeca.prox;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info != valor) {
                atual = atual.prox;
            }
            if (atual.prox != null) {
                atual.prox = atual.prox.prox;
            }
        }
        tamanho--;
    }

    // Tamanho: retorna o número de elementos da lista
    public int tamanho() {
        return this.tamanho;
    }

    // Iguais: recebe duas listas ordenadas e verifica se elas são iguais
    public boolean iguais(Lista outraLista) {
        No atual1 = this.cabeca;
        No atual2 = outraLista.cabeca;
        while (atual1 != null && atual2 != null) {
            if (atual1.info != atual2.info) {
                return false;
            }
            atual1 = atual1.prox;
            atual2 = atual2.prox;
        }
        return atual1 == null && atual2 == null;
    }

    // Média: retorna a média aritmética simples dos elementos da lista
    public double media() {
        if (this.isVazia()) {
            return 0;
        }

        No atual = this.cabeca;
        double soma = 0;
        int count = 0;
        while (atual != null) {
            soma += atual.info;
            count++;
            atual = atual.prox;
        }
        return soma / count;
    }

    // Busca: verifica se um dado valor é pertencente à lista
    public boolean busca(int valor) {
        No atual = this.cabeca;
        while (atual != null) {
            if (atual.info == valor) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    // Elimina: elimina todas as ocorrências de um dado elemento
    public void elimina(int valor) {
        while (this.cabeca != null && this.cabeca.info == valor) {
            this.cabeca = this.cabeca.prox;
            this.tamanho--;
        }

        No atual = this.cabeca;
        while (atual != null && atual.prox != null) {
            if (atual.prox.info == valor) {
                atual.prox = atual.prox.prox;
                this.tamanho--;
            } else {
                atual = atual.prox;
            }
        }
    }

    // Elimina_: elimina um elemento que está em uma dada posição definida pelo usuário
    public void eliminaPos(int pos) {
        if (pos < 0 || pos >= this.tamanho) {
            System.out.println("Posicao invalida!");
        } else {

            if (pos == 0) {
                this.cabeca = this.cabeca.prox;
            } else {
                No atual = this.cabeca;
                for (int i = 0; i < pos - 1; i++) {
                    atual = atual.prox;
                }
                atual.prox = atual.prox.prox;
            }
        }
        this.tamanho--;
    }

    // Insere na direita: insere um dado valor à direita do -ésimo elemento da lista
    public void insereDireita(int pos, int valor) {
        if (pos < 0 || pos >= this.tamanho) {
            System.out.println("Posicao invalida!");
        } else {

            No novo = new No(valor);
            No atual = this.cabeca;
            for (int i = 0; i < pos; i++) {
                atual = atual.prox;
            }
            novo.prox = atual.prox;
            atual.prox = novo;
            this.tamanho++;
        }
    }

    // Insere na esquerda: insere um dado valor à esquerda do -ésimo elemento da lista
    public void insereEsquerda(int pos, int valor) {
        if (pos < 0 || pos > this.tamanho) {
            System.out.println("Posicao invalida!");
        } else {

            if (pos == 0) {
                inserir(valor);
            } else {
                No novo = new No(valor);
                No atual = this.cabeca;
                for (int i = 0; i < pos - 1; i++) {
                    atual = atual.prox;
                }
                novo.prox = atual.prox;
                atual.prox = novo;
                this.tamanho++;
            }
        }
    }
}
