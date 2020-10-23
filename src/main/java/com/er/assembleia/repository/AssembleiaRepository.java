package com.er.assembleia.repository;

import com.er.assembleia.model.Assembleia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssembleiaRepository extends JpaRepository<Assembleia, Long> {}
