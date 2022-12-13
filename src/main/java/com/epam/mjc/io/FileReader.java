package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;



public class FileReader {

    public static Profile getDataFromFile(File file) {


        Profile profile=new Profile();
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            String line;
            String[] parts;
            while ((line = reader.readLine()) != null) {
                parts = line.split(": ", 2);
                if (parts[0].equals("Name"))
                    profile.setName(parts[1]);
                if (parts[0].equals("Age"))
                    profile.setAge(Integer.valueOf(parts[1]));
                if (parts[0].equals("Email"))
                    profile.setEmail(parts[1]);
                if (parts[0].equals("Phone"))
                    profile.setPhone(Long.valueOf(parts[1]));


            }
            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return profile;

    }


}
