package com.mysec.T;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloImpl extends UnicastRemoteObject implements  Hello{
    static final Logger log = LogManager.getLogger(HelloImpl.class);

    protected HelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        log.info("Hello,This is an example RMI program.");
        return  "Hello,This is an example RMI program.";
    }
}
