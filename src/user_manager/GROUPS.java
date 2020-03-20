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
     private String GroupName;
    private String addquery="sudo -S addgroup "+getGroupName();
    private String delquery="sudo -S delgroup "+getGroupName();
    private String AddUserInGroupQuery="sudo -S "/*+getUserName*/+""+getGroupName();
    MAINCORE Z=new MAINCORE();
 void AddGroup()
 {
     Z.terminalQuery(addquery);
 }
 void DeleteGroup()
 {
     Z.terminalQuery(delquery);
 }
 void AddUserInGroup(){
     
     Z.terminalQuery(AddUserInGroupQuery);
 }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }
         
}
