# TwitterApp
This is app for taking tweets from twitter api by hashTags and put it to MongoDB 
1. Make `mvn spring-boot:run`
2. Go to `http://localhost:8080/api/tweets/` - it will indicate all tweets that already exists in your db
3. To fetch tweets by id from twitter api make get request to `http://localhost:8080/api/tweets/%23java/1`
where `%23Java` is `#Java` and `1` is `pageSize` - how many tweets you would like to fetch.
4. If you want to get tweet by id make get go `http://localhost:8080/api/tweets/{id}`
5. You can also delete tweet by id. Make delete call to  `http://localhost:8080/api/tweets/{id}`
