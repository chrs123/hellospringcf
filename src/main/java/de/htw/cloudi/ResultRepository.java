package de.htw.cloudi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "results")
public interface ResultRepository extends MongoRepository<Result, String> {

	public Result findBySampleName(@Param("sampleName") String sampleName);

	public List<Result> findByalgorithmName(String algorithmName);

}
