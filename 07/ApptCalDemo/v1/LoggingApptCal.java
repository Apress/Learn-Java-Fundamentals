class LoggingApptCal extends ApptCal
{
   LoggingApptCal()
   {
   }

   @Override
   void addAppointment(Appointment appointment)
   {
      Logger.log(appointment.toString());
      super.addAppointment(appointment);
   }

   @Override
   void addAppointments(Appointment[] appointments)
   {
      for (int i = 0; i < appointments.length; i++)
         Logger.log(appointments[i].toString());
      super.addAppointments(appointments);
   }
}