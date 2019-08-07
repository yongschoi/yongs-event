package yongs.temp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.EventService;
import yongs.temp.vo.Event;

@RestController
@RequestMapping("/events")
public class EventController {
    private static final Logger logger = LoggerFactory.getLogger(EventController.class);	

    @Autowired
    EventService service;
    
    @GetMapping("")
    public List<Event> getEvents() throws Exception{
    	logger.debug("yongs-event|EventController|getEvents()");
        return service.getEvents();
    }
}