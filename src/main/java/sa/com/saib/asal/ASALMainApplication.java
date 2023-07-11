package sa.com.saib.asal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ASALMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ASALMainApplication.class);
        log.info("Started ASAL Application");
    }
}
