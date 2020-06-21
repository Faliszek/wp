
import com.sun.deploy.ui.UITextArea
import com.sun.tools.javac.util.Name
import com.sun.tools.javac.util.Name.Table
import com.sun.webkit.UIClient
import java.io.OutputStream
import java.sql.Time
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.time.Clock.system
import java.time.Instant
import java.util.*
import java.util.TimeZone


class Renderer(flights: List<Flight>): TimerTask() {
    private val flights = flights;


    fun r(s: String) {
        print(s)
    }

    private fun formatDate(x: Date, format: String ="dd-MM-YYYY HH:mm:ss"): String {
        val dt1 = SimpleDateFormat(format)
        return dt1.format(x)
    }


    private fun calculateTime(d1: Date, d2: Date): String {
        val diff = d2.getTime() - d1.getTime()
        val formatter = SimpleDateFormat("HH:mm:ss")

        formatter.timeZone = TimeZone.getTimeZone("UTC")
        return formatter.format(diff)

    }

    override fun run() {
        val leftAlignFormat = "| %-27s | %-27s | %-27s | %-27s | %-27s |"
        val border = "+-----------------------------+-----------------------------+-----------------------------+-----------------------------+-----------------------------+"
        val header = "| From                        | To                          | Start                       | Landing                     | Time to land                |"


        var content =  "";
        var output = ""

        for (f in flights) {


            content += String.format(leftAlignFormat,

                f.from,
                f.to,
                formatDate(f.startTime),
                formatDate(f.landingTime),
                calculateTime(f.startTime, f.landingTime))

        }
//        output = String.format("%s%n%s%n%s%n%s%n%s%n", border, header,border,content,border)

//        System.out.print("\r" + output + "\r")


//        print("${Date.from(Instant.now())}\n${Date.from(Instant.now())}")
        print("${Date.from(Instant.now())}" + "\r")








    }


}



class Border: TimerTask() {
    override fun run() {

        val border = "+-----------------------------+-----------------------------+-----------------------------+-----------------------------+-----------------------------+\r"
//        val header = "| From                        | To                          | Start                       | Landing                     | Time to land                |"
        print(border)

    }

}

class Board(flights: List<Flight>) {
    init {
        val timer = Timer();

        val ui = Renderer(flights);
//        timer.schedule(Border(), 0 ,1000)
        timer.schedule(ui, 0, 1000)
    }
}