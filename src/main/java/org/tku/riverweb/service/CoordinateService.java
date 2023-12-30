package org.tku.riverweb.service;

import org.tku.riverweb.dao.CoordinateDao;

import org.tku.riverweb.entity.Coordinate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CoordinateService {
    @Autowired
    CoordinateDao coordinateDao;
    public Iterable<Coordinate> getCoordinate () {
        return coordinateDao.findAll();
    }
}
