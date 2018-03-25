package com.tiwitter.demo.controller.twitterendpoint.entity;

import org.springframework.social.twitter.api.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Entities {
    private static final long serialVersionUID = 1L;

    private List<UrlEntity> urls = new LinkedList<UrlEntity>();

    private List<HashTagEntity> tags = new LinkedList<HashTagEntity>();

    private List<MentionEntity> mentions = new LinkedList<MentionEntity>();

    private List<MediaEntity> media = new LinkedList<MediaEntity>();

    private List<TickerSymbolEntity> tickerSymbols = new LinkedList<TickerSymbolEntity>();

    public Entities() {
    }

    public Entities(List<UrlEntity> urls, List<HashTagEntity> tags,
                    List<MentionEntity> mentions, List<MediaEntity> media, List<TickerSymbolEntity> tickerSymbols) {
        this.urls = urls;
        this.tags = tags;
        this.mentions = mentions;
        this.media = media;
        this.tickerSymbols = tickerSymbols;
    }

    public List<UrlEntity> getUrls() {
        if (this.urls == null) {
            return Collections.emptyList();
        }
        return this.urls;
    }


    public List<HashTagEntity> getHashTags() {
        if (this.tags == null) {
            return Collections.emptyList();
        }
        return this.tags;
    }


    public List<MentionEntity> getMentions() {
        if (this.mentions == null) {
            return Collections.emptyList();
        }
        return this.mentions;
    }


    public List<MediaEntity> getMedia() {
        if (this.media == null) {
            return Collections.emptyList();
        }
        return this.media;
    }

    public List<TickerSymbolEntity> getTickerSymbols() {
        if (this.tickerSymbols == null) {
            return Collections.emptyList();
        }
        return this.tickerSymbols;
    }
}
