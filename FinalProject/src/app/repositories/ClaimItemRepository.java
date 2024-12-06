package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entities.ClaimItem;
import app.entities.LostItem;


@Repository
public interface ClaimItemRepository 

	extends JpaRepository<ClaimItem, Long>{
	
	List<ClaimItem> findByStatus(String status);

}

