// Laboratory 03 Question 1
public class Fish
{
   private String species;
   private char temperature;  // T Tropical, C Cold
   private char salinity;     // F Fresh, S Salt

   public Fish(String species, char temperature, char salinity)
   {
      this.species = species;
      this.salinity = salinity;
      this.temperature = temperature;
   }

   public String getSpecies()
   {
      return species;
   }

   public boolean waterSuitable(char temperature, char salinity)
   {
      return (temperature == this.temperature && salinity == this.salinity);
   }

   public String toString()
   {
      String description = getClass().getName() + "["
         + " species: " + species
         + ", temperature: " + temperature
         + ", salinity: " + salinity
         + " ]";
      return description;
   }
}
