package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "cccs", path = "cccs")
public interface CccRepository extends PagingAndSortingRepository<Ccc, Long> {}
