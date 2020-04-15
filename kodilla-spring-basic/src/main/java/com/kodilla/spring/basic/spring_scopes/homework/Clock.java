package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
@Scope
public class Clock {

    private Time localTime;

    public Time getLocalTime() {
        return localTime;
    }
}
