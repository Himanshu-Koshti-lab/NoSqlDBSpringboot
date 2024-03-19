package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class CrudMongo {

    private MongoTemplate mongoTemplate;

    public CrudMongo(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void saveData(){
        for (int i = 0; i < 100000; i++) {
            var product = new Product();
            product.title = "Product " + i;
            product.description = "Description " + i;
            product.category = "Things";
            product.price = ThreadLocalRandom.current().nextInt(1000, 10000);
            product.thumbnail = "https://picsum.photos/200/300?image=" + i;
            mongoTemplate.save(product);
        }
    }


}
