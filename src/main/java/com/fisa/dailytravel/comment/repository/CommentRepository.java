package com.fisa.dailytravel.comment.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fisa.dailytravel.comment.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findByPostIdOrderByCreatedAtAscIdAsc(Long postId, Pageable pageable);
    Page<Comment> findAll(Pageable pageable);
}
