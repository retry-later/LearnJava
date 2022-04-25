package com.mysec.T;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloServer {
    static final Logger log = LogManager.getLogger(HelloServer.class);

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Hello hello = new HelloImpl();
        LocateRegistry.createRegistry(8809);
        java.rmi.Naming.rebind("rmi://localhost:8809/hello",hello);
        log.info("Ready");
    }
}
