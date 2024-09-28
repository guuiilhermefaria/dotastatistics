package br.com.guilherme.DotaStatistics.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserX {
    @JsonAlias("account_id")
    private String id;
    @JsonAlias("personaname")
    private String nickname;
    @JsonAlias("steamid")
    private String steamId;
    @JsonAlias("avatarfull")
    private String image;
    @JsonAlias("name")
    private String description;

    public UserX() {}

    public UserX(String id, String nickname, String steamId, String image, String description) {
        this.id = id;
        this.nickname = nickname;
        this.steamId = steamId;
        this.image = image;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSteamId() {
        return steamId;
    }

    public void setSteamId(String steamId) {
        this.steamId = steamId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", steamId='" + steamId + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'';
    }
}
