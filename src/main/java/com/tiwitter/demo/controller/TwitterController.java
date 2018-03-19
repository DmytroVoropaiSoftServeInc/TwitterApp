package com.tiwitter.demo.controller;

import com.tiwitter.demo.controller.entity.Tweets;
import com.tiwitter.demo.repository.TwitsByHashTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/tweets",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class TwitterController {

    private Twitter twitter;
    private TwitsByHashTagRepository twitsByHashTagRepository;

    @Autowired
    public TwitterController(Twitter twitter, TwitsByHashTagRepository twitsByHashTagRepository) {
        this.twitter = twitter;
        this.twitsByHashTagRepository = twitsByHashTagRepository;
    }

    @GetMapping(value = "/")
    public List<Tweets> list() {
        return twitsByHashTagRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Tweets getById(@PathVariable final Long id) {
        return twitsByHashTagRepository.findOne(id);
    }

    @GetMapping(value = "/{hashTag}/{pageSize}")
    public List<Tweets> getTweetsByHashTag(@PathVariable final String hashTag,
                                           @PathVariable final int pageSize) {
        List<Tweets> tweetsList = new ArrayList<>();
        List<Tweet> tweets = twitter.searchOperations().search(hashTag, pageSize).getTweets();
        for (Tweet tweet : tweets) {
            tweetsList.add(new Tweets(tweet));
        }
        twitsByHashTagRepository.save(tweetsList);
        return tweetsList;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable final Long id){
        twitsByHashTagRepository.delete(id);
    }
}
