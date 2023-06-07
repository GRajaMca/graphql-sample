package io.javabeans.graphqlsample.controller;


import io.javabeans.graphqlsample.dto.Rule;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class RuleController {

  @MutationMapping
  public Mono<Long> createRule(@Argument(name = "ruleInput") Rule rule) {
    log.info("Input :{}", rule);
    // except the Map value, rest all values are coming correctly.
    return Mono.empty();
  }

  @QueryMapping
  public Mono<Rule> getRule() {
    return Mono.just(Rule
        .builder()
        .ruleName("Test")
        .ruleConfiguration(Map.of("Config1", "Value1", "Config2", "Value2"))
        .build());
  }
}
