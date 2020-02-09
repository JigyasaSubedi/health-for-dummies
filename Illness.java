import java.util.List;
import java.util.ArrayList; 

/**
 * This is the illness class. This class records the data of illnesses,
 * such as name, symptoms and treatments
 * 
 * @author Sabryn, Laura
 * @version 2/8/20
 */
public class Illness{
   private String illness;
   private List<String> symptoms;
   private List<String> treatments;

   /**
    * Constructor for the illness class
    */
   public Illness(){
      symptoms = new ArrayList<String>();
      treatments = new ArrayList<String>();
   }  
  
   /**
    * Set illness instance variable (name of illness)
    * @param ill
    */
   public void setIllnessName(String ill){
      illness = ill;
   } 

   /**
    * Getter for illness names
    * @return name of illness
    */
   public String getIllnessName(){
      return illness;
   }
  
   /**
    * Add a symptom to symptom list
    * @param sym
    */
   public void setSymptoms(String sym){
      symptoms.add(sym);
   }
   
   /**
    * Return a list of symptoms
    * @return list of symptoms
    */
   public List<String> getSymptoms(){
      return symptoms;
   }
   
   /**
    * Add a treatment to treatment list
    * @param treat
    */
   public void setTreatments(String treat){
      treatments.add(treat);
   }
   
   /**
    * Return list of treaments
    * @return list of treatmens
    */
   public List<String> getTreatments(){
      return treatments;
   }
}