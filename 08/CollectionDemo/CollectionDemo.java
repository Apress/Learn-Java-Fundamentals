class CollectionDemo
{
   public static void main(String[] args)
   {
      String[] planetNames = 
      {
         "Mercury", "Venus", "Earth", "Mars",
         "Jupiter", "Saturn", "Uranus", "Neptune"
      };

      Collection names = new ArrayCollection(5);
      for (int i = 0; i < planetNames.length; i++)
         names.add(planetNames[i]);
      System.out.println("Contains Mercury: " + 
                         names.contains("Mercury"));
      System.out.println("Contains Pluto: " + 
                         names.contains("Pluto"));
      System.out.println();

      names = new LinkedCollection();
      for (int i = 0; i < planetNames.length; i++)
         names.add(planetNames[i]);
      System.out.println("Contains Mercury: " + 
                         names.contains("Mercury"));
      System.out.println("Contains Pluto: " +
                         names.contains("Pluto"));
   }
}