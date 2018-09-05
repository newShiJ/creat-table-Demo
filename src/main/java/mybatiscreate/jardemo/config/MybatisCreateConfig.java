package mybatiscreate.jardemo.config;

import mybatis.mybaitscreate.config.listener.DBinitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author chenmingming
 * @date 2018/9/5
 */
@Configuration
public class MybatisCreateConfig {

    @Value("${entity}")
    String entityPath;

    @Bean
    public DBinitListener listener(DataSource dataSource){
        return new DBinitListener(dataSource,entityPath);
    }


}
