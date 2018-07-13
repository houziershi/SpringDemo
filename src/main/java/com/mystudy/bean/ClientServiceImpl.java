package com.mystudy.bean;

public class ClientServiceImpl implements ClientService {
    @Override
    public void clientService() {
        System.out.println("<client service> "+this.getClass().getName());
    }
}
