package javase.test.d;

import java.io.UnsupportedEncodingException;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class LoggingTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingTest.class.getName());
        logger.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // TODO: 使用 logger.severe() 打印异常
//            logger.severe(e.toString());
            logger.severe((Supplier<String>) e);
        }
        logger.info("Process end.");
    }
}
