package com.andronvd.springBootFirstLesson.persistence.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andronvd.springBootFirstLesson.persistence.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
	
}
