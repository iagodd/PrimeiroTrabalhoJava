import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape {

    private int linha1;
    private int linha2;
    private int linha3;
    private int linha4;
    private Color cor;

    public int getLinha1(){
        return linha1;
    }
    public int getLinha2(){
        return linha2;
    }
    public int getLinha3(){
        return linha3;
    }
    public int getLinha4(){
        return linha4;
    }
    public Color getColor(){
        return cor;
    }

    public MyShape(int linha1,int linha2,int linha3,int linha4, Color cor){
        this.linha1=linha1;
        this.linha2=linha2;
        this.linha3=linha3;
        this.linha4=linha4;
        this.cor=cor;

    }


   public abstract void DesenhaForma(Graphics g);


}