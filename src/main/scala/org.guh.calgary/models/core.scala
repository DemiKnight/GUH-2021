package `org.guh.calgary`.models

import java.time.LocalDateTime
import enumeratum._


case class Booking(date: LocalDateTime, arrivalAirport: String, destinationAirport: String, bookingNumber: String)
case class Car(carModel: String, isAutomatic: Boolean, isRightSided: Boolean)
case class CarBookingStatus(car: Car, booking: Booking, status: CarStatus)

sealed trait CarStatus extends EnumEntry
object CarStatus extends Enum[CarStatus] {
    val values = findValues
    case object Taken extends CarStatus
    case object Reserved extends CarStatus
    case object Free extends CarStatus
}
