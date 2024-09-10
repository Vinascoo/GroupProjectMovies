package com.msg.groupprojectmovies.Repositories;


import com.msg.groupprojectmovies.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByGenre(String genre);
}