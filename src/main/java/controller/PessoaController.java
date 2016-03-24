/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PessoaDao;
import edu.unifil.javaconnection.models.Pessoa;
import interfaces.Dao;

/**
 *
 * @author thomaz
 */
public class PessoaController {
    
    public PessoaController() {
    }
      
    public void save(Pessoa p) {
        Dao<Pessoa, Long> dao = new PessoaDao();
        
        dao.beginTransaction();
        dao.save(p);
        dao.commitTransaction();
    }
    
    
}
