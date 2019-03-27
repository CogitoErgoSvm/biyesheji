package www.hw.top;

import org.springframework.boot.SpringApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnApplication  extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}
	  @Override  
	    public void addCorsMappings(CorsRegistry registry) {  
	        registry.addMapping("/**")  
	                .allowCredentials(true)  
	                .allowedHeaders("*")  
	                .allowedOrigins("*")
	                .exposedHeaders("access-control-allow-headers",
	    					"access-control-allow-methods",
	    					"access-control-allow-origin",
	    					"access-control-max-age",
	    					"X-Frame-Options")
	                .allowedMethods("*");  
	    }  
}
