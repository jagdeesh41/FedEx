package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmails()
    {
        return new String[]{"gmail","yahoo","microsoft"};
    }
}
