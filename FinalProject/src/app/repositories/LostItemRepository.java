package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entities.LostItem;


@Repository
public interface LostItemRepository 

	extends JpaRepository<LostItem, Long>{

}

