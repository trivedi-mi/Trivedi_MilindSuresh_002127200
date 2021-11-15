/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Milind
 */
public class City {
    private String cityName;
    public  ArrayList<Community> communityList;

    public City(String cityName) {
        this.cityName = cityName;
        communityList =new ArrayList<Community>();
    }

    City() {
       
    }
    
    
   
     public int checkCommunityAlreadyExist(String zipcode){
     
       
         for(int i=0;i<communityList.size();i++){
               if(communityList.get(i).getZipCode() == null ? zipcode == null : communityList.get(i).getZipCode().equals(zipcode)){
                   return i;
               } else {   
               }   
         }
         return -1;
         }
    
    public Community addCommunityToCity(String commName, String ZipCode)
    {
        String community= commName;
       System.out.println(commName);

       
       System.out.println(ZipCode);
       String zipCode= ZipCode;

       
       if(checkCommunityAlreadyExist(zipCode)==-1){
            Community ck=new Community(community,zipCode);
           communityList.add(ck);
           
            return ck;
       } else{
                System.out.println("The entered community Already exists in the city");
                return communityList.get(checkCommunityAlreadyExist(zipCode)); 
       }
    } 
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
         public List<String> printCommunityList() {
        List<String> commuList=new ArrayList<String>();
        
         for(int i=0;i<communityList.size();i++){
          
             
             commuList.add(Integer.toString(i+1));
             commuList.add(communityList.get(i).getZipCode());
             
             commuList.add(communityList.get(i).getCommunityName());
         }
         
         return commuList;
         }

 
}
