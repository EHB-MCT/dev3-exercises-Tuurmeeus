import java.sql.*
import java.util.*

fun main() {
    val credentials = Credentials()
    //preparing driver -> create connection
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    //creating connection
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseName
    connectionProps["password"] = credentials.databasePassword
    val connection = DriverManager.getConnection("jdbc" + "mysql" + "://" + "dt5.ehb.be" + ":" + "3306" + "/" + credentials.databaseName, connectionProps )

    //val statement = connection.prepareStatement(query)



}