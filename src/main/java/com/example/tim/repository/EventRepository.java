package com.example.tim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import sun.management.jdp.JdpPacket;
import sun.rmi.runtime.Log;
import com.example.tim.model.Event;

import java.util.Date;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Log> {

	List<Event> findAll();
	Event save(Event event);
	void delete(Event event);

	@Query("select b from Event b " +
			"where b.start between ?1 and ?2 and b.end between ?1 and ?2")
	List<Event> findByDatesBetween(Date start, Date end);

	@Transactional
    Event findById(Long id);
}
