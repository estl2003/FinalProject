package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import app.entities.LostItem;


@Repository
public interface LostItemRepository extends JpaRepository<LostItem, Long> {
    java.util.List<LostItem> findByItemNameAndIsFoundFalse(String itemName);
    java.util.List<LostItem> findByReporterPhoneNumber(String phoneNumber);
}


