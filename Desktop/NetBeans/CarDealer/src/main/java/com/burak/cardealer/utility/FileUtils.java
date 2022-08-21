/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.burak.cardealer.utility;

import com.burak.cardealer.entity.Car;
import com.burak.cardealer.entity.DealerShip;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.invoke.MethodHandles.constant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FileUtils {
    
    public static void main(String[] args) throws IOException {
        
       
        
        
        //readFile(constant.CARFILE).forEach(System.out::println);
        
        getCarList(readFile(Constant.CARFILE)).forEach(System.out::println);
        
        getDealerShipList(readFile(Constant.DEALERSHIPFILE)).forEach(System.out::println);
        
        
    }
    
    public static Car convertToCar(String[] array){
        
        Car car = new Car(Long.parseLong(array[0]), array[1],array[2],Long.parseLong(array[3]),Long.parseLong(array[4]));
        return car;
    }
    
    
    public static List<Car> getCarList(List<String> list){
        List<Car> cars = new ArrayList<Car>();
        
        for(String string: list){
          cars.add(convertToCar(string.split(",")));
            
        }
        
        return cars;
    }
    
    public static DealerShip convertToDealerShip(String[] array){
        
        DealerShip dealerShip = new DealerShip((int) Long.parseLong(array[0]), array[1],array[2],array[3]);
        
        return dealerShip; 
    }
    
    public static List<DealerShip> getDealerShipList(List<String> list){
        
        List<DealerShip> dealerShip = new ArrayList<DealerShip>();
        
        for(String string: list){
            dealerShip.add(convertToDealerShip(string.split(",")));
            
        }
        
        return dealerShip;
        
        
    }
    
    
    public static List<String> readFile(String path) throws FileNotFoundException, IOException{
        
        List<String> fileList = new ArrayList<String>();
        
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

         String ifadeString = "";
         while ((ifadeString = bufferedReader.readLine()) != null) {
             fileList.add(ifadeString);
          
               }
         return fileList;  

    }
    
    
    
    
}
