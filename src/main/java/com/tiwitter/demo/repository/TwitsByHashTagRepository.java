package com.tiwitter.demo.repository;

import com.tiwitter.demo.controller.twitterendpoint.entity.Tweets;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitsByHashTagRepository extends MongoRepository<Tweets, Long> {
}