

package Airport;
import java.util.Date;

/**
 *
 * @author ayfer
 */
public class DateOfFlight {
   protected Date FlightDate;

    public DateOfFlight(Date FlightDate) {
        this.FlightDate=FlightDate;
    }

    public Date getFlightDate() {
        return FlightDate;
    }

    public void setFlightDate(Date FlightDate) {
        this.FlightDate = FlightDate;
    }
    

}
