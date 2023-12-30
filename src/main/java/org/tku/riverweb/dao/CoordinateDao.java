package org.tku.riverweb.dao;

import org.springframework.data.repository.CrudRepository;
import org.tku.riverweb.entity.Coordinate;

public interface CoordinateDao extends CrudRepository<Coordinate, Integer> {

}
