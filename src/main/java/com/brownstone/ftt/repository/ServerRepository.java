package com.brownstone.ftt.repository;

import com.brownstone.ftt.entity.Server;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends ReactiveMongoRepository<Server, String> {

}
