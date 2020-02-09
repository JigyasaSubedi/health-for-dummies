import java.util.List;
import java.util.ArrayList; 

public class Illness{
   private String illness;
   private List<String> Symptoms = new ArrayList<String>();
   private List<String> Treatments = new ArrayList<String>();

   public Illness(){
   
   }  
  
   public void setIllnessName(String ill){
      illness = ill;
   } 

   public String getIllnessName(){
      return illness;
   }
  
   public void setSymptoms(String sym){
      Symptoms.add(sym);
   }
   
   public List<String> getSymptoms(){
      return Symptoms;
   }
   
   public void setTreatments(String treat){
      Treatments.add(treat);
   }
   
   public List<String> getTreatments(){
      return Treatments;
   }
}