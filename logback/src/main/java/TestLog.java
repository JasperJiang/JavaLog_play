import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLog {
    public static void main(String[] args) {
        //级别为debug的日志
        log.debug("Hello! debug!");
        //级别为info的日志
        log.info("Hello! info!");
        //级别为warn的日志
        log.warn("Hello! warn!");
        //级别为error的日志
        log.error("Hello! error!");
    }

}
