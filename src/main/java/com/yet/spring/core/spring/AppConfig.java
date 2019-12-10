package com.yet.spring.core.spring;

import com.yet.spring.core.beans.Client;
import org.springframework.core.env.Environment;

import java.text.DateFormat;
import java.util.Date;

public class AppConfig {

    private Environment environment;

    public Date newDate() {
        return new Date();
    }


    public DateFormat dateFormat() {
        return DateFormat.getDateTimeInstance();
    }

    public Client client() {
        Client client = new Client("5", "Igor");
        client.setId(environment.getRequiredProperty("id"));
        client.setFullName(environment.getRequiredProperty("name"));
        client.setGreeting(environment.getProperty("greeting"));
        return client;
    }

}