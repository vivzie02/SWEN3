package at.fhtw.OCRMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.BasicConfigurator;

@SpringBootApplication
public class OcrMapperApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(OcrMapperApplication.class, args);
	}

}
