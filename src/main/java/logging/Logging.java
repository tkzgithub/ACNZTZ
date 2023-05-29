package logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/*
 *Project: Assurity Consulting Practical Assessment
 * Author: Tom Zimba
 * Purpose: The logger has been created to log all issues encounted during execution
 * Need to trace if json serialization and deserialization
 * @version 1.0.0
 * @since 27 May 2023

 */

public class Logging {

    private static final Logger logger = LogManager.getLogger(Logging.class);

    public static void logInformation(String message)
    {
        BasicConfigurator.configure();
        logger.info(message);
    }

}
