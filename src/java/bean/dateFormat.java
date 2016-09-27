/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author vic
 */
@ManagedBean
@SessionScoped
public class dateFormat implements Serializable {

    //date format and compare
    private boolean clearEnd;

    public dateFormat() {

    }

    public static String formatDateMMMddyyyy(Date currentDate) {
        if (currentDate == null) {
            currentDate = new Date();
        }
        DateFormat dateFormat = new SimpleDateFormat("MMM dd yyyy");
        return dateFormat.format(currentDate);
    }

    public void compareDate(Date from, Date to) {
        if (from.after(to)) {
            setClearEnd(true);
        }
        setClearEnd(false);
    }

    public boolean isClearEnd() {
        return clearEnd;
    }

    public void setClearEnd(boolean clearEnd) {
        this.clearEnd = clearEnd;
    }

}
