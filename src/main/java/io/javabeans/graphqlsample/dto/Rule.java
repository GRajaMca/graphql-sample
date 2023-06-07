package io.javabeans.graphqlsample.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rule {

  private String ruleName;
  private Map<String, Object> ruleConfiguration;
}
