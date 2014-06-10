package org.techmytalk.springsample.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Nitin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SpringIntegTest {

    @Autowired
    private SentRequest request = null;

    @Test
    public void testIntegration() throws InterruptedException {
        Employee emp = new Employee("John", "12345678", "Sunny Street Mac RG1");
        request.process(emp);
        Thread.sleep(10000000);
    }
}
