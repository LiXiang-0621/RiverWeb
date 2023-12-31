package org.tku.database.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.tku.database.entity.Tide;

import java.util.Date;
import java.util.List;

public interface TideRepository extends JpaRepository<Tide, Long> {
    List<Tide> findByDate(Date date);
}
