package ro.ubb.lab7.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;


import java.io.Serializable;
import ro.ubb.lab7.core.model.BaseEntity;


@NoRepositoryBean
@Transactional
public interface CatalogRepository<T extends BaseEntity<ID>, ID extends Serializable>
        extends JpaRepository<T, ID> {


}
