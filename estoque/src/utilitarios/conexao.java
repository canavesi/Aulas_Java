package utilitarios;
import java.sql.*;
import javax.swing.*;

public class conexao
{
        final private String driver = "oracle.jdbc.driver.OracleDriver";
        final private String url = "jdbc:oracle:thin:@127.0.0.1:1521:teste";
        final private String usuario = "abx";
        final private String senha = "abx";

      
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;
        
       public boolean conecta(String driver, String url, String usuario, String senha, String banco)
       {
            boolean result = true;
            try 
            {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
                //JOptionPane.showMessageDialog(null,"conectou");
            }
            catch(ClassNotFoundException Driver) 
            {
               JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
               result = false;
            }
            catch(SQLException Fonte) 
            {
                JOptionPane.showMessageDialog(null,"Deu erro na conexão "+
                        "com a fonte de dados: "+Fonte);
                result = false;
            }
            return result; 
       }
       
         public boolean conecta()
       {
            boolean result = true;
            try 
            {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
                //JOptionPane.showMessageDialog(null,"conectou");
            }
            catch(ClassNotFoundException Driver) 
            {
               JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
               result = false;
            }
            catch(SQLException Fonte) 
            {
                JOptionPane.showMessageDialog(null,"Deu erro na conexão "+
                        "com a fonte de dados: "+Fonte);
                result = false;
            }
            return result; 
       }
       
       public void desconecta()
       {
            boolean result = true;
            try 
            {
                conexao.close();
                JOptionPane.showMessageDialog(null,"banco fechado");
            }
            catch(SQLException fecha) 
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel "+
                        "fechar o banco de dados: "+fecha);
                result = false;
            }

       }
       
       public void executeSQL(String sql)
       {
            try 
            {
                statement = conexao.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
               JOptionPane.showMessageDialog(null,"Não foi possível "+
                       "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }
       
}