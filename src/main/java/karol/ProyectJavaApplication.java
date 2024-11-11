package karol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProyectJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProyectJavaApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return "Hello with java";
    }
}
