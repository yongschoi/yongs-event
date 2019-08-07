package yongs.temp.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yongs.temp.db.mapper.EventMapper;
import yongs.temp.vo.Event;

@Service
public class EventService {
    private static final Logger logger = LoggerFactory.getLogger(EventService.class);	

    @Autowired
    EventMapper mapper;
    
    public List<Event> getEvents() throws Exception {
    	logger.debug("yongs-event|EventService|getEvents()");
    	/* random 하게  5초 지연 발생 */
    	Random random = new Random();
    	
    	if(random.nextBoolean())
    		try {
    			Thread.sleep(5000); // 5초 대기
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}

        return mapper.getEvents();
    }
}