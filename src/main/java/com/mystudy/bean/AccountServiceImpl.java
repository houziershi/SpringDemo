package com.mystudy.bean;

public class AccountServiceImpl implements AccountService {
    @Override
    public void accountService() {
        System.out.println("<accountService> "+this.getClass().getName());
    }
}
