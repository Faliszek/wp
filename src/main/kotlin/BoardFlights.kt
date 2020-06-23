import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import java.util.TimeZone


object BoardFlightsRenderer {

    private fun formatDate(x: Date, format: String = "dd-MM-YYYY HH:mm:ss"): String {
        val dt1 = SimpleDateFormat(format)
        return dt1.format(x)
    }


    private fun calculateTime(d1: Date, d2: Date): String {
        val diff = d2.getTime() - d1.getTime()
        val formatter = SimpleDateFormat("HH:mm:ss")

        formatter.timeZone = TimeZone.getTimeZone("UTC")

        return formatter.format(diff)
    }

    fun print(flights: List<Flight>): String {
        val leftAlignFormat = "| %-11s | %-27s | %-27s | %-27s | %-27s | %-27s |%n"
        val border = "+-------------+-----------------------------+-----------------------------+-----------------------------+-----------------------------+-----------------------------+"
        val header = "| ID          | From                        | To                          | Time to land                | Start                       | Landing                     |"
        var content = ""

        for (f in flights) {
            content += String.format(leftAlignFormat,
                    f.id,
                    f.from,
                    f.to,
                    calculateTime(Date.from(Instant.now()), f.landingTime),
                    formatDate(f.startTime),
                    formatDate(f.landingTime))
        }

        return String.format("%s%n%s%n%s%n%s%s%n", border, header, border, content, border)


    }
}

