package com.backend;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
@ComponentScan(basePackages = {"com.backend"})

public class ProyectoConf {
    @Bean
    @Primary
    public Module datatypeHibernateModule() {
        Hibernate5Module module = new Hibernate5Module();

        return module;
    }
}
