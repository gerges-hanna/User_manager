/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_manager;

/**
 *
 * @author bebo
 */
public class GROUPS {
    
    //Created By Bebo Ra2fat
     private String GroupName;
    
    
    
    MAINCORE Z=new MAINCORE();
 public String AddGroup()
 {
     String addquery="sudo -S addgroup "+getGroupName();
     return Z.terminalQuery(addquery);
 }
 public String DeleteGroup()
 {
     String delquery="sudo -S delgroup "+getGroupName();
    return Z.terminalQuery(delquery);
 }
 
 

    public GROUPS(String GroupName) {
        this.GroupName = GroupName;
    }

    public GROUPS() {
    }
    

 
    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }
    
    // Created By Gerges
    public String AddUserInGroup(String groups,String user){
     String AddUserInGroupQuery="sudo usermod -a -G "+groups+" "+user;
     return Z.terminalQuery(AddUserInGroupQuery);
    }
    public String ShowGroups()
    {
        return Z.terminalQuery("less /etc/group");
    }
    
         
}
