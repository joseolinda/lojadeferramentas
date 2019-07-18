package lojadeferramentas;

/**
 *
 * @author joseo
 */
//import java.lang.*;
//import java.util.*;
import model.dao.DAO;

public class LojaDeFerramentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vamos testar o MySQL");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Deu certo, o MySQL Carregou");
        } catch ( Exception erro ) {
            System.out.println("Deu erro: " + erro.getMessage() );
        } finally {
            
        }
    }
    
}
