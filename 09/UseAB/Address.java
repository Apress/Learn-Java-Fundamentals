class Address
{
   private String street, city;

   Address(String street, String city)
   {
      this.street = street;
      this.city = city;
   }

   String getStreet()
   {
      return street;
   }

   String getCity()
   {
      return city;
   }

   @Override
   public String toString()
   {
      return street + ": " + city;
   }
}