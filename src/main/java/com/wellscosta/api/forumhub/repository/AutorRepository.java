package com.wellscosta.api.forumhub.repository;

import com.wellscosta.api.forumhub.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
