package com.bong.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//DAO역할 하는 DB 접근자

public interface PostsRepository extends JpaRepository<Posts,Long> {

}
