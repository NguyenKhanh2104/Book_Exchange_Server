package com.demo.demo2.repository;

import com.demo.demo2.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
        void deleteBookById(Integer id);
}
