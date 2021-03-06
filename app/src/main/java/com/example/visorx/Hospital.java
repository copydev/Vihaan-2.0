package com.example.visorx;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<String> hospitalName;
    private ArrayList<String> hospitalAddress;
    private ArrayList<String> phoneNum;
    private ArrayList<Double> latitude;
    private ArrayList<Double> longitude;

    Hospital(){
        hospitalAddress = new ArrayList<>();
        hospitalName = new ArrayList<>();
        phoneNum = new ArrayList<>();
        latitude = new ArrayList<>();
        longitude = new ArrayList<>();

        latitude.add(28.7496034);
        longitude.add(77.1182898);

        latitude.add(28.737806);
        longitude.add(77.121311);

        latitude.add(28.744775);
        longitude.add(77.119545);

        latitude.add(28.730183);
        longitude.add(77.126191);

        latitude.add(28.734741);
        longitude.add(77.132888);

        hospitalName.add("Health Centre");
        hospitalName.add("Jackson Hospital & Research Centre");
        hospitalName.add("Shrine Hospital LLP");
        hospitalName.add("ESI Hospital");
        hospitalName.add("Sunrise Hospital");

        hospitalAddress.add("Delhi Technological University, Shahbad Daulatpur Village, Rohini, Delhi, 110042");
        hospitalAddress.add("Jain Bharti Model School, Ground Floor, G-9/251-252, Sector-16 Opp, G Block, Sector 16G, Rohini, Delhi, 110085");
        hospitalAddress.add("13B, Shahbad Extn, Bawana Rd, Sector 17, Rohini, Delhi, 110042");
        hospitalAddress.add("Dr KN Katju Marg, Opp HP Petrol Pump, Sector 15A, Rohini, New Delhi, Delhi 110089");
        hospitalAddress.add("8-B, Plot No, 1, B4 Rd, Sector 15, Pocket 1, Rohini, New Delhi, Delhi 110089");

        phoneNum.add(null);
        phoneNum.add("08826343293");
        phoneNum.add(null);
        phoneNum.add("01127861033");
        phoneNum.add("01127894780");

    }

    public ArrayList<String> getHospitalName() {
        return hospitalName;
    }

    public ArrayList<String> getHospitalAddress() {
        return hospitalAddress;
    }

    public ArrayList<String> getPhoneNum() {
        return phoneNum;
    }

    public String getName(int pos){
        return hospitalName.get(pos);
    }
    public String getAddress(int pos){
        return hospitalAddress.get(pos);
    }
    public String getPhoneNum(int pos){
        return phoneNum.get(pos);
    }

    public Double getLatitude(int pos){return latitude.get(pos);}
    public Double getLongitude(int pos){return longitude.get(pos);}

}
