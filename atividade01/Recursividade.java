package com.mycompany.atividade01;

import java.util.Stack;

public class Recursividade {
    
    private int contagem;

    public Recursividade() {
        this.contagem = 0;
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
    
    public void recursivo(Stack pilha, String num) {
        if (!pilha.isEmpty()) {
            if (pilha.pop().equals(num)) {
                this.contagem++;
                recursivo(pilha, num);
            } else {
                recursivo(pilha, num);
            }
        }
    }
}
