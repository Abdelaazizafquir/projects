/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.sql.SQLException;
    import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ABDELAAZIZ
 */
public class Conndb {


Connection con;
Statement stm;
ResultSet rst;
public Conndb(){
try{

con=DriverManager.getConnection("jdbc:mysql://localhost/student?serverTimezone=UTC","abdo","");
stm=con.createStatement();
System.out.println("Connexion au DB bien établie");
}catch(Exception e){
System.out.println("Erreur de chargement de pilote:"+e);
}
}


public void ajouter(String nom,String prenom,String email,String username,String password){
try{
String query="INSERT INTO user(nom,prenom,email,username,password) VALUES ('"+nom+"','"+prenom+"','"+email+"','"+username+"','"+password+"')";
stm.executeUpdate(query);
}catch(Exception e){
System.out.println("Erreur:"+e);
}
}



public String loginname(String username,String password){
try{
String query="select prenom from user where username='"+username+"' and password='"+password+"'";
rst=stm.executeQuery(query);
rst.next();
int nbrRow=0;
nbrRow=rst.getRow();
System.out.println(nbrRow);
if(nbrRow!=0){
    String ob=rst.getString("prenom");
System.out.println("Etudiant trouvé\t"+nbrRow);
return ob;
}
else{
System.out.println("Etudiant non trouvé");
 String o="non";
 return o;
}
}catch(Exception e){
System.out.println("Erreur:"+e);
return null;
}
    
}



public String[][] chercher(String origine,String dis,String date,String clas){
try{
String query="select * from cards where origine='"+origine+"' or distination='"+dis+"' or date='"+date+"' or class='"+clas+"'";
rst=stm.executeQuery(query);
int i=0;
while(rst.next()){
   i++;
}
     rst=stm.executeQuery(query);
System.out.println(i);
    String[][] ob=new String [i][5];
int j=0;
if(i!=0){
    while(rst.next()){
            ob[j][0]=rst.getString("origine");
            ob[j][1]=rst.getString("distination");
            ob[j][2]=rst.getString("date");
            ob[j][3]=rst.getString("class");
             ob[j][4]=rst.getString("price");
j++;
    }
    System.out.println("ticket trouvé\t"+i);
    return ob;
}
else{
System.out.println("ticket non trouvé");
 String[][] o=new String[1][1];
return o;
}
}catch(Exception e){
System.out.println("Erreur:"+e);
return null;
}
    
}


public void quitter(){
try {
this.stm.close();
this.con.close();
System.exit(0);
System.out.println("Deconnexion du systeme");
} catch (SQLException ex) {
Logger.getLogger(Conndb.class.getName()).log(Level.SEVERE, null, ex);
}
}

    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
