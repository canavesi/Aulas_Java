class exemplo_if

{ public static void main(final String args[])

  {
      double valor = 4.5;

        if (valor >= 7)
          System.out.println("O aluno esta aprovado");
        else if (valor >=5)
          System.out.println("O aluno esta em recuperação");
        else if (valor >=4)
          System.out.println("O aluno esta em recuperação (Exame)");
        else
          System.out.println("O aluno esta em reprovado");

  }

}