/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.burak.cardealer.repository;

import java.util.List;

/**
 *
 * @author user
 */
public interface ICrud<T> {
    
    void save(T t);
    
    void update(T t, Long id);
    
    void delete(Long id);
    
    List<T> findAll();
    
    void saveAll(List<T> t);
    
    
}
