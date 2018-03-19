package com.tiwitter.demo.controller.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.social.twitter.api.*;

import java.util.Date;

@Document(collection = "tweets")
public class Tweets {

    @Id
    private Long id;
    private String idStr;
    private String text;
    private Date createdAt;
    private String fromUser;
    private String profileImageUrl;
    private Long toUserId;
    private Long inReplyToStatusId;
    private Long inReplyToUserId;
    private String inReplyToScreenName;
    private long fromUserId;
    private String languageCode;
    private String source;
    private Integer retweetCount;
    private boolean retweeted;
    private Tweets retweetedStatus;
    private boolean favorited;
    private Integer favoriteCount;
    private Entities entities;
    private TwitterProfile user;

    public Tweets() {
    }

    public Long getId() {
        return id;
    }

    public String getIdStr() {
        return idStr;
    }

    public String getText() {
        return text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getFromUser() {
        return fromUser;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public long getFromUserId() {
        return fromUserId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getSource() {
        return source;
    }

    public Integer getRetweetCount() {
        return retweetCount;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public Tweets getRetweetedStatus() {
        return retweetedStatus;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    public Entities getEntities() {
        return entities;
    }

    public TwitterProfile getUser() {
        return user;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Tweets(Tweet tweet) {
        this.id = tweet.getId();
        this.idStr = tweet.getIdStr();
        this.text = tweet.getText();
        this.createdAt = tweet.getCreatedAt();
        this.fromUser = tweet.getFromUser();
        this.profileImageUrl = tweet.getProfileImageUrl();
        this.toUserId = tweet.getToUserId();
        this.inReplyToStatusId = tweet.getInReplyToStatusId();
        this.inReplyToUserId = tweet.getInReplyToUserId();
        this.inReplyToScreenName = tweet.getInReplyToScreenName();
        this.fromUserId = tweet.getFromUserId();
        this.languageCode = tweet.getLanguageCode();
        this.source = tweet.getSource();
        this.retweetCount = tweet.getRetweetCount();
        this.retweeted = tweet.isRetweeted();
        this.favorited = tweet.isFavorited();
        this.favoriteCount = tweet.getFavoriteCount();
        this.entities =  new Entities(tweet.getEntities().getUrls(),
                tweet.getEntities().getHashTags(), tweet.getEntities().getMentions(),
                tweet.getEntities().getMedia(), tweet.getEntities().getTickerSymbols());
        this.user = tweet.getUser();
    }

}
