/*
The logger has been created to log all issues encounted during execution
Need to trace if json serialization and deserialization

 */

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
