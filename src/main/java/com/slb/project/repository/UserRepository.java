package com.slb.project.repository;

import com.slb.project.entity.JournalEntry;
import com.slb.project.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {//pojo, id type
    public User findByUserName(String userName);
}
