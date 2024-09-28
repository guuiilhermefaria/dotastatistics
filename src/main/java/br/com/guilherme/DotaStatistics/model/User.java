package br.com.guilherme.DotaStatistics.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record User(@JsonAlias("account_id") String id,
                   @JsonAlias("personaname") String nickname,
                   @JsonAlias("steamid") String steamId,
                   @JsonAlias("avatarfull") String image,
                   @JsonAlias("name") String description) {
}
