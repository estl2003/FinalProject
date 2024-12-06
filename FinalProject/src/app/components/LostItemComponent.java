package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import app.entities.LostItem;
import app.repositories.LostItemRepository;

@Component
public class LostItemComponent {
    @Autowired
    private LostItemRepository lostItemRepository;


    public LostItemDTO reportLostItem(LostItemDTO lostItemDto) {
        // Convert DTO to Entity
        LostItem lostItem = new LostItem();
        lostItem.setItemName(lostItemDto.getItemName());
        lostItem.setDescription(lostItemDto.getDescription());
        lostItem.setReporterName(lostItemDto.getReporterName());
        lostItem.setReporterPhoneNumber(lostItemDto.getReporterPhoneNumber());
        lostItem.setLocation(lostItemDto.getLocation());
        lostItem.setFound(false);

        // Save the lost item
        LostItem savedItem = lostItemRepository.save(lostItem);

        // Convert back to DTO
        LostItemDTO savedDto = new LostItemDTO();
        savedDto.setItemName(savedItem.getItemName());
        savedDto.setDescription(savedItem.getDescription());
        savedDto.setReporterName(savedItem.getReporterName());
        savedDto.setReporterPhoneNumber(savedItem.getReporterPhoneNumber());
        savedDto.setLocation(savedItem.getLocation());

        return savedDto;
    }

    public LostItemDTO reportFoundItem(LostItemDTO foundItemDto) {
        // Find matching lost items
        java.util.List<LostItem> matchingLostItems = lostItemRepository
            .findByItemNameAndIsFoundFalse(foundItemDto.getItemName());

        // Notify owners of matching lost items
        for (LostItem lostItem : matchingLostItems) {
            String notificationMessage = String.format(
                "Found Item Alert: A %s matching your lost item has been reported. " +
                "Location: %s. Contact the finder at %s",
                lostItem.getItemName(),
                foundItemDto.getLocation(),
                foundItemDto.getReporterPhoneNumber()
            );

            
        }

        return foundItemDto;
    }
}