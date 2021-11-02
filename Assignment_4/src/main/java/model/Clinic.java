/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ui.AddPatientPanel;
import ui.MainJFrame;

/**
 *
 * @author Milind
 */
public class Clinic {
    
      private static Clinic clinic = new Clinic();
    
   
    
    ArrayList<Patient> patientDirectory =new ArrayList<Patient>();
    
    City city = new City("Boston");
    
    

    public Clinic() {
       
    }
    
    public static Clinic getInstance( ) {
      return clinic;
   }

    
    
    public List<String> getListABnormal(int co, int agelow, int agehigh){
    
        List<String> arr=new ArrayList<String>();
    
    arr=city.communityList.get(co-1).listOfAbnormalPatiens(agelow, agehigh);
    return arr;
    }

    
    
    public ArrayList<Patient> getList(){
            return patientDirectory;    
    }

    public void addnewPatienttoTheDirectory(String nameIn,int ageIn,String mobileIn, String commu, String zip,String add, int respi, int heart, int bp, int kg) {
        
       


        
        int age1;
        
        //Scanner scanner = new Scanner(System.in);
        String patientName = null;
        String mobileNumber = null;


        patientName = nameIn;
        age1=ageIn;
        int age = age1;
        mobileNumber = mobileIn;

        

        Community comm = city.addCommunityToCity(commu,zip);
        House house1 = comm.addNewHouseToCommunity(add);

        Patient patient = new Patient(patientName, age, mobileNumber, house1);
        house1.addPatientInHouse(patient);

        
        patient.newEncounter(respi,heart,bp,kg);
        
        patientDirectory.add(patient);
       
        
        

    }

   
    
  

 

    private int checkIfNumberALreadyExists(String mobileNumber) {
        for (int i = 0; i < patientDirectory.size(); i++) {

            {
                if (patientDirectory.get(i).getMobileNumber() == null ? mobileNumber == null : patientDirectory.get(i).getMobileNumber().equals(mobileNumber)) {

                    return i;
                }
            }

        }
        return -1;
    }

    public void addEncountertoExsistingPatient(String mobile) {

       
        String mobilenum = mobile;
        if (checkIfNumberALreadyExists(mobilenum) == -1) {
            
        } else {
            

            avalibleOptions(patientDirectory.get(checkIfNumberALreadyExists(mobilenum)));

        }
    }

    
    
    public List<String> listCom(){
        java.util.List<String> commList=new ArrayList<String>();
        commList=city.printCommunityList();
        System.out.println(commList);
        return commList;    
    }

    public static void avalibleOptions(Patient patient) {

   

            
    }

}
