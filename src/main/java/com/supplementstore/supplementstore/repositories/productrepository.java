package com.supplementstore.supplementstore.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplementstore.supplementstore.entites.Products;

@Repository
public interface productrepository extends JpaRepository<Products,Long> {

	
	
}
