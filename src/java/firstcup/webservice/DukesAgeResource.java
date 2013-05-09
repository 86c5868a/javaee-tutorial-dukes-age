/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcup.webservice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author Tong
 */
@Path("dukesAge")
public class DukesAgeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DukesAgeResource
     */
    public DukesAgeResource() {
    }

    /**
     * Retrieves representation of an instance of firstcup.webservice.DukesAgeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        Calendar dukesBirthday = new GregorianCalendar(1995, Calendar.MAY, 23);
        Calendar now = GregorianCalendar.getInstance();
        
        int dukesAge = now.get(Calendar.YEAR) - dukesBirthday.get(Calendar.YEAR);
        
        if (now.before(dukesBirthday)) {
            dukesAge--;
        }
        
        return Integer.toString(dukesAge);
    }
}
