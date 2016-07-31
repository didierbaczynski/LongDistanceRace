package com.windsurf.config;

import com.windsurf.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by didierbaczynski on 16-05-29.
 */
@Configuration
@ComponentScan(basePackages = "com.windsurf")
//@PropertySource("classpath:prod.properties")


public class AppConfig {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource", destroyMethod = "shutdown")
    public DataSource dataSourceForTest() {
        return new EmbeddedDatabaseBuilder()
                .generateUniqueName(true)
                .setType(EmbeddedDatabaseType.H2)
                .setScriptEncoding("UTF-8")
                .ignoreFailedDrops(true)
                .addScript("schema.sql")
                .addScripts("data.sql")
                .build();
    }

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManagerForTest() {
        return new DataSourceTransactionManager(dataSourceForTest());
    }
    @Bean
    public LongDistanceRace race() {
        LongDistanceRace race_1 = new OBXRace();
        race_1.addRacer(didier());
        race_1.addRacer(mario());
        race_1.addRacer(krunosh());
        return race_1;
    }

    @Bean
    public Racer didier(){
        return new Didier();
    }

    @Bean
    public Racer mario(){
        return new Mario();
    }

    @Bean
    public Racer krunosh(){
        return new Krunosh();
    }
}
