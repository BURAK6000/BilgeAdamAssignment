
package com.burak.cardealer.main;

import com.burak.cardealer.entity.Car;
import com.burak.cardealer.repository.CarRepository;
import com.burak.cardealer.repository.DealerShipRepository;
import com.burak.cardealer.utility.Constant;
import com.burak.cardealer.utility.FileUtils;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Manager {

    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        
        manager.menu();
 
    }
    
    public void menu() throws IOException{
         CarRepository carRepository = new CarRepository();
         DealerShipRepository dealerShipRepository = new DealerShipRepository();
         
        Scanner scanner = new Scanner(System.in);
        boolean kontrol = true;
        int input = 0;
        do{
            System.out.println("0-Çıkış ");
            System.out.println("1-Dosyadan Databese Arabaları Aktarma");
            System.out.println("2-Dosyadan Databese Bayileri Aktarma");
            System.out.println("3-Araba ekle");
            System.out.println("4-Araba güncelle");
            System.out.println("5-Araba Sil");
            System.out.println("6-Arabaları getir");
            
            input = Integer.parseInt(scanner.nextLine());
            
            switch(input){
                case 1:
                    carRepository.saveAll(FileUtils.getCarList(FileUtils.readFile(Constant.CARFILE)));
                break;
     
                case 2:
                    dealerShipRepository.saveAll(FileUtils.getDealerShipList(FileUtils.readFile(Constant.DEALERSHIPFILE)));
                  break;
                 
                case 3:
                    System.out.println("Araba markası giriniz");
                    String marka = scanner.nextLine();
                    System.out.println("Araba modeli giriniz");
                    String model = scanner.nextLine();
                    System.out.println("Araba model yılını giriniz");
                    int modelYili = scanner.nextInt();
                    System.out.println("Araba markası giriniz");
                    System.out.println("Araba bayi id sini giriniz");
                    int bayiId = scanner.nextInt();
                    
                    carRepository.save(new Car(marka,model,modelYili,bayiId));
                    
                    break;
                case 4:
                    
                    System.out.println("Guncellecek araba markası giriniz");
                    String marka1 = scanner.nextLine();
                    System.out.println("Guncellecek araba modeli giriniz");
                    String model1 = scanner.nextLine();
                    System.out.println("Guncellecek araba model yılını giriniz");
                    int modelYili1 = scanner.nextInt();
                    System.out.println("Guncellecek araba bayi id sini giriniz");
                    int bayiId1 = scanner.nextInt();
                    System.out.println("Guncellenecek elemanın id numarasını giriniz");
                    Long n = scanner.nextLong();
                    
                    carRepository.update(new Car(marka1,model1,modelYili1,bayiId1),n );
                    break;                    
                case 5:
                    System.out.println("Silinecek elemanın id numarasını giriniz");
                            
                    carRepository.delete(scanner.nextLong());
                    break; 
                    
                case 6:
                    carRepository.findAll().forEach(System.out::println);
                    break;   
                    
                case 0:
                    kontrol = false;
                    break;                                
            }
    
        }while(kontrol);
    }
    
}
