package bookdelivery;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="ordermgmts", path="ordermgmts")
public interface OrdermgmtRepository extends PagingAndSortingRepository<Ordermgmt, Long>{


}
