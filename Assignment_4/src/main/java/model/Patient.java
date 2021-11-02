/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.awt.Panel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JPanel;
import ui.AddPatientPanel;
import ui.MainJFrame;

/**
 *
 * @author Milind
 */
public class Patient extends Person {
   
    
    

    private VitalSigns currentVitalSigns;
    private ArrayList<EncounterHistory> encounterHistory;

    public Patient(String patientName, int patientAge, String mobileNumber, House house) {
        super(patientName, patientAge, mobileNumber, house);

        encounterHistory = new ArrayList<EncounterHistory>();

    }

    public void addPersonToHouse() {

    }

    public void addEncounter(VitalSigns vs) {
        VitalSigns cvs = new VitalSigns(vs);
        EncounterHistory encounter = new EncounterHistory(cvs);
        encounterHistory.add(encounter);
        currentVitalSigns = cvs;
        
    }

    public void newEncounter(int respi, int heart, int bp, int kg) {
        
        VitalSigns vs = new VitalSigns();
        int resRate;
        int heartRate;
        int bloodPress;
        int weightK;

        

        resRate = respi;

        vs.setRespiratoryRate(resRate);

       

        heartRate = heart;
        vs.setHeartRate(heartRate);

     

        bloodPress = bp;

        vs.setSystolicBP(bloodPress);

        

        weightK = kg;

        vs.setWeightKg(weightK);

        
        double weightInPounds = weightK * 2.205;
        vs.setWeightinPounds(weightInPounds);

        DecimalFormat dfc = new DecimalFormat("#.#");
        
        EncounterHistory encounter = new EncounterHistory(vs);
        encounterHistory.add(encounter);

        currentVitalSigns = vs;
          

    }

    public List<ArrayList<String>> viewPatientEncounterHistory() {
        List<ArrayList<String>> enHis = new ArrayList<ArrayList<String>>();
        ArrayList<String> listEncounter = new ArrayList<String>();
        int n = encounterHistory.size();
        

        for (int i = 0; i < n; i++) {
        
        listEncounter.add(Integer.toString(i+1));
        listEncounter.add(encounterHistory.get(i).formattedDateTime);
        listEncounter.add(encounterHistory.get(i).getVitalSigns().toString());
        
        
        
        
        
        
        enHis.add(listEncounter);
        
        }

       
        return enHis.subList(0, 1);
    
    }

    public List<String> currentVitalSigns() {
        List<String> viewEncounter = new ArrayList<String>();
       
        viewEncounter.add(Integer.toString(encounterHistory.size()));
        viewEncounter.add(super.getPersonName() );
        viewEncounter.add(Integer.toString(super.getPersonAge()) );
        
        viewEncounter.add(encounterHistory.get(encounterHistory.size() - 1).formattedDateTime);
        viewEncounter.add(currentVitalSigns.toString());
        
        
    return viewEncounter;
    }

    public boolean isPatientNormal() {
        
        
        int age1 = super.getPersonAge();
        int heartRate = currentVitalSigns.getHeartRate();
        int respRate = currentVitalSigns.getRespiratoryRate();
        int bloodPress = currentVitalSigns.getSystolicBP();
        int w = currentVitalSigns.getWeightKg();
        double wp = currentVitalSigns.getWeightinPounds();

        if (age1 == 0) {
            if (heartRate < 119 && respRate < 29) {
                

            }
            if (heartRate > 160 && respRate > 50 && bloodPress > 70) {
               
            }
            if (heartRate < 120) {
                
            }
            return 161 > heartRate && heartRate > 119 && respRate > 29 && 51 > respRate && bloodPress > 49 && bloodPress < 71 && w > 1 && w < 4 && wp >= 4.5 && wp < 8;

        } else if (age1 == 1) {
            if (heartRate > 140 && respRate > 31 && bloodPress > 101) {
               
            }
            if (heartRate < 79 && respRate < 19) {
               

            }
            if (heartRate < 80) {
               
            }
            return 141 > heartRate && heartRate > 79 && respRate > 19 && 31 > respRate && bloodPress > 69 && bloodPress < 101 && w > 3 && w < 11 && wp >= 9 && wp < 23;
        } else if (age1 > 1 && age1 <= 3) {
            if (heartRate < 79 && respRate < 19) {
                

            }
            if (heartRate > 130 && respRate > 31 && bloodPress > 111) {
                
            }
            if (heartRate < 80) {
                
            }
            return 131 > heartRate && heartRate > 79 && respRate > 19 && 31 > respRate && bloodPress > 79 && bloodPress < 111 && w > 9 && w < 15 && wp >= 22 && wp < 32;

        } else if (age1 > 3 && age1 <= 5) {
            if (heartRate > 120 && respRate > 31 && bloodPress > 111) {
                
            }
            if (heartRate < 80 && respRate < 20) {
                

            }
            if (heartRate < 80) {
                
            }
            return 121 > heartRate && heartRate > 79 && respRate > 19 && 31 > respRate && bloodPress > 79 && bloodPress < 111 && w > 13 && w < 19 && wp >= 31 && wp < 41;
        } else if (age1 > 6 && age1 <= 12) {
            if (heartRate < 70 && respRate < 20) {
                

            }
            if (heartRate > 110 && respRate > 31 && bloodPress > 111) {
                
            }
            if (heartRate < 70) {
                
            }
            return 111 > heartRate && heartRate > 69 && respRate > 19 && 31 > respRate && bloodPress > 79 && bloodPress < 111 && w > 19 && w < 43 && wp >= 41 && wp < 93;
        } else if (age1 > 12) {
            if (heartRate > 106 && respRate > 21 && bloodPress > 111) {
                

            }
            return 106 > heartRate && heartRate > 54 && respRate > 11 && 21 > respRate && bloodPress > 79 && bloodPress < 111 && w > 50 && wp > 110;
        } else {
            return false;
        }

    }

    public boolean isThisVitalSignNormal() {
        
        int age = getPersonAge();
        int heartRate = 0;
        int bloodPress = 0;
        int weightK = 0;
        int respRate = 0;
        double weightLb = 0;
       
                

            
                bloodPress = currentVitalSigns.getSystolicBP();
                

        if (age == 0) {

            return (161 > heartRate && heartRate > 119) || (respRate > 29 && 51 > respRate) || (bloodPress > 49 && bloodPress < 71) || (weightK > 1 && weightK < 4) || (weightLb >= 4.5 && weightLb < 8);

        } else if (age== 1) {

            return 141 > heartRate && heartRate > 79 || respRate> 19 && 31 > respRate || bloodPress > 69 && bloodPress < 101 || weightK > 3 && weightK < 11 || weightLb >= 9 && weightLb < 23;
        } else if (age > 1 && age <= 3) {

            return 131 > heartRate && heartRate > 79 || respRate > 19 && 31 > respRate|| bloodPress > 79 && bloodPress < 111 || weightK > 9 && weightK < 15 || weightLb >= 22 && weightLb < 32;

        } else if (age > 3 && age <= 5) {

            return 121 > heartRate && heartRate > 79 || respRate > 19 && 31 > respRate || bloodPress > 79 && bloodPress < 111 || weightK > 13 && weightK < 19 || weightLb >= 31 && weightLb < 41;
        } else if (age > 6 && age <= 12) {

            return 111 > heartRate && heartRate > 69 || respRate > 19 && 31 > respRate || bloodPress > 79 && bloodPress < 111 || weightK > 19 && weightK < 43 || weightLb >= 41 && weightLb < 93;
        } else if (age > 12) {

            return 106 > heartRate && heartRate > 54 || respRate > 11 && 21 > respRate || bloodPress > 79 && bloodPress < 111 || weightK > 50 || weightLb > 110;
        } else {
            return false;
        }

    }

}
