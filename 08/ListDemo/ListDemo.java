class ListDemo
{
   public static void main(String[] args)
   {
      String[] planetNames = 
      {
         "Mercury", "Venus", "Earth", "Mars",
         "Jupiter", "Saturn", "Uranus", "Neptune"
      };
      List names = new ArrayList(5);
      for (int i = 0; i < planetNames.length; i++)
         names.add(planetNames[i]);
      print(names);
      names = new LinkedList();
      for (int i = 0; i < planetNames.length; i++)
         names.add(planetNames[i]);
      print(names);
   }

   static void addPlanetNames(List names)
   {
      names.add("Mercury");
      names.add("Venus");
      names.add("Earth");
      names.add("Mars");
      names.add("Jupiter");
      names.add("Saturn");
      names.add("Uranus");
      names.add("Neptune");
   }

   static void print(List list)
   {
      for (int i = 0; i < list.length(); i++)
         System.out.println(list.get(i));
      System.out.println();      
   }
}