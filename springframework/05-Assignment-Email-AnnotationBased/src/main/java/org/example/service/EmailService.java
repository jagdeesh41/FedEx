package org.example.service;

import org.example.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmailService
{
    private DataSource dataSource;

    @Autowired
    public EmailService(DataSource dataSource)
    {
        this.dataSource=dataSource;

    }

    public void sendEmail()
    {
        String emails[]=this.dataSource.getEmail();
        for(String email:emails)
        {
            System.out.println(email);
        }


    }



}
