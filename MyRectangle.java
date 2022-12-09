import java.awt.Color;
import java.awt.Graphics;


public class MyRectangle extends MyShape {

    
    public MyRectangle(int linha1,int linha2, int linha3, int linha4, Color cor){
        super(linha1,linha2,linha3,linha4,cor);
    } 

    public void DesenhaForma(Graphics d){
        d.setColor(getColor());
       // d.drawRect(getLinha1(),getLinha2(),getLinha3(),getLinha4());
        d.fillRect(getLinha4(),getLinha3(),getLinha2(),getLinha1());
    }
   
}