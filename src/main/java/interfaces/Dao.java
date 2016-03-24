/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author thomaz
 * @param <T>
 * @param <Type>
 */
public interface Dao<T,Type extends Serializable> {
    void beginTransaction();
    void commitTransaction();
    void save(T entity);
    void delete (T entity);
    List<T> listAll();
}