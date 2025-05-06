package com.fastcampus.fastcampus_project_board.repository;

import com.fastcampus.fastcampus_project_board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}