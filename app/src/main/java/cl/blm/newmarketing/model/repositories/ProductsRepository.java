package cl.blm.newmarketing.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import cl.blm.newmarketing.model.entities.Product;

/**
 *
 * @author Benjamin La Madrid <bg.lamadrid at gmail.com>
 */
@Repository
public interface ProductsRepository
    extends JpaRepository<Product, Integer>, QuerydslPredicateExecutor<Product> {

}
