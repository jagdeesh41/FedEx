package org.example;


import org.springframework.stereotype.Component;

@Component("sql")
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmail()
    {
        return new String[]{"@gmail","@yahoo","@Microsoft"};


    }
}
