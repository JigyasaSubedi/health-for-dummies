import java.util.List;
import java.util.ArrayList; 

/**
 * This is the illness class. This class records the data of illnesses,
 * which include illness as name, symptoms and treatments
 * 
 * @author Laura Friel
 * @version Feb. 9th 2020
 */
public class Illness{
   private String illness;
   private List<String> symptoms = new ArrayList<String>();
   private List<String> treatments = new ArrayList<String>();

   /**
    * Constructor for the illness class
    * @param ill     name of illness
    * @param sym     some initial symptom
    * @param treat   some initial treatment
    */
   public Illness(String ill, String sym, String treat){
      illness = ill;
      symptoms.add(sym);
      treatments.add(treat);
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
   public void addSymptom(String sym){
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
   public void addTreatment(String treat){
      treatments.add(treat);
   }
   
   /**
    * Return list of treaments
    * @return list of treatmens
    */
   public List<String> getTreatments(){
      return treatments;
   }

   public String toString() {
      return illness + "\nSymptoms include: " + symptoms + "\nTreatments include: " + treatments;
   }

   /**
    * Main to test illness class
    * @param args
    */
   public static void main (String [] args) {
      Illness test = new Illness("Sore Throat","Trouble swallowing","Throat spray");
      System.out.println(test);
      test.addSymptom("Swollen glands");
      System.out.println(test);
   }
}