
package Visual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/// CONEXAO COM O BANCO
public class Conexao {

    private String banco;
    
    public static Connection conecta() throws SQLException{
    Connection conexao = null;

        String url = "jdbc:mysql://localhost/petshop"; 
        String user = "root"; 
        String password = "123456"; 
        
        
         try{
         conexao = DriverManager.getConnection(url, user, password);
         }catch(SQLException sqlex){
         System.out.println("Erro na conexão "+ sqlex);
         }
         return conexao;
    }
    
    
    
    /// Criar a TABELA
    
    public static void Tabela(String Tabela,String atributos) throws SQLException {
            Statement statement = null;
            Connection conexao = null;
        try {
            
            conexao = conecta();
            statement = conexao.createStatement();
            String createTableSQL = "CREATE TABLE "+Tabela+"("+atributos+");";
            System.out.println(createTableSQL);
               statement.execute(createTableSQL); // executa o comando de criação
            System.out.println("Tabela \"nomeTabela\" foi criada com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {   // sempre feche o statement a conexão com banco
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }
    }
    
    
   // CRIAR BANCO  
    public static void cria_banco(String banco)throws SQLException{
    
      String sql="CREATE DATABASE "+banco;
      Connection conxao= conecta();
      Statement stmt= conxao.createStatement();
      stmt.execute(sql);
    
    }
      
      
      
      

    public static void main(String[] args) throws SQLException{  
   
    
            
            
           //criaTabelas
          
          Tabela("animal","primary KEY ('codigo'), nome Varchar(50), data Varchar(8), cor Varchar(20), raca Varchar(50), tamanho Varchar (30), obs Varchar(100)");
       
          Tabela("servico", "primary KEY('Id_servico'), nome_servico Varchar(50),Descricao Varchar(50)");
          
          Tabela("agenda", "primary KEY('id_horario'), horario Varchar(8)");
       
          Tabela("dono", "primary KEY('id_dono'),nome Varchar(11),cpf Varchar(11), endreco Varchar(100),telefone Varchar(11), data_dono Varchar(8)");
   }
  }
     
    



