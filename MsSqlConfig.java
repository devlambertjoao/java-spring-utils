import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.lambert.product.data.mssql.entity")
@EnableJpaRepositories("com.lambert.product.data.mssql.repository")
@Configuration
public class MsSqlConfig {

}
