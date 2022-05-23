/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.Gson;
import java.io.PrintWriter;
import model.persona;

/**
 *
 * @author cupej
 */
public class personaImpl {

    public static void main(String[] args) {

        //Objeto con datos//
        persona pr  = new persona();
        pr.setNombre("Luis");
        pr.setAño(20);
        pr.setDeporte("futbol");

        // Conversion con libro a Json
        Gson gson = new Gson();
        String jsonString = gson.toJson(pr);
        System.out.println(jsonString);
        
        try (PrintWriter pw = new PrintWriter("Persona.json")){
            pw.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
