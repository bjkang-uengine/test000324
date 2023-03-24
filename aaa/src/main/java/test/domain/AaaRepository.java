package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "aaas", path = "aaas")
public interface AaaRepository extends PagingAndSortingRepository<Aaa, Long> {}
