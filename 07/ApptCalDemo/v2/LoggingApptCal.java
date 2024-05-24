class LoggingApptCal
{
   private ApptCal apptcal; // Create a private field in new class.

   LoggingApptCal(ApptCal apptcal)
   {
      this.apptcal = apptcal;
   }

   void addAppointment(Appointment appointment)
   {
      Logger.log(appointment.toString());
      apptcal.addAppointment(appointment);
   }

   void addAppointments(Appointment[] appointments)
   {
      for (int i = 0; i < appointments.length; i++)
         Logger.log(appointments[i].toString());
      apptcal.addAppointments(appointments);
   }
}