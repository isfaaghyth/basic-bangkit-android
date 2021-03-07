import com.dicoding.kotlin.ilt3.dip.MongoDatabase
import com.dicoding.kotlin.ilt3.dip.MySQLDatabase
import com.dicoding.kotlin.ilt3.dip.PaymentService

fun main() {
    // first, I want to use mySQL
    val paymentService = PaymentService(MySQLDatabase())
    paymentService.insertPayment()

    insertIntoMongo()
}

// feature The Payment Should Insert Into Mongo
fun insertIntoMongo() {
    val paymentService = PaymentService(MongoDatabase())
    paymentService.insertPayment()
}