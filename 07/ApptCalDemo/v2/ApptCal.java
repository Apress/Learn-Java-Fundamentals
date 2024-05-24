class ApptCal
{
   private final static int MAX_APPT = 1000;
   private Appointment[] appointments;
   private int size;

   ApptCal()
   {
      appointments = new Appointment[MAX_APPT];
      size = 0;
   }

   void addAppointment(Appointment appointment)
   {
      if (size == appointments.length)
         return; // array is full
      appointments[size++] = appointment;
   }

   void addAppointments(Appointment[] appointments)
   {
      for (int i = 0; i < appointments.length; i++)
         addAppointment(appointments[i]);
   }
}