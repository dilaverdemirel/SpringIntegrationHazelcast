package org.techmytalk.springsample.integration;

import org.springframework.integration.annotation.Gateway;

/**
 *
 * @author Nitin
 *
 */
public interface SentRequest {

    @Gateway(requestChannel = "sendRequest")
    public void process(Employee emp);

}
