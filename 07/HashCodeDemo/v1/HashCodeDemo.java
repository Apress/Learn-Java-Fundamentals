class HashCodeDemo
{
   public static void main(String[] args)
   {
      HashMap westernProvinceCapitals = new HashMap();
      westernProvinceCapitals.put("British Columbia", "Victoria");
      westernProvinceCapitals.put("Alberta", "Edmonton");
      westernProvinceCapitals.put("Saskatchewan", "Regina");
      westernProvinceCapitals.put("Manitoba", "Winnipeg");

      System.out.println(westernProvinceCapitals.get("Manitoba"));
      System.out.println(westernProvinceCapitals.get("Saskatchewan"));
      System.out.println(westernProvinceCapitals.get("British Columbia"));
      System.out.println(westernProvinceCapitals.get("Alberta"));
      System.out.println(westernProvinceCapitals.get("Quebec"));
   }
}