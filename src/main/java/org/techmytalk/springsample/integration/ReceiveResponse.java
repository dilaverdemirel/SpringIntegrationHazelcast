/*
 * Copyright 2007-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.techmytalk.springsample.integration;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.MessageEndpoint;

/**
 *
 * @author Nitin
 *
 */
@MessageEndpoint
public class ReceiveResponse {

    /**
     * Receive message
     *
     * @param message
     */
    public void processMessage(Message<Employee> message) {
        Employee employee = message.getPayload();
        System.out.println("Message Received \n Name :" + employee.getName() + "/n Phone : " + employee.getPhone() + "/n Address :" + employee.getAddress());

    }

}
