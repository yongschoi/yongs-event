package yongs.temp.db.mapper;

import java.util.List;

import yongs.temp.db.vo.Event;

public interface EventMapper {
	public List<Event> getEvents() throws Exception;
}