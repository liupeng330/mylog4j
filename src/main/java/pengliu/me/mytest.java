package pengliu.me;

import com.oracle.webservices.internal.api.message.PropertySet;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class mytest
{
    public static void main(String[] args)
    {
//        BasicConfigurator.configure();
        PropertyConfigurator.configure("/Users/peng/IdeaProjects/log4jtest/target/classes/log4j.properties");

        Logger logger = Logger.getLogger("com.foo");
        logger.setLevel(Level.INFO);

        Logger barLogger = Logger.getLogger("com.foo.bar");

        for(int i=0; i< 40000; i++)
        {
            barLogger.fatal("FAtal!!");
            barLogger.error("error!!");
            barLogger.warn("Warning!!");
            barLogger.info("INFO!!");
            barLogger.debug("test");
        }

        Logger barLogger2 = Logger.getLogger("com.foo.bar");
        System.out.println(barLogger);
        System.out.println(barLogger2);
        System.out.println(barLogger == barLogger2);
    }
}
