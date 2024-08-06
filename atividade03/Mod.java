package com.mycompany.atividade03;

public class Mod {
    
    int resultado;
    
    public void modulo(int x, int y){
        if(x > y){
            modulo(x - y, y);
        }
        else if(x < y){
            this.resultado = x;
        }else if(x == y){
            this.resultado = 0;
        }
    }
}
