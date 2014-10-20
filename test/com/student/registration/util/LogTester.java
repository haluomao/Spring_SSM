package com.student.registration.util;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by haluomao on 14/10/19.
 */
public class LogTester {
    private static final Logger logger = LoggerFactory.getLogger(LogTester.class);

    @Test
    public void test(){
        //System.setProperty("log4j.configuration", "/WEB-INF/config/log4j.properties");
        PropertyConfigurator.configure("WebContent/WEB-INF/config/log4j.properties");
        LogTester.logger.debug("Test Debug");
        LogTester.logger.info("Test info");
        LogTester.logger.error("Test error");
        LogTester.logger.info("Test Over!");
    }

//    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//    InputStream inputStream = classLoader.getResourceAsStream("logging.properties");
//    if (inputStream != null) {
//        try {
//            LogManager.getLogManager().readConfiguration(inputStream);
//        } catch (SecurityException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
    public static void main(String[]args){
        LogTester lt = new LogTester();
        lt.test();
    }
}
