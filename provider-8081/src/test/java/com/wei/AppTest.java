package com.wei;

import static org.junit.Assert.assertTrue;

import com.wei.dao.UserDao;
import com.wei.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{

    @Autowired
    private UserService userService;
    @Test
    public void test()
    {
        boolean delete = userService.delete("2");
        System.out.println(delete);
    }
}
