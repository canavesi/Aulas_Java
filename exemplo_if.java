import javax.swing.*;

class exemplo_if

{ public static void main(final String args[])

  {

  double valor = 8.0;
  String situacao = "";

    if (valor >= 7)
      JOptionPane.showMessageDialog(null, "O aluno esta aprovado");
    else if (valor >=5)
      JOptionPane.showMessageDialog(null, "O aluno esta em recuperação");
    else
      JOptionPane.showMessageDialog(null, "O aluno esta em reprovado");

  }

}
