package com.maxwellhgr.no_sql.repositories;

import com.maxwellhgr.no_sql.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
