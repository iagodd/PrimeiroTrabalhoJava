import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DesenhoTeste {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "**TRABALHO FINAL IAGO PROGRAMAÇÃO 1**");
        
        Painel painelTeste = new Painel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        app.add(painelTeste);
        app.setSize(500,500);
        app.setVisible(true);
    }

}