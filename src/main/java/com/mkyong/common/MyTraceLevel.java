
package com.mkyong.common;
import org.apache.log4j.Level;
/**
 *
 * @author user
 */

    public class MyTraceLevel extends Level { 

 
 public static final int MY_TRACE_INT = DEBUG_INT - 10; 
 
 public static final Level MY_TRACE = new MyTraceLevel(MY_TRACE_INT,"MY_TRACE",7);

     
     protected MyTraceLevel(int arg0, String arg1, int arg2) {
         super(arg0, arg1, arg2);

     }

     public static Level toLevel(String sArg) {
         if (sArg != null && sArg.toUpperCase().equals("MY_TRACE")) {
             return MY_TRACE;
         }
         return (Level) toLevel(sArg, Level.DEBUG);
     }

  
     public static Level toLevel(int val) {
         if (val == MY_TRACE_INT) {
             return MY_TRACE;
         }
         return (Level) toLevel(val, Level.DEBUG);
     }

    
     public static Level toLevel(int val, Level defaultLevel) {
         if (val == MY_TRACE_INT) {
             return MY_TRACE;
         }
         return Level.toLevel(val,defaultLevel);
     }

     
 public static Level toLevel(String sArg, Level defaultLevel) {     
        if(sArg != null && sArg.toUpperCase().equals("MY_TRACE")) {
            return MY_TRACE;
        }
        return Level.toLevel(sArg,defaultLevel);
 }
}

