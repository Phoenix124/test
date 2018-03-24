package n7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Write simple spring boot application with Controller '/hello' that always returns next JSON:
 *
 * {
 *     "message": "Hello, ITS Partner"
 * }
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
