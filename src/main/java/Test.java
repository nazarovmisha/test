import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("Test log from{}", Test.class.getSimpleName());
    }
}
