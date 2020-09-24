import javax.swing.*;

class exemplo_if

{ private static String showInputDialog;

public static void main(final String args[])

  {
      double valor;
      String ler_nota;
      ler_nota = JOptionPane.showInputDialog("Entre com a nota");
      valor = Double.parseDouble(ler_nota);
      String situacao = "";

        if (valor >= 7)
          situacao = "O aluno esta aprovado";
        else if (valor >=5)
          situacao = "O aluno esta em recuperação";
        else if (valor >=4)
          situacao = "O aluno esta em recuperação (Exame)";
        else
          situacao = "O aluno esta em reprovado";

          JOptionPane.showMessageDialog(null, situacao );

  }

}