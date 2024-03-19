package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Document(collation = "products")
public class Product {
    public ObjectId id;
    public String title;
    public String description;
    public String thumbnail;
    public String category;
    public long price;
//    public Map<String,Map<?,?>> map;
//    public List<Map<String,Map<?,?>>> formalist;

}
