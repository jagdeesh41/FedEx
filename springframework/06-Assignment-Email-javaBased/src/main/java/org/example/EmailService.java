package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class EmailService
{
    private DataSource dataSource;

    EmailService(DataSource dataSource)
    {
        this.dataSource=dataSource;
    }


    public void sendEmail()
    {
        String[] emails=this.dataSource.getEmails();
        for(String email:emails)
        {
            System.out.println(email);
        }



    }






}
