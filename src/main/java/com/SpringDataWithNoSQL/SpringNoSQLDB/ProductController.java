package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    CrudMongo crudMongo;

    @GetMapping("/saveData")
    public void saveData(){
        crudMongo.saveData();
    }


}
