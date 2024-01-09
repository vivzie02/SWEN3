package at.fhtw.OCRMapper;

import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcrMapperApplication {
	private static final Logger log = LogManager.getLogger(OcrMapperApplication.class);

	public static void main(String[] args) {
		log.info("Start");
		BasicConfigurator.configure();
		SpringApplication.run(OcrMapperApplication.class, args);
	}
}
