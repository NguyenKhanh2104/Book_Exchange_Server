package com.demo.demo2.repository;

import com.demo.demo2.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
//    List<Post> getPostResponse();
    void deletePostById(Integer id);

}