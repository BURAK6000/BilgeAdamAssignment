/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.repository;

import com.burak.cardealer.entity.Car;
import com.burak.cardealer.utility.Constant;
import com.burak.cardealer.utility.DbConnection;
import com.burak.cardealer.utility.FileUtils;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarRepository implements ICrud<Car> {
    
    public static void main(String[] args) throws IOException {
        Car c;
        
        
        CarRepository carRepository = new CarRepository();
        
        //carRepository.saveAll(FileUtils.getCarList(FileUtils.readFile(Constant.CARFILE)));
        
        //carRepository.update(new Car("","",1,100), Long.valueOf(3));
        //carRepository.delete(5l);
        
        
        carRepository.findAll().forEach(System.out::println);
        
    }
    
    @Override
    public void save(Car t) {
        try {
            
            String sqlSorgu = "insert into car(brand, car_model, model_year, dealership_id) values(?, ?, ?,?)";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
            

		preparedStatement.setString(1, t.getBrand());
		preparedStatement.setString(2, t.getCarModel());
		preparedStatement.setLong(3, t.getModelYear());
                preparedStatement.setLong(4, t.getDealerShipId());

		preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    @Override
    public void update(Car car, Long id) {
        
         try {
            
            String sqlSorgu = "update "+car+" set brand = ?, car_model = ?, model_year = ?, dealership_id = ? where id = "+id+"";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
            

		preparedStatement.setString(1, car.getBrand());
		preparedStatement.setString(2, car.getCarModel());
		preparedStatement.setLong(3, car.getModelYear());
                preparedStatement.setLong(4, car.getDealerShipId());

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
            
            String sqlSorgu = "delete from car where id = "+id+"";
		
            PreparedStatement preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);

		preparedStatement.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
     }

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        
        
        String sql = "select * from car";
        
        try {
          ResultSet rs = DbConnection.getInstance().getConnection().prepareCall(sql).executeQuery();
           System.out.println("start");
          while(rs.next()){

              carList.add(new Car(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
          }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return carList;
		
    }


    @Override
    public void saveAll(List<Car> t) {
        
        t.forEach(s->{
            String sqlSorgu = "insert into car(brand, car_model, model_year, dealership_id,id) values(?, ?, ?, ?,?)";
		
            PreparedStatement preparedStatement;
            
            try {
                preparedStatement = DbConnection.getInstance().getConnection().prepareStatement(sqlSorgu);
                
                preparedStatement.setString(1, s.getBrand());
		preparedStatement.setString(2, s.getCarModel());
		preparedStatement.setLong(3, s.getModelYear());
                preparedStatement.setLong(4, s.getDealerShipId());
                preparedStatement.setLong(5, s.getId());

		preparedStatement.executeUpdate();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
                
  
        });
        
        
       }


    
}
