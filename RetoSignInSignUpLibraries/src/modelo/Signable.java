/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import utils.Actions;

/**
 *
 * @author 2dam
 */
public interface Signable {

    public ActionUsers registrar(ActionUsers user) throws Exception;
    public ActionUsers login(Usuario user) throws Exception;

}

