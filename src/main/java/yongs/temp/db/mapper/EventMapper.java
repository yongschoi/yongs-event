package yongs.temp.db.mapper;

import java.util.List;

import yongs.temp.vo.Event;

public interface EventMapper {
	public List<Event> getEvents() throws Exception;
}