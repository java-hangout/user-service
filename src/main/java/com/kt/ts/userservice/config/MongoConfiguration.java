package com.kt.ts.userservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories (basePackages = "com.kt.ts.userservice.repository")
public class MongoConfiguration {
}