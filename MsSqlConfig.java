import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.xxx.entity")
@EnableJpaRepositories("com.xxx.repository")
@Configuration
public class MsSqlConfig {

}
