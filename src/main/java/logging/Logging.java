package logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Logging {

    private static final Logger logger = LogManager.getLogger(Logging.class);

    public static void logInformation(String message)
    {
        BasicConfigurator.configure();
        logger.info(message);
    }

}
