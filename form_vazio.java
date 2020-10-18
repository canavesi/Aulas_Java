import java.awt.*;
import javax.swing.*;

class form_vazio  extends JFrame
{
    form_vazio()
        {
            setTitle("Meu promeiro formulario");
            setSize(800,400);
            setLocation(50, 200);
            setResizable(false);
            getContentPane().setBackground(Color.red);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public static void main(String args[])
    {
           JFrame janela = new form_vazio();
           janela.show();
     }
}