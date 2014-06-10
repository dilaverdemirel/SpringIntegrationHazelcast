package org.techmytalk.springsample.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author dilaverd
 */
public class QueueConsumerMain {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new GenericXmlApplicationContext("beans-consumer.xml");
    }
}
