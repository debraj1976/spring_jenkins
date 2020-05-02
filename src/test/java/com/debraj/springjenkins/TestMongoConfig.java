package com.debraj.springjenkins;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableAutoConfiguration(exclude={EmbeddedMongoAutoConfiguration.class})
@EnableAutoConfiguration
public class TestMongoConfig {


}
