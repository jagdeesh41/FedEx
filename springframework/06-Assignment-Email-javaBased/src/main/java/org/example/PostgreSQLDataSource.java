package org.example;

import org.springframework.stereotype.Component;

public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails()
    {
        return new String[]{"infy","congi","capge"};
    }
}
