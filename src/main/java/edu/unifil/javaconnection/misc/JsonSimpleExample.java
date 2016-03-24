package edu.unifil.javaconnection.misc;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleExample {
    
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";
    public static final String URL = "url";
    public static final String DATABASE = "database";
    public static final String PORT = "port";
    
    public static HashMap<String, String> getDataConnection() {
        HashMap<String, String> data = new HashMap<>();
        
        JSONParser parser = new JSONParser();

        Object obj;
        try {
            obj = parser.parse(new FileReader("config/config.json"));

            JSONObject jsonObject = (JSONObject) obj;

            data.put(USER_NAME, (String) jsonObject.get(USER_NAME));
            data.put(PASSWORD, (String) jsonObject.get(PASSWORD));
            data.put(URL, (String) jsonObject.get(URL));
            data.put(DATABASE, (String) jsonObject.get(DATABASE));
            data.put(PORT, (String) jsonObject.get(PORT));
          
        } catch (IOException ex) {
            Logger.getLogger(JsonSimpleExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(JsonSimpleExample.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        return data;
    }


}