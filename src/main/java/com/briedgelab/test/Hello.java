package com.briedgelab.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello {
    public static final Logger LOG = LogManager.getLogger(Hello.class);
    public static void main(String[] args) {
        String message = "Welcome";
        System.out.println("Hello using maven");
        LOG.debug(message + "will be printer on Debug");
        LOG.info(message + "will be printer on info");
        LOG.warn(message + "will be printer on warn");
        LOG.error(message + "will be printer on error");
        LOG.fatal(message + "will be printer on fatal");
        LOG.debug("Appending String: {}.", message);
        System.out.println(message);
        System.out.println("Hello world");
    }
}
