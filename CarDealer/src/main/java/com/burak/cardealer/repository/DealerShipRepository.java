/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.repository;

import com.burak.cardealer.entity.DealerShip;
import com.burak.cardealer.utility.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DealerShipRepository implements ICrud<DealerShip> {

    
    
    @Override
    public void save(DealerShip t) {
        
        try {
            
            String sqlSorgu = "insert into dealership(companyname, country, city) values(?, ?, ?)";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
            

		preparedStatement.setString(1, t.getCompanyName());
		preparedStatement.setString(2, t.getCountry());
		preparedStatement.setString(3, t.getCity());
    
		preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Override
    public void update(DealerShip dealership, Long id) {
        
         try {
            
            String sqlSorgu = "update dealerhip set companyname = ?, country = ?, city = ?, id = "+id+" ";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
            

		preparedStatement.setString(1, dealership.getCompanyName());
		preparedStatement.setString(2, dealership.getCountry());
		preparedStatement.setString(3, dealership.getCity());
    
		preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        }

    
    @Override
    public void delete(Long id) {
        
        try {
            
            String sqlSorgu = "delete from dealership where id = "+id+" ";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
            

	preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    
    @Override
    public List<DealerShip> findAll() {
    
      List<DealerShip> dealaerList = new ArrayList<>();
        
        
        String sql = "select * from dealership";
        
        try {
          ResultSet rs = DbConnection.getInstance().getConnection().prepareCall(sql).executeQuery();
           System.out.println("start");
          while(rs.next()){

              dealaerList.add(new DealerShip(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
          }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dealaerList;
    }

    
    
    @Override
    public void saveAll(List<DealerShip> t) {
        
        
         t.forEach(s->{
            
            
            String sqlSorgu = "insert into dealership(companyname, country, city,id) values(?, ?, ?,?)";
		
            PreparedStatement preparedStatement;
      try {
          preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
         

	preparedStatement.setString(1, s.getCompanyName());
	preparedStatement.setString(2, s.getCountry());
	preparedStatement.setString(3, s.getCity());
        preparedStatement.setLong(4, s.getId());
    
		preparedStatement.executeUpdate();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
                
  
        });
      
        
         }
    
    
    
    
}
