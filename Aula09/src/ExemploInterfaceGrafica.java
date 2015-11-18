
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ExemploInterfaceGrafica {
    public static void main(String args[]){
        JFrame janela = new JFrame("Titulo da janela");
        JButton botao = new JButton("OK");
        janela.add(botao);
        
        class OuvinteDoBotao implements ActionListener{
            public void actionPerformed(ActionEvent ev){
                JOptionPane.showMessageDialog(null, "O botao foi clicado");
            }
        }
        
        OuvinteDoBotao ouviente = new OuvinteDoBotao();
        botao.addActionListener(ouviente);
        
        janela.setSize(100,100);
        janela.setDefaultCloseOperation(0);
        janela.setVisible(true);
    }
}
