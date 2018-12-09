package com.example.tim.restController;

import com.example.tim.model.Event;
import com.example.tim.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class EventController {

	@Autowired
	EventRepository eventRepository;

	@RequestMapping(value="/allevents", method=RequestMethod.GET)
	public List<Event> allEvents() {
		return eventRepository.findAll();
	}

	@RequestMapping(value="/addevent", method= RequestMethod.POST)	public Event addEvent(@RequestBody Event event) {
		Event created = eventRepository.save(event);
		return created;
	}

	@RequestMapping(value="/event", method=RequestMethod.PATCH)
	public Event updateEvent(@RequestBody Event event) {
		return eventRepository.save(event);
	}


    @RequestMapping(value="/event", method=RequestMethod.DELETE)
    public void removeEvent(@RequestBody Event event) {
        eventRepository.delete(event);
    }

	@RequestMapping(value="/events", method=RequestMethod.GET)
	public List<Event> getEventsInRange(@RequestParam(value = "start", required = true) String start,
										@RequestParam(value = "end", required = true) String end) throws BadDateFormatException {
		Date startDate = null;
		Date endDate = null;
		SimpleDateFormat inputDateFormat=new SimpleDateFormat("yyyy-MM-dd");

		try {
			startDate = inputDateFormat.parse(start);
		} catch (ParseException e) {
			throw new BadDateFormatException("bad start date: " + start);
		}

		try {
			endDate = inputDateFormat.parse(end);
		} catch (ParseException e) {
			throw new BadDateFormatException("bad end date: " + end);
		}

		return eventRepository.findByDatesBetween(startDate, endDate);
	}

	private class BadDateFormatException extends Throwable {
		public BadDateFormatException(String dateString) {
			super(dateString);
		}
	}
}






