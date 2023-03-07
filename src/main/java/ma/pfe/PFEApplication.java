package ma.pfe;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(PFEApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(PFEApplication.class);
    }
}