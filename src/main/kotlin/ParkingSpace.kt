import java.util.*

 class ParkingSpace {
        lateinit var vehicle: Vehicle
        lateinit var checkInTime : Calendar
        var parkedVehicle : Boolean = false

        fun checkInVehicle(vehicle : Vehicle) : Boolean {
            this.vehicle = vehicle
            checkInTime = Calendar.getInstance()



            parkedVehicle = true
            return true
        }
     fun checkOutVehicle(plate: String, onSuccess: () -> Unit, onError: () -> Unit ) {


     }


        val parkedTime: Long
         get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / 60000
    }
