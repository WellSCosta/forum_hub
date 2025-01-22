package com.wellscosta.api.forumhub.repository;

import com.wellscosta.api.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
