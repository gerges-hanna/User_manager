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
public class USERS {
    
    //Created by bebo Ra2fat
    MAINCORE Z=new MAINCORE();
       private String UserName;
       private String Pw ;
       private String ConPw;
       private String FullName;
       private String RoomNumber;
       private String WorkPhone;
       private String HomePhone;
       private String Other;
       
       
       
      

    public USERS() {
        
    }
      
       //Create constructor
       public USERS(String UserName,String Pw,String ConPw,String FullName,String RoomNumber,String WorkPhone,String HomePhone,String Other)
       {
           this.UserName=UserName;
           this.Pw=Pw;
           this.ConPw=ConPw;
           this.FullName=FullName;
           this.RoomNumber=RoomNumber;
           this.WorkPhone=WorkPhone;
           this.HomePhone=HomePhone;
           this.Other=Other;
           
       }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPw() {
        return Pw;
    }

    public void setPw(String Pw) {
        this.Pw = Pw;
    }

    public String getConPw() {
        return ConPw;
    }

    public void setConPw(String ConPw) {
        this.ConPw = ConPw;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getWorkPhone() {
        return WorkPhone;
    }

    public void setWorkPhone(String WorkPhone) {
        this.WorkPhone = WorkPhone;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    public String getOther() {
        return Other;
    }

    public void setOther(String Other) {
        this.Other = Other;
    }

    //Function Created Bebo
   //Sting Updated by Gerges 
    
   public void AddUser(){

       
       String AddUserQuery="echo -e "+this.getPw()+"\"\\n\""+this.getConPw()+"\"\\n\""+getFullName()+"\"\\n\""+getRoomNumber()+"\"\\n\""+getWorkPhone()+"\"\\n\""+getHomePhone()+"\"\\n\""+getOther()+"|sudo -S adduser "+this.getUserName() ;
       Z.terminalQuery(AddUserQuery);
   }
     public void DeleteUser(){
       String DeleteUserQuery="sudo -S deluser "+getUserName();
       Z.terminalQuery(DeleteUserQuery);
   }
     
     //Created by gerges
     
     public void changeInfo()
     {
       String inf="sudo chfn -f "+getFullName()+" -h "+getHomePhone()+" -r "+getRoomNumber()+" -o "+getOther()+" -w "+getWorkPhone()+" "+getUserName();
       Z.terminalQuery(inf);
     }
     public void changePass()
     {
         String cahnge="echo -e "+this.getPw()+"\"\\n\""+this.getConPw()+"|sudo passwd "+getUserName();
         Z.terminalQuery(cahnge);
     }
     public void ShowUsers()
    {
        Z.terminalQuery("less /etc/passwd");
    }
}
