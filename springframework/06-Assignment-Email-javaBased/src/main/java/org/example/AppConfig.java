package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.example"})
@Configuration
public class AppConfig {

    @Bean
    public DataSource sql()
    {
        return new MySQLDataSource();
    }

    @Bean
    public DataSource noSql()
    {
        return new PostgreSQLDataSource();
    }

    @Bean
    public EmailService email()
    {
        // here i am not sure what implementation i take but here we took manually
        // now inside EmailService(sql()) or EmailService(noSql()) how can i achieve this
        // cant we change it dynamically
        return new EmailService(noSql());


    }


}
