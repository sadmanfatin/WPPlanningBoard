package model.entity;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 07 11:17:27 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WpMonthListEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */


    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        MonthId {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getMonthId();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setMonthId((Number)value);
            }
        }
        ,
        MonthName {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getMonthName();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setMonthName((String)value);
            }
        }
        ,
        Year {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getYear();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setYear((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        WeeklyHoliday {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getWeeklyHoliday();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setWeeklyHoliday((String)value);
            }
        }
        ,
        MonthNumber {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getMonthNumber();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setMonthNumber((Number)value);
            }
        }
        ,
        MonthSerial {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getMonthSerial();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setMonthSerial((Number)value);
            }
        }
        ,
        WpPlanningBoardEO {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getWpPlanningBoardEO();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        WpPlanningBoardLoadEO {
            public Object get(WpMonthListEOImpl obj) {
                return obj.getWpPlanningBoardLoadEO();
            }

            public void put(WpMonthListEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(WpMonthListEOImpl object);

        public abstract void put(WpMonthListEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int MONTHID = AttributesEnum.MonthId.index();
    public static final int MONTHNAME = AttributesEnum.MonthName.index();
    public static final int YEAR = AttributesEnum.Year.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int WEEKLYHOLIDAY = AttributesEnum.WeeklyHoliday.index();
    public static final int MONTHNUMBER = AttributesEnum.MonthNumber.index();
    public static final int MONTHSERIAL = AttributesEnum.MonthSerial.index();
    public static final int WPPLANNINGBOARDEO = AttributesEnum.WpPlanningBoardEO.index();
    public static final int WPPLANNINGBOARDLOADEO = AttributesEnum.WpPlanningBoardLoadEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public WpMonthListEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.WpMonthListEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for MonthId, using the alias name MonthId.
     * @return the MonthId
     */
    public Number getMonthId() {
        return (Number)getAttributeInternal(MONTHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonthId.
     * @param value value to set the MonthId
     */
    public void setMonthId(Number value) {
        setAttributeInternal(MONTHID, value);
    }

    /**
     * Gets the attribute value for MonthName, using the alias name MonthName.
     * @return the MonthName
     */
    public String getMonthName() {
        return (String)getAttributeInternal(MONTHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonthName.
     * @param value value to set the MonthName
     */
    public void setMonthName(String value) {
        setAttributeInternal(MONTHNAME, value);
    }

    /**
     * Gets the attribute value for Year, using the alias name Year.
     * @return the Year
     */
    public Number getYear() {
        return (Number)getAttributeInternal(YEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Year.
     * @param value value to set the Year
     */
    public void setYear(Number value) {
        setAttributeInternal(YEAR, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for WeeklyHoliday, using the alias name WeeklyHoliday.
     * @return the WeeklyHoliday
     */
    public String getWeeklyHoliday() {
        return (String)getAttributeInternal(WEEKLYHOLIDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for WeeklyHoliday.
     * @param value value to set the WeeklyHoliday
     */
    public void setWeeklyHoliday(String value) {
        setAttributeInternal(WEEKLYHOLIDAY, value);
    }

    /**
     * Gets the attribute value for MonthNumber, using the alias name MonthNumber.
     * @return the MonthNumber
     */
    public Number getMonthNumber() {
        return (Number)getAttributeInternal(MONTHNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonthNumber.
     * @param value value to set the MonthNumber
     */
    public void setMonthNumber(Number value) {
        setAttributeInternal(MONTHNUMBER, value);
    }

    /**
     * Gets the attribute value for MonthSerial, using the alias name MonthSerial.
     * @return the MonthSerial
     */
    public Number getMonthSerial() {
        return (Number)getAttributeInternal(MONTHSERIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonthSerial.
     * @param value value to set the MonthSerial
     */
    public void setMonthSerial(Number value) {
        setAttributeInternal(MONTHSERIAL, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getWpPlanningBoardEO() {
        return (RowIterator)getAttributeInternal(WPPLANNINGBOARDEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getWpPlanningBoardLoadEO() {
        return (RowIterator)getAttributeInternal(WPPLANNINGBOARDLOADEO);
    }


    /**
     * @param monthId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number monthId) {
        return new Key(new Object[]{monthId});
    }

    protected void create(AttributeList attributeList) {
       //System.out.println("========================= in  month list create method   ==========================================");
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s = new oracle.jbo.server.SequenceImpl("WP_MONTH_LIST_SEQ", getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        
             
        this.setMonthId(new Number(sVal));
        
        
    }
}
