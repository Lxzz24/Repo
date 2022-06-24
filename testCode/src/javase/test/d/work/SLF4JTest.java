package javase.test.d.work;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

public class SLF4JTest {
    static final Logger logger = LoggerFactory.getLogger(SLF4JTest.class);

    public static void main(String[] args) {
        logger.info("Start process {}...", SLF4JTest.class.getName());
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // TODO: 使用logger.error(String, Throwable)打印异常
            logger.error("invalid charset name", e);
        }
        logger.info("Process end.");
    }
}
