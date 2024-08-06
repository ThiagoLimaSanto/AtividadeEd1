package exercism2;
public class Mdc {
    private int x;
    private int y;

    public Mdc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calcular() {
        int a = x;
        int b = y;
        
        while (b != 0) {
            int valorTemporario = b;
            b = a % b;
            a = valorTemporario;
        }
        
        return a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}