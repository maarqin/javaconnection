/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import edu.unifil.javaconnection.misc.JsonSimpleExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thomaz
 */
public class Conexao {
    
    private Conexao() { }
    
    public Connection getConnection() {
        Connection connection = null;
        String driverName = "com.mysql.jdbc.Driver";                        
        try {
            Class.forName(driverName);
            
            HashMap<String, String> data = JsonSimpleExample.getDataConnection();
            String url = data.get(JsonSimpleExample.URL);
            String username = data.get(JsonSimpleExample.USER_NAME);
            String password = data.get(JsonSimpleExample.PASSWORD);
                        
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        return connection;
    }
}
