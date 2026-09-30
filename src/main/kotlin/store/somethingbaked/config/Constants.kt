package store.somethingbaked.config

class Constants {
   class ReceptionType {
       var PICKUP: String = "PICKUP"
       var DELIVERY: String = "DELIVERY"
   }

   class OrderStatus {
       var RECEIVED: String = "RECEIVED"
       var STARTED: String = "STARTED"
       var PENDING_PICKUP: String = "PENDING_PICKUP"
       var PENDING_DELIVERY: String = "PENDING_DELIVERY"
       var COMPLETED: String = "COMPLETED"
       var CANCELLED: String = "CANCELLED"
   }
}