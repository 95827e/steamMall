package com.example.steam.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-27
 * @time: 11:03
 */
@Component
public class Game {

    private Long id;

    private String gameName;

    private String gameIntroduction;

    private String gameAbout;

    private int issuedStatu;

    private int gamePrice;

    private Date issuedDate;

    private Long posterImage;

    private Long lowestSystem;

    private Long recommentSystem;

    private int sellNum;

    private int discount;

    public Game(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameIntroduction() {
        return gameIntroduction;
    }

    public void setGameIntroduction(String gameIntroduction) {
        this.gameIntroduction = gameIntroduction;
    }

    public String getGameAbout() {
        return gameAbout;
    }

    public void setGameAbout(String gameAbout) {
        this.gameAbout = gameAbout;
    }

    public int getIssuedStatu() {
        return issuedStatu;
    }

    public void setIssuedStatu(int issuedStatu) {
        this.issuedStatu = issuedStatu;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Long getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(Long posterImage) {
        this.posterImage = posterImage;
    }

    public Long getLowestSystem() {
        return lowestSystem;
    }

    public void setLowestSystem(Long lowestSystem) {
        this.lowestSystem = lowestSystem;
    }

    public Long getRecommentSystem() {
        return recommentSystem;
    }

    public void setRecommentSystem(Long recommentSystem) {
        this.recommentSystem = recommentSystem;
    }

    public int getSellNum() {
        return sellNum;
    }

    public void setSellNum(int sellNum) {
        this.sellNum = sellNum;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}