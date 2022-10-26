package lk.easycar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppInitializer{
    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class);
    }

//    @Override
//    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//        registration.setMultipartConfig(new MultipartConfigElement(System.getProperty("java.io.tmpdir")));
//    }
}
