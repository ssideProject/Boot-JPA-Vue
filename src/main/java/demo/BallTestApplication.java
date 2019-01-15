package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BallTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BallTestApplication.class, args);
	}
	
/*	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {  
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(mapper);
	    return converter;
	}*/

}

