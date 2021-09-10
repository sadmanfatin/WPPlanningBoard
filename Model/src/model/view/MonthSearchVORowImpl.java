package model.view;

import java.sql.CallableStatement;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 07 10:50:36 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MonthSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        OrgId {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        OrgName {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getOrgName();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setOrgName((String)value);
            }
        }
        ,
        MonthName {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getMonthName();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setMonthName((String)value);
            }
        }
        ,
        Year {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getYear();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setYear((Number)value);
            }
        }
        ,
        WpMonthListVO {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getWpMonthListVO();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MonthLOV1 {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getMonthLOV1();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        YearLOV1 {
            public Object get(MonthSearchVORowImpl obj) {
                return obj.getYearLOV1();
            }

            public void put(MonthSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MonthSearchVORowImpl object);

        public abstract void put(MonthSearchVORowImpl object, Object value);

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


    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ORGNAME = AttributesEnum.OrgName.index();
    public static final int MONTHNAME = AttributesEnum.MonthName.index();
    public static final int YEAR = AttributesEnum.Year.index();
    public static final int WPMONTHLISTVO = AttributesEnum.WpMonthListVO.index();
    public static final int MONTHLOV1 = AttributesEnum.MonthLOV1.index();
    public static final int YEARLOV1 = AttributesEnum.YearLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MonthSearchVORowImpl() {
    }
    
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgName.
     * @return the OrgName
     */
    public String getOrgName() {
        return (String) getAttributeInternal(ORGNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgName.
     * @param value value to set the  OrgName
     */
    public void setOrgName(String value) {
        setAttributeInternal(ORGNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MonthName.
     * @return the MonthName
     */
    public String getMonthName() {
        return (String) getAttributeInternal(MONTHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MonthName.
     * @param value value to set the  MonthName
     */
    public void setMonthName(String value) {
        
      //  System.out.println("------ set month name in vo row impl -------------");
        setAttributeInternal(MONTHNAME, value);
        setCurrentMonthFromMonthList();  
        updateHolidayForHolidayCalendar();
        
        
    }

    /**
     * Gets the attribute value for the calculated attribute Year.
     * @return the Year
     */
    public Number getYear() {
        return (Number) getAttributeInternal(YEAR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Year.
     * @param value value to set the  Year
     */
    public void setYear(Number value) {
        setAttributeInternal(YEAR, value);
        setCurrentMonthFromMonthList();  
        updateHolidayForHolidayCalendar();
    }


    /**
     * Gets the associated <code>Row</code> using master-detail link WpMonthListVO.
     */
    public Row getWpMonthListVO() {
        return (Row)getAttributeInternal(WPMONTHLISTVO);
    }

    /**
     * Sets the master-detail link WpMonthListVO between this object and <code>value</code>.
     */
    public void setWpMonthListVO(Row value) {
        setAttributeInternal(WPMONTHLISTVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MonthLOV1.
     */
    public RowSet getMonthLOV1() {
        return (RowSet)getAttributeInternal(MONTHLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> YearLOV1.
     */
    public RowSet getYearLOV1() {
        return (RowSet)getAttributeInternal(YEARLOV1);
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
    
    
    
    
    public void setCurrentMonthFromMonthList() {
        
         WpMonthListVORowImpl newMonthListVoRow ;
    
        if(this.getWpMonthListVO() == null) {
            
         //   System.out.println("---------------------------    this.getWpMonthListVO() == null  -------------------------");  
            newMonthListVoRow = (WpMonthListVORowImpl)appM.getWpMonthListVO1().createRow();
            appM.getWpMonthListVO1().insertRow(newMonthListVoRow);
            appM.getWpMonthListVO1().setCurrentRow(newMonthListVoRow);            
            appM.getDBTransaction().commit();
        }  
        
         updateHolidayForHolidayCalendar();
             
    }

    public void updateHolidayForHolidayCalendar() {
       
        String currentMonthId = this.getWpMonthListVO().getAttribute("MonthId").toString() ;           
        String statement = "BEGIN APPS.WP_HC_HOLIDAY_UPDATE(:1); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
          
        try {
            cs.setInt(1, Integer.parseInt(currentMonthId));
            cs.execute();
        }
        catch(Exception e){
           e.printStackTrace() ;
        }    
       
    }
    
    
    
}
