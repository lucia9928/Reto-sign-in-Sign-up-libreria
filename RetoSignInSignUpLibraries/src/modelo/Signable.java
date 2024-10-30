/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 2dam
 */
public interface Signable {

    public void registrar(Usuario user) throws Exception;
    public Usuario login(Usuario user) throws Exception;

}

