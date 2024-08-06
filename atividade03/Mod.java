package com.mycompany.atividade03;

public class Mod {
    
    public int modulo(int x, int y){
        if(x > y){
            modulo(x - 1, y);
        }
        else if(x < y){
            return x;
        }
        return 0;
    }
}
