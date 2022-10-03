package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

  public final ElasticSearchQuery elasticSearchQuery;

  public DataSeeder(ElasticSearchQuery elasticSearchQuery) {
    this.elasticSearchQuery = elasticSearchQuery;
  }

  @Override
  public void run(String... args) throws Exception {
    elasticSearchQuery.createIndex();
  }
}
