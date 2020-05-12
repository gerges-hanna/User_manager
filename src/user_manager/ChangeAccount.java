/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_manager;

/**
 *
 * @author gerges
 */
public class ChangeAccount {
    /*private String accountExp;
    private int inactive;
    private int min;
    private int max;
    private int warnBeforeExp;*/
    MAINCORE Z=new MAINCORE();
    private String user;
    private String date;
    private int num;

    public ChangeAccount(String user, int num) {
        this.user = user;
        this.num = num;
    }

    public ChangeAccount(String user) {
        this.user = user;
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public String ShowChanges(){
       String showQuery="sudo chage --list "+getUser();
       return Z.terminalQuery(showQuery);
   }
    public String accountExp(){
       String Query="sudo chage -E "+getDate()+" "+getUser();
       return Z.terminalQuery(Query);
   }
    public String inActive(){
       String Query="sudo chage -I "+getNum()+" "+getUser();
       return Z.terminalQuery(Query);
   }
    public String min(){
       String Query="sudo chage -m "+getNum()+" "+getUser();
        System.out.println(Query);
       return Z.terminalQuery(Query);
   }
    public String max(){
       String Query="sudo chage -M "+getNum()+" "+getUser();
       return Z.terminalQuery(Query);
   }
    public String warningBeforeExp(){
       String Query="sudo chage -W "+getNum()+" "+getUser();
       return Z.terminalQuery(Query);
   }
    
    
    
}
