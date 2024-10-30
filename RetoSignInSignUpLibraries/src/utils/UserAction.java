/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.Serializable;

/**
 * UserAction enum defines actions related to user interactions with the server.
 * This enum is primarily used to specify the type of request being made, 
 * such as registering a new user or logging in an existing user.
 * 
 * @author 2dam
 */
public enum UserAction implements Serializable{
    
    /** Request to register a new user */
    REGISTER_REQUEST,
    
    /** Request to log in an existing user */
    LOGIN_REQUEST;

}