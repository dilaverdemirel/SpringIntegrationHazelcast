package org.techmytalk.springsample.integration;

import com.hazelcast.core.IQueue;
import java.util.Random;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.message.GenericMessage;

/**
 *
 * @author dilaverd
 */
public class QueueProducerMain {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new GenericXmlApplicationContext("beans-producer.xml");

        IQueue queue = (IQueue) ctx.getBean("hazelcastQueue");

        Random r = new Random();
        int threadId = r.nextInt(10);
        while (true) {
            Employee emp = new Employee("John"+threadId+"-"+r.nextInt(1000), "12345678", "Sunny Street Mac RG1");
            System.out.println("threadId : "+threadId+emp.getName());
            Message m = new GenericMessage(emp);
            queue.put(m);
            Thread.sleep(7000);
        }

    }
}
