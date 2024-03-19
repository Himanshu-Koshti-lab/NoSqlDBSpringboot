# NoSQL DataBase

Non relation database like mongodb and dynamodb, we will use mongodb in this session.

## Setup 
* Setup mongodb first with default setting. 
 ```yaml
spring.data.mongodb.database=products
logging.level.org.springframework.data.mongodb.core.MongoTemplate=DEBUG
```

* Above setting used to tag database/collection
* log level set to debug to show query process by **mongo Template**


ObjectId played important role and entity need to save with

```yaml
@Document( collection = "product")
public class Product (){
 // Fields
}
```

product is entity in this project