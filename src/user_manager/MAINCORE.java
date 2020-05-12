/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author bebo
 */
public class MAINCORE {
    public String back;
    //Class Created By Abanoub Ra2fat  
    
    
    // function Created by Gerges
    public String terminalQuery(String query)
    {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "echo root| sudo -S pwd && "+query);
        StringBuilder output = new StringBuilder();
        back = null;
        try {

        Process process = processBuilder.start();

        BufferedReader reader = new BufferedReader(
        new InputStreamReader(process.getInputStream()));

        String line;
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            back=back+line+"\n";
            
        }
        
        return back.substring(4);
        } catch (Exception e) {
        }
        return "";
    }
    
    
        
    /*public void terminalQuery(String query)
    {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", "echo root| sudo -S ls ~/Desktop/ && "+query);
        StringBuilder output = new StringBuilder();
        String back = null;
        try {

        Process process = processBuilder.start();

        BufferedReader reader = new BufferedReader(
        new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
        output.append(line + "\n");
        //back=back+line;
        }

        int exitVal = process.waitFor();
        if (exitVal == 0) {
        System.out.println("Success!");
        System.out.println(output);
        System.exit(0);
        } else {
        //abnormal...
        }

        } catch (IOException e) {
        e.printStackTrace();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }*/
}