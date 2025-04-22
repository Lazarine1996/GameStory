package com.generation.storegame.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.storegame.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
