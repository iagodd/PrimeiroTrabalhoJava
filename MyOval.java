import java.awt.Color;
import java.awt.Graphics;

public class MyOval extends MyShape {

    
    public MyOval(int linha1,int linha2, int linha3, int linha4, Color cor){
        super(linha1,linha2,linha3,linha4,cor);
    } 

    public void DesenhaForma(Graphics d){
        d.setColor(getColor());
       // d.drawOval(getLinha4(),getLinha4(),getLinha2(),getLinha3());
        d.fillOval(getLinha4(),getLinha3(),getLinha2(),getLinha1());

    }


}