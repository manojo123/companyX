/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Entity.User;
import View.Backend;
import javax.swing.JOptionPane;

public class ModelUser {
    
    private User admArray[] = {new User("idat", "123"), new User("admin", "666"), new User("estupinauro", "333")};
    
    public boolean login(User u){
        for(User adm : this.admArray){
            if(u.getLogin().equals(adm.getLogin()) && u.getPassword().equals(adm.getPassword())){
                redirect();
                return true;
            }
        }
        return false;
    }
    
    public void redirect(){
        Backend b=new Backend();
        b.setVisible(true);
        
    }
}
