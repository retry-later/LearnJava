package com.mysec.T;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 8809);
        String[] nameList = registry.list();
        for(String s : nameList){
            System.out.println(s);
        }

    }
}
