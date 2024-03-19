package com.example.searchrestapi.repository;

import com.example.searchrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
    @Query("select p from Product p where "+ "p.name like concat('%',:query,'%')"+
            "or p.description like concat('%',':query','%')")
    List<Product> searchProducts(String query);


    @Query(value = "select * from products where "+ "p.name like concat('%',:query,'%')"+
            "or p.description like concat('%',':query',%)",nativeQuery = true)
    List<Product> searchProductsSQL(String query);


    Product findByName(String s);

    List<Product> findAllByActive(boolean flag);


    List<Product> findAllByDescription(String imRunner);

    List<Product> findAllByName(String adidas);

    List<Product> findTopAllByName(String adidas);

    List<Product> findTop2AllByName(String adidas);

    Product findByNameAndSku(String pen, String s);

    Product findByNameAndSkuAndActive(String pen, String s, boolean b);

    List<Product> findByNameOrSku(String pen, String s);

    Product findDistinctByName(String pen);

    List<Product> findByPriceGreaterThan(int i);

    List<Product> findByPriceLessThan(int i);

    List<Product> findAllByNameContaining(String didas);

    List<Product> findAllByNameLike(String pen);

    List<Product> findAllByPriceBetween(int i, int i1);

    List<Product> findAllByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<Product> findAllByNameIn(List<String> adidas);

    List<Product> findAllFirst2ByPriceBetween(int i, int i1);

    List<Product> findFirst2ByPriceBetween(int i, int i1);

    List<Product> findFirst3ByPriceBetween(int i, int i1);



    List<Product> findFirst3ByOrderByPriceAsc();

    List<Product> findFirst3ByOrderByPriceDesc();

    List<Product> findTop3ByOrderByPriceDesc();
}
