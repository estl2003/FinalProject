package app.rest.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.LostItemComponent;
import app.components.LostItemDTO;

@Component
@Path("/lost-items")
public class LostItemController {
    @Autowired
    private LostItemComponent lostItemComponent;

    @POST
    @Path("/lost")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LostItemDTO reportLostItem(LostItemDTO lostItemDto) {
        return lostItemComponent.reportLostItem(lostItemDto);
    }

    @POST
    @Path("/found")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public LostItemDTO reportFoundItem(LostItemDTO foundItemDto) {
        return lostItemComponent.reportFoundItem(foundItemDto);
    }
}