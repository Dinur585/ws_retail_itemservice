import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@ComponentScan(basePackages = "com.item.*")
@EntityScan("com.item.*")
@EnableMongoRepositories
public class WsItemRetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsItemRetailServiceApplication.class, args);
	}
}
