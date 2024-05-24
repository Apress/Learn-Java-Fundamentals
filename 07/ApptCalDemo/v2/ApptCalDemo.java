class ApptCalDemo
{
   public static void main(String[] args)
   {
      Appointment[] appointments = 
      { 
         new Appointment(), 
         new Appointment(), 
         new Appointment() 
      };
      LoggingApptCal lapptcal = new LoggingApptCal(new ApptCal());
      lapptcal.addAppointments(appointments);
   }
}