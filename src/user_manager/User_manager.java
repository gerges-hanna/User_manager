/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_manager;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class User_manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //GROUPS g=new GROUPS("gro1");
        //g.DeleteGroup();
        //String back=g.ShowGroups();
        //System.out.println("\n\n\n"+back);
        //USERS u=new USERS("test", "123456", "123456", "test", "6", "01662", "032151", "no");
       // u.AddUser();  
       //u.changePass();
        //GROUPS s=new GROUPS("test");
       //s.ShowGroups();
       //s.DeleteGroup();
       MAINCORE Z=new MAINCORE();
        System.out.println(Z.terminalQuery("less /etc/group"));
    }
    
}
