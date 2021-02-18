package cn.sp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class ProviderApplication implements ApplicationContextAware {
    private static Logger logger = LoggerFactory.getLogger(ProviderApplication.class);

    @Value("${server.port}")
    String serverPort;
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("server port is "+serverPort);
    }
}
