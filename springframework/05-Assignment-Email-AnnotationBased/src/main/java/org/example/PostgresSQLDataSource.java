package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pg")
@Primary
public class PostgresSQLDataSource implements DataSource{
    @Override
    public String[] getEmail() {
        return new String[]{"@infy","@cogni","@capgi"};
    }
}
