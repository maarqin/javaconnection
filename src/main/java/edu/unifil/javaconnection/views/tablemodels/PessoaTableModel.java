/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.views.tablemodels;

import edu.unifil.javaconnection.models.Pessoa;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mhadaniya
 */
public class PessoaTableModel extends AbstractTableModel {

    Pessoa listaPessoas[] = new Pessoa[10];
    
    
    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
