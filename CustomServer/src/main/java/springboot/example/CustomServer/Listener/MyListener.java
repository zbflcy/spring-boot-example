package springboot.example.CustomServer.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.security.acl.LastOwnerException;

public class MyListener implements ServletContextListener {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.error(sce.toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.error("destroyed ");
    }
}
