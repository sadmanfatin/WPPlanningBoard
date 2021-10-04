package model.view;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Oct 03 13:20:36 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PopulateStyleFromPreviousMonthVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PopulateStyleFromPreviousMonthVOImpl() {
    }

    /**
     * Returns the bind variable value for p_month_serial.
     * @return bind variable value for p_month_serial
     */
    public String getp_month_serial() {
        return (String)getNamedWhereClauseParam("p_month_serial");
    }

    /**
     * Sets <code>value</code> for bind variable p_month_serial.
     * @param value value to bind as p_month_serial
     */
    public void setp_month_serial(String value) {
        setNamedWhereClauseParam("p_month_serial", value);
    }
}