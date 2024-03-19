package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, ObjectId> {
}
