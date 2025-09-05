package com.example.Employee.dao.daoimpl;

import com.example.Employee.dao.MoviesDAO;
import com.example.Employee.entity.Employee;
import com.example.Employee.entity.Movies;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MoviesDAOImpl implements MoviesDAO {

    private final EntityManager theManager;

    @Autowired
    public MoviesDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void save(Movies theMovies) {
        theManager.persist(theMovies);
    }


}
