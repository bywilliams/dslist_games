package com.kyodev.dslist.dto;

import com.kyodev.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    private Long id;
    private String title;
    private Double score;
    private String genre;
    private Integer year;
    private String platforms;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){}

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this); // entidade é a entidade game, e this é o GameDTO
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
