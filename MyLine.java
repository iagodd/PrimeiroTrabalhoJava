import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends MyShape {

    
    public MyLine(int linha1,int linha2, int linha3, int linha4, Color cor){
        super(linha1,linha2,linha3,linha4,cor);
    } 

    public void DesenhaForma(Graphics d){
        d.setColor(getColor());
        d.drawLine(getLinha1(),getLinha2(),getLinha3(),getLinha4());
    }


}

