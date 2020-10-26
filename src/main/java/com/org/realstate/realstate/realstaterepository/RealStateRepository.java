package com.org.realstate.realstate.realstaterepository;

import com.org.realstate.realstate.model.RealState;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RealStateRepository extends MongoRepository<RealState,String> {
}
