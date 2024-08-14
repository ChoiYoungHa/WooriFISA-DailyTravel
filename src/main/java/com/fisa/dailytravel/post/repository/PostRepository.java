package com.fisa.dailytravel.post.repository;

import com.fisa.dailytravel.post.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @EntityGraph(attributePaths = {"postHashtags", "images"})
    Page<Post> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
