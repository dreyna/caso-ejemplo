package pe.edu.upeu.modelo.test;

import com.google.gson.Gson;
import pe.edu.upeu.modelo.config.ConexionMysql;
import pe.edu.upeu.modelo.config.ConexionOracle;
import pe.edu.upeu.modelo.dao.UsuarioDao;
import pe.edu.upeu.modelo.daoImpl.UsuarioDaoImpl;

/**
 *
 * @author Docente
 */
public class Test {
  static UsuarioDao udao = new UsuarioDaoImpl();
  static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(ConexionOracle.getConection()!=null){
            System.out.println("Conectado Oracle");
        }else{
            System.out.println("Error");
        }
        if(ConexionMysql.getConection()!=null){
            System.out.println("Conectado Mysql");
        }else{
            System.out.println("Error");
        }
        System.out.println(g.toJson(udao.login("dreyna", "1234567")));
        
    }
    
}
