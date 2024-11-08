/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import utils.Errores;

/**
 *
 * @author 2dam
 */
public interface Signable {

    public ActionUsers registrar(ActionUsers user)  throws Errores.DatabaseConnectionException, Errores.UserAlreadyExistsException, Errores.AuthenticationFailedException, Errores.PropertiesFileException, Errores.ServerConnectionException ;
    public ActionUsers login(ActionUsers user) throws Errores.DatabaseConnectionException, Errores.UserAlreadyExistsException, Errores.AuthenticationFailedException, Errores.PropertiesFileException, Errores.ServerConnectionException ;;

}


