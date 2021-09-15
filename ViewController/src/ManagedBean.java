import java.sql.CallableStatement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.Set;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import javax.faces.event.ValueChangeEvent;

import model.service.AppModuleImpl;

import model.view.MonthSearchVOImpl;

import model.view.MonthSearchVORowImpl;

import model.view.PopulateStylesVORowImpl;
import model.view.WpMonthListVOImpl;

import model.view.WpMonthListVORowImpl;

import model.view.WpPlanningBoardVOImpl;
import model.view.WpPlanningBoardVORowImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;

public class ManagedBean {
    private RichTable planningBoardLoadTable;
    private RichTable planningBoardTable;
    Map<String, Integer> daysColumnsWithValue ;
   List <Integer> holidayDayNoList ;
    private RichInputText numberOfDays;

    public ManagedBean() {
        
       //  this.setHolidayDayNoList(holidayDayNoList);
      //  this.setDaysColumnsWithValue(daysColumnsWithValue);
       
     
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
    
    public void onPageLoad(PhaseEvent phaseEvent) {
        // Add event code here...

        if (!AdfFacesContext.getCurrentInstance().isPostback()) {

        //     System.out.println("========================== onPageLoad not isPostback  ====================== ");         
             setCurrentMonthFromList();   
             updateLoadEntryForMonth();
             hideAndDisableInvalidDateCulumns();
                  
        }
        else{
         //   System.out.println("========================== onPageLoad  isPostback  ====================== ");   
            hideAndDisableInvalidDateCulumns();
        }
          

    }
    private void setCurrentMonthFromList() {    
           
      //   System.out.println("  ========================== in setCurrentMonth()     ==========================" );

           MonthSearchVOImpl searchVo = (MonthSearchVOImpl)appM.getMonthSearchVO1();
           MonthSearchVORowImpl currentRow  ;       
           currentRow = (MonthSearchVORowImpl)searchVo.getCurrentRow();
           currentRow.setCurrentMonthFromMonthList(); 
                    
       }


    private void updateLoadEntryForMonth() {
        WpMonthListVOImpl monthListVo = (WpMonthListVOImpl)appM.getWpMonthListVO1();
        
        WpMonthListVORowImpl montListVoCurrentRow = (WpMonthListVORowImpl)monthListVo.getCurrentRow();
        montListVoCurrentRow.updateLoadRowEntry();  // this method will entry for section wise load (Planning Board Load) for month
        
    }

    public void setPlanningBoardLoadTable(RichTable planningBoardLoadTable) {
        this.planningBoardLoadTable = planningBoardLoadTable;
    }

    public RichTable getPlanningBoardLoadTable() {
        return planningBoardLoadTable;
    }

    public void setPlanningBoardTable(RichTable planningBoardTable) {
        this.planningBoardTable = planningBoardTable;
    }

    public RichTable getPlanningBoardTable() {
        return planningBoardTable;
    }

    private void hideAndDisableInvalidDateCulumns() {
        
        hideAndDisableInvalidDateForTable(planningBoardLoadTable);
        hideAndDisableInvalidDateForTable(planningBoardTable);
         
               
    }


    public void setDaysColumnsWithValue(Map<String, Integer> daysColumnsWithValue) {
        
    }

    public Map<String, Integer> getDaysColumnsWithValue() {
        
        daysColumnsWithValue = new HashMap<String,Integer>();
        daysColumnsWithValue.put("D1", 1);
        daysColumnsWithValue.put("D2", 2 );
        daysColumnsWithValue.put("D3", 3 );
        daysColumnsWithValue.put("D4", 4 );
        daysColumnsWithValue.put("D5", 5 );
        daysColumnsWithValue.put("D6", 6 );
        daysColumnsWithValue.put("D7", 7 );
        daysColumnsWithValue.put("D8", 8 );
        daysColumnsWithValue.put("D9", 9);
        daysColumnsWithValue.put("D10", 10 );
        daysColumnsWithValue.put("D11", 11 );
        daysColumnsWithValue.put("D12", 12 );
        daysColumnsWithValue.put("D13", 13 );
        daysColumnsWithValue.put("D14", 14 );
        daysColumnsWithValue.put("D15", 15 );
        daysColumnsWithValue.put("D16", 16 );
        daysColumnsWithValue.put("D17", 17 );
        daysColumnsWithValue.put("D18", 18 );
        daysColumnsWithValue.put("D19", 19 );
        daysColumnsWithValue.put("D20", 20 );
        daysColumnsWithValue.put("D21", 21 );
        daysColumnsWithValue.put("D22", 22 );
        daysColumnsWithValue.put("D23", 23 );
        daysColumnsWithValue.put("D24", 24 );
        daysColumnsWithValue.put("D25", 25 );
        daysColumnsWithValue.put("D26", 26 );
        daysColumnsWithValue.put("D27", 27 );
        daysColumnsWithValue.put("D28", 28 );
        daysColumnsWithValue.put("D29", 29 );
        daysColumnsWithValue.put("D30", 30 );
        daysColumnsWithValue.put("D31", 31 );
        
        return daysColumnsWithValue;
    }

    public void setHolidayDayNoList(List<Integer> holidayDayNoList) {
        

        
    }

    public List<Integer> getHolidayDayNoList() {
        
        this.holidayDayNoList = new ArrayList<Integer>();
        
        ViewObject holidayCalendar = appM.getWpHolidayCalendarVO1();
        holidayCalendar.setRangeSize(32);
        Row[] holidayCalendarRows = holidayCalendar.getAllRowsInRange();
        
        for (Row r : holidayCalendarRows){
            if(r.getAttribute("WorkingStatus").equals("Holiday")    ){
                holidayDayNoList.add(  Integer.parseInt(r.getAttribute("DayNo").toString()) ) ;
            }
        }
        
        
        return holidayDayNoList;
    }

    private void hideAndDisableInvalidDateForTable(RichTable table) {

        RichColumn column;
       
         int  lastDayOfMonth = Integer.parseInt(appM.getWpMonthListVO1().getCurrentRow().getAttribute("NumberOfDays").toString()) ;
        //int  lastDayOfMonth = Integer.parseInt(appM.getMonthSearchVO1().getCurrentRow()) ;

//        int lastDayOfMonth;
//        //  lastDayOfMonth =  Integer.parseInt(this.getNumberOfDays().getva) ;
//
//          Number value = (Number)resolveExpression("#{bindings.NumberOfDays.inputValue}");
//
//         lastDayOfMonth = Integer.parseInt(value.toString());
//
//        
//        lastDayOfMonth =
//                appM.getWpHolidayCalendarVO1().getAllRowsInRange().length;
//        MonthSearchVORowImpl r =
//            (MonthSearchVORowImpl)appM.getMonthSearchVO1().getCurrentRow();
//        // lastDayOfMonth =
//
//        Object o = r.getWpMonthListVO().getAttribute("NumberOfDays");
//
         System.out.println("--------------  last day of month "+lastDayOfMonth );
//       // System.out.println("--------------  last day of month " + o);


        int columnDayNo = 0;

        List<UIComponent> uiComponents = table.getChildren();

        for (UIComponent uiComponent : uiComponents) {
            if (uiComponent instanceof RichColumn) {

                column = (RichColumn)uiComponent;

                String attributeName = column.getSortProperty();


                //   System.out.println(" this.getDaysColumnsWithValue().size() "+ this.getDaysColumnsWithValue().size());
                //    System.out.println(" this.getHolidayDayNoList().size() "+ this.getHolidayDayNoList().size());


                if (this.getDaysColumnsWithValue().containsKey(attributeName)) {
                    columnDayNo =
                            this.getDaysColumnsWithValue().get(attributeName);
                    // workingStatus = holidayCalendarVo.getRow(key).getAttribute("WorkingStatus").toString();

                    if (columnDayNo > lastDayOfMonth) {

                        column.setVisible(false);


                    } else {
                        column.setVisible(true);
                         List<UIComponent> columnUiComponents =
                            column.getChildren();
                            for (UIComponent columnUiComponent :
                              columnUiComponents) {
                               if (columnUiComponent instanceof RichInputText) {
                                RichInputText rt =
                                    (RichInputText)columnUiComponent;
                               if (this.getHolidayDayNoList().contains(columnDayNo)) {
                                    rt.setDisabled(true);

                                } else {
                                    rt.setDisabled(false);
                                }

                            }


                        }

                    }

                }


            }
         }


    }

    public void monthNameValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
     
      //  System.out.println("------ set month name in value change event  -------------");

     //   hideAndDisableInvalidDateCulumns();
        
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardTable());
    }

    public void yearValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...

        
     //   hideAndDisableInvalidDateCulumns();
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardTable());
    }

    public void setNumberOfDays(RichInputText numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public RichInputText getNumberOfDays() {
        return numberOfDays;
    }
    
    
    public Object resolveExpression(String el) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression valueExp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        return valueExp.getValue(elContext);
    }

    public void setValueToEL(String el, Object val) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory =
            facesContext.getApplication().getExpressionFactory();
        ValueExpression exp =
            expressionFactory.createValueExpression(elContext, el,
                                                    Object.class);
        exp.setValue(elContext, val);
    }
    
    public boolean checkColumnDisabled(int val){
        if (val == 2){
            return true;
        }
        else return false;
    }

  


    public void populateStyleDialogueListener(DialogEvent dialogEvent) {
        // Add event code here...
        
        // Add event code here...
        if (dialogEvent.getOutcome().name().equals("ok")) {
            System.out.println("dialogEvent.getOutcome().name().equals(\"ok\")" );
        
            populateStyle();
            
         AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
            AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardTable());
            
        } else if (dialogEvent.getOutcome().name().equals("cancel")) {
            ;
        }
    }

    private void populateStyle() {
        
        
        
        ViewObject populateStylesVo = appM.getPopulateStylesVO1();
        
        ViewObject  planningBoardVo = appM.getWpPlanningBoardVO1();
        
          PopulateStylesVORowImpl   populateStylesRow = null;
           WpPlanningBoardVORowImpl  planningBoardRow = null; 
            
           String flag= null;

        Row rows[] =  populateStylesVo.getAllRowsInRange();
        for (Row row : rows) {
            populateStylesRow = (PopulateStylesVORowImpl)row;
            
         //   System.out.println("=======  loop count  ====================");
            try {
                flag =   populateStylesRow.getCheckBox();
                
                if ( flag != null &&  flag.equals("y")) {
                    
                   System.out.println(  "flag != null &&  flag.equals(\"y\")");
                    
                    planningBoardRow = (WpPlanningBoardVORowImpl)planningBoardVo.createRow();
                
                 //    planningBoardRow.setOrgId(   new Number (populateStylesRow.getOrgId()));
                 //   planningBoardRow.setOrgName(populateStylesRow.getOrgName());
                    planningBoardRow.setSystemId(populateStylesRow.getSystemId());   
                    planningBoardRow.setBuyerId(populateStylesRow.getBuyerId());
                    planningBoardRow.setBuyerName(populateStylesRow.getBuyerName());
                    planningBoardRow.setSeason(populateStylesRow.getSeason());
                    planningBoardRow.setStyle(populateStylesRow.getStyle());
                    planningBoardRow.setColor(populateStylesRow.getColor());
                    planningBoardRow.setWashName(populateStylesRow.getWashName());
                    planningBoardRow.setLcUnit(populateStylesRow.getLcUnit());
                    planningBoardRow.setLcUnitName(populateStylesRow.getLcUnitName());
                    planningBoardRow.setProductionUnit(populateStylesRow.getProductionUnit());
                    planningBoardRow.setProductionUnitName(populateStylesRow.getProductionUnitName());
                    planningBoardRow.setOrderQty(populateStylesRow.getOrderQty());
                    
                  
                    planningBoardRow.setCurrentSamVersion(populateStylesRow.getCurrentSamVersion());
                    planningBoardRow.setAvailableSamVersion(populateStylesRow.getAvailableSamVersion());
                   

                   planningBoardVo.insertRow(planningBoardRow);
                    

                }
                    
            } catch (Exception e) {
               e.printStackTrace() ;
            }

        }
        
        
    }

    public void styleQtyValueChangeListener(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        
//        appM.getDBTransaction().commit();
//        this.getAppModuleImpl().getWpPlanningBoardLoadVO1().executeQuery();
//        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
                                         
    }

    public void save(ActionEvent actionEvent) {
        // Add event code here...
        this.executeOperation("Commit");
        
        appM.getWpPlanningBoardLoadVO1().executeQuery();
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
     
        
    }
    
    
    private void executeOperation(String method) {
        BindingContainer bindings = getBindings();
               OperationBinding ob = bindings.getOperationBinding(method);
        Object result = ob.execute();
        
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void updateSamVersion(ActionEvent actionEvent) {
        // Add event code here...
        String statement = "BEGIN APPS.UPDATE_WP_STYLE_SETUP_VERSION(:1,:2); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
        WpPlanningBoardVOImpl planningBoardVo = ( WpPlanningBoardVOImpl)appM.getWpPlanningBoardVO1();
        WpPlanningBoardVORowImpl styleSetupVoRow = (WpPlanningBoardVORowImpl)planningBoardVo.getCurrentRow();
        String styleSetupId =   styleSetupVoRow.getStyleSetupId().toString();
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        String userId = (String)sessionScope.get("userId");
        
        
        try {
            cs.setInt(1, Integer.parseInt(styleSetupId));
            cs.setInt(2, Integer.parseInt(userId));
            cs.execute();
        }
        catch(Exception e){
            e.printStackTrace();
            ;
        }              
        
        this.refreshQueryKeepingCurrentRow(appM.getWpPlanningBoardVO1());
        this.refreshQueryKeepingCurrentRow(appM.getWpPlanningBoardLoadVO1());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardTable());
        AdfFacesContext.getCurrentInstance().addPartialTarget(this.getPlanningBoardLoadTable());
    }
    
    public void refreshQueryKeepingCurrentRow(ViewObject viewObject )  {
        
        
         Row currentRow;
         Key currentRowKey;
         
         // added on 7.jan.18 to handle exception if view object has no current row
        try{
           currentRow = viewObject.getCurrentRow();
           currentRowKey = currentRow.getKey();
        }
        catch(Exception e){
            return;
        }     
       int rangePosOfCurrentRow = viewObject.getRangeIndexOf(currentRow);
       int rangeStartBeforeQuery = viewObject.getRangeStart();
       viewObject.executeQuery();
       viewObject.setRangeStart(rangeStartBeforeQuery);
       /*
        * In 10.1.2, there is this convenience method we could use
        * instead of the remaining lines of code
        *
        *  findAndSetCurrentRowByKey(currentRowKey,rangePosOfCurrentRow);
        *  
        */
       
         
       Row[] rows = viewObject.findByKey(currentRowKey, 1);
       if (rows != null && rows.length == 1)
       {
          viewObject.scrollRangeTo(rows[0], rangePosOfCurrentRow);
          viewObject.setCurrentRowAtRangeIndex(viewObject.getRangeIndexOf(rows[0]));
       }
       
               
     }
}
