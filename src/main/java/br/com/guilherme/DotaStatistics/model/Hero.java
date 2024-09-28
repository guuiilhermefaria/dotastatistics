package br.com.guilherme.DotaStatistics.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Hero(String id,
                   @JsonAlias("localized_name") String name,
                   @JsonAlias("primary_attr") String primaryAttribute,
                   @JsonAlias("attack_type") String typeOfAttack) {
}
