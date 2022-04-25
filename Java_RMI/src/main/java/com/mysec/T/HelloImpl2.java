package com.mysec.T;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl2 implements Hello{
    public HelloImpl2() {
        UnicastRemoteObject.exportObject(HelloImpl2,9999);
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Test";
    }
}
