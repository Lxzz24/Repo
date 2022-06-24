package javase.test.d.work;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.UnsupportedEncodingException;

public class CommonLogTest {
//    public static void main(String[] args) {
//        Log log = LogFactory.getLog(CommonLogTest.class);
//        log.info("start...");
//        log.warn("end.");
//    }
    static final Log log = LogFactory.getLog(CommonLogTest.class);

    public static void main(String[] args) {
        log.info("Start process...");
        try {
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e) {
            // TODO: 使用log.error(String, Throwable)打印异常
            log.error("invalid charset name", e);
        }
        log.info("Process end.");
    }
}
