/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.common;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author user
 */
public class log {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(log.class);
        logger.log(MyTraceLevel.MY_TRACE, "I am MY_TRACE log");
        logger.log(Level.DEBUG, "I am a debug message");
    }
}
