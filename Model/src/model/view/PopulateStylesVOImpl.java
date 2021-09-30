package model.view;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 08 17:45:11 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PopulateStylesVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PopulateStylesVOImpl() {
    }

    /**
     * Returns the bind variable value for p_month_id.
     * @return bind variable value for p_month_id
     */
    public String getp_month_id() {
        return (String)getNamedWhereClauseParam("p_month_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_month_id.
     * @param value value to bind as p_month_id
     */
    public void setp_month_id(String value) {
        setNamedWhereClauseParam("p_month_id", value);
    }
}
