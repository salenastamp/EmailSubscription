package com.salena.emaillist.subscriber;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.salena.emaillist.subscriber.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

	List<Subscriber> findByName(String name);
	
	List<Subscriber> findByEmail(String email);
		
	List<Subscriber> findByNameLike(String name);
	
		}
