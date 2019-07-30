package com.fsw.lis.springbootlis;

import com.fsw.lis.springbootlis.service.serviceImpl.OrderServiceIpml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootlisApplicationTests {

    @Test
    public void contextLoads() {
        OrderServiceIpml serviceIpml = new OrderServiceIpml();
        String handle = serviceIpml.handle("1");
        System.out.println(handle);
    }

}
