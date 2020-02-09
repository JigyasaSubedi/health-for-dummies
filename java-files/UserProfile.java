import java.util.List;
import java.util.ArrayList;      

public class UserProfile{
   
   private String name = "none";
   private String birthdate = "XX-XX-XX";
   private String gender = "none";
   private int height = 0;
   private int weight = 0;
   private List<String> Allergies = new ArrayList<String>();

   public UserProfile(){
   
   }   
     
   
   public void setName(String name){
      name = name;
   }
   
   public String getName(){
      return name;
   }
   
   public void setBirthDate(String birth){
      birthdate = birth;
   }
   
   public String getBirthDate(){
      return birthdate;
   }
   
   public void setGender(String gender){
      gender = gender;
   }
   
   public String getGender(){
      return gender;
   }
   
   public void setHeight(int ht){
      height = ht;
   }
   
   public int getHeight(){
      return height;
   }
   
   public void setWeight(int wt){
      weight = wt;
   }
   
   public void addAllergies(String name){
      Allergies.add(name);
   }
   
   public List<String> getAllergies(){
      return Allergies;
   }
} 