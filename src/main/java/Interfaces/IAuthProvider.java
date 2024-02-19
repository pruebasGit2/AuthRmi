/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import classes.Args.LoginArgs;
import classes.Args.RegisterArgs;
import classes.Response;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Diego
 */
public interface IAuthProvider extends Remote {
    
    /**
     *  Given a token check if the token is valid
     * @param token
     * @return 
     * @throws RemoteException
     */
    public Response<Boolean> Auth(String token) throws RemoteException;
    
    /**
     *
     * @param loginArgs
     * @return response with token
     * @throws RemoteException
     */
    public Response<String> Login(LoginArgs loginArgs) throws RemoteException;
    
    /**
     *
     * @param registerArgs
     * @return response with token
     * @throws RemoteException
     */
    public Response<String> Register(RegisterArgs registerArgs) throws RemoteException;
    
}
