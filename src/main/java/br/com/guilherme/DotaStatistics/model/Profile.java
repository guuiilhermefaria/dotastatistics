package br.com.guilherme.DotaStatistics.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Profile(@JsonAlias("profile") UserX user,
                      @JsonAlias("rank_tier") Integer rank) {
}
