package com.kidzpurti.api.dao.repository;

import com.kidzpurti.api.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
//@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<ProductEntity, Long>  {

}
