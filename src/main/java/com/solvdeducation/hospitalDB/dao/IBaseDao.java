package com.solvdeducation.hospitalDB.dao;

public interface IBaseDao<T> {
    void create(T t);
    void remove(Long id);
    void getById(Long id);
    void update(T t);

}
