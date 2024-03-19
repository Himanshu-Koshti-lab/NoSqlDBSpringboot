package com.SpringDataWithNoSQL.SpringNoSQLDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    CrudMongo crudMongo;

    @PostMapping("/saveData")
    public void saveData(){
        crudMongo.saveData();
    }

    @GetMapping("/getData")
    public void getData(){
        crudMongo.showAllData();
    }

    @DeleteMapping("/removeData")
    public void removeData(){
        crudMongo.deleteAllData();
    }


}
