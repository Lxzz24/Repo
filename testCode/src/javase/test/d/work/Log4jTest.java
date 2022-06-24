package javase.test.d.work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.UnsupportedEncodingException;

public class Log4jTest {
    static final Log log = LogFactory.getLog(Log4jTest.class);

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            log.error("Invalid encoding.", e);
        }
        log.info("Process end.");
    }
}
