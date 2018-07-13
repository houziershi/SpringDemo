package com.mystudy.test.autowire;

import com.imooc.test.base.UnitTestBase;
import com.mystudy.bean.AccountService;
import com.mystudy.bean.ClientService;
import com.mystudy.bean.Home;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBean extends UnitTestBase {


    public TestBean() {
        super("classpath*:spring-beansautowired-my.xml");
    }

    @Test
    public void testClientServiceAndAccountService() {
        ClientService clientService =  super.getBean("clientService");
        clientService.clientService();
        AccountService accountService = super.getBean("accountService");
        accountService.accountService();
    }

    @Test
    public void testHome() {
        Home home = super.getBean("home");
        home.isWhat();
    }
}
