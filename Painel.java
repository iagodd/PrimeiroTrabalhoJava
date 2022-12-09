import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import java.util.Scanner;



public class Painel extends JPanel{

    Random random = new Random();
    Scanner leitor = new Scanner(System.in);
    ArrayList<MyShape> formas = new ArrayList<>();
    

    public Painel() {
        
        System.out.println("INFORME A QUANTIDADE DE RETANGULOS");
        int num = leitor.nextInt();

        for (int contador = 0; contador < num ; contador++ ){
        Color corQuadrado =  new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
        formas.add(new MyRectangle(random.nextInt(400),random.nextInt(400),random.nextInt(500),random.nextInt(500), corQuadrado));
        }


        System.out.println("INFORME A QUANTIDADE DE CIRCULOS");
        num = leitor.nextInt();

        for (int contador = 0; contador < num ; contador++ ){
        Color corOval =  new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
        formas.add(new MyOval(random.nextInt(400),random.nextInt(400),random.nextInt(500),random.nextInt(500), corOval));
        }

        System.out.println("INFORME A QUANTIDADE DE LINHAS");
        num = leitor.nextInt();

        for (int contador = 0; contador < num ; contador++ ){
        Color corOLinha =  new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
        formas.add(new MyLine(random.nextInt(400),random.nextInt(400),random.nextInt(500),random.nextInt(500), corOLinha));
        }

        System.out.println("INFORME A QUANTIDADE DE ARCOS");
        num = leitor.nextInt();

        for (int contador = 0; contador < num ; contador++ ){
        Color corArcos =  new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256));
        formas.add(new MyArc(random.nextInt(400),random.nextInt(400),random.nextInt(500),random.nextInt(500), corArcos));
        }

    }
        
    public void paintComponent (Graphics g){
            super.paintComponent(g);

        for (MyShape todasFormas : formas ){
            todasFormas.DesenhaForma(g);
            }
        }

       
    }
