package com.aiss.f1api.resources;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import com.aiss.f1api.models.EventModel;
@ApiIgnore
@RestController
@RequestMapping("/events")
public class EventsResources {
    
    private String uri="https://eventsapi-v1.herokuapp.com/api/globalEvents/";
    
    @GetMapping()
    public List<EventModel> getAll() {
		ClientResource cr = null;
		EventModel [] events = null;
		try {
			cr = new ClientResource(uri);
			events = cr.get(EventModel[].class);
			
		} catch (ResourceException re) {
			System.err.println("Error when retrieving all songs: " + cr.getResponse().getStatus());
			throw re;
		}
		
		return Arrays.asList(events);
	}
    
    @DeleteMapping("{id}")
    public boolean deleteEvent(String eventId) {
		ClientResource cr = null;
		boolean success = true;
		try {
			cr = new ClientResource(uri + "/" + eventId);
			cr.setEntityBuffering(true);		// Needed for using RESTlet from JUnit tests
			cr.delete();
			
		} catch (ResourceException re) {
			System.err.println("Error when deleting the song: " + cr.getResponse().getStatus());
			success = false;
			throw re;
		}
		
		return success;
		
	}
}
