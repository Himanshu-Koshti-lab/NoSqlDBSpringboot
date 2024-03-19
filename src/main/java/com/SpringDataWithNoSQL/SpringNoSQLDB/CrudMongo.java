package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class CrudMongo {

    private MongoTemplate mongoTemplate;

    private ProductRepo productRepo;

    public CrudMongo(MongoTemplate mongoTemplate, ProductRepo productRepo) {
        this.mongoTemplate = mongoTemplate;
        this.productRepo = productRepo;
    }

    public void saveData() {
        for (int i = 0; i < 10; i++) {
            var product = new Product();
            product.title = "Product " + i;
            product.description = "Description " + i;
            product.category = "Things";
            product.price = ThreadLocalRandom.current().nextInt(1000, 10000);
            product.thumbnail = "https://picsum.photos/200/300?image=" + i;
            mongoTemplate.save(product);
        }
    }

    public void showAllData() {
        List<Product> productList = mongoTemplate.findAll(Product.class);
        productList.stream().forEach(product -> {
            System.out.println(product.id + "  " + product.title + "  " + product.price);
        });
    }


    public void deleteAllData(){
//        Criteria criteriaIsThing = Criteria.where("category").is("Thing");
//        Criteria priceRange =  Criteria.where("price").gt(1000).lt(10000);
//        Query query = Query.query(criteriaIsThing).addCriteria(priceRange);
//        mongoTemplate.findAllAndRemove(query, Product.class);

        productRepo.deleteAll();
    }
}
