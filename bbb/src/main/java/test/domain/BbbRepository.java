package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "bbbs", path = "bbbs")
public interface BbbRepository extends PagingAndSortingRepository<Bbb, Long> {}
