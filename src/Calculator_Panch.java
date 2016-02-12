/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.TableItem;

import com.sun.midp.lcdui.AutomatedEventHandler;
import com.sun.midp.lcdui.DefaultEventHandler;
/**
 * @author panchecko
 */
public class Calculator_Panch extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    double number1=0.0;//prwtos arithmos
    double number2=0.0;//deyteros arithmos
    double ap;//to apotelesma
    boolean tel=false;//tha xrhsimopoiithei ston elegxo toy an exei balei o xristis teleia ston arithmo
    boolean tel2=false;
    boolean tel3=false;
    boolean tel4=false;
    int praksi_tel=0;
    boolean tel2ou=false;
    boolean fasi=true;//eisagwgi prwtou arithmou=true..eisagwgi deyterou arithmou=false;
    int praksi=0;//pia praksi exei epilexthei..1=+,2=- etc...
    boolean c=false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
private Form form;
private TableItem tableItem;
private TextField textField;
private StringItem stringItem;
private List list;
private TextBox textBox;
private TextBox textBox1;
private Command exitCommand;
private Command itemCommand;
private Command okCommand;
private Command exitCommand1;
private Command exitCommand2;
private Command itemCommand1;
private Command exitCommand3;
private SimpleTableModel simpleTableModel;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The Calculator_Panch constructor.
     */
    public Calculator_Panch() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
/**
 * Initializes the application.
 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
 */
private void initialize () {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Started point.
 */
public void startMIDlet () {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable (null, getList ());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
 */
public void resumeMIDlet () {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
switchDisplayable (null, getList ());//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
/**
 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
 * @param nextDisplayable the Displayable to be set
 */
public void switchDisplayable (Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay ();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
if (alert == null) {
display.setCurrent (nextDisplayable);
} else {
display.setCurrent (alert, nextDisplayable);
}//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|







//<editor-fold defaultstate="collapsed" desc=" Generated Getter: simpleTableModel ">//GEN-BEGIN:|18-getter|0|18-preInit
/**
 * Returns an initiliazed instance of simpleTableModel component.
 * @return the initialized component instance
 */
public SimpleTableModel getSimpleTableModel () {
if (simpleTableModel == null) {//GEN-END:|18-getter|0|18-preInit
 // write pre-init user code here
simpleTableModel = new SimpleTableModel (new java.lang.String[][] {//GEN-BEGIN:|18-getter|1|18-postInit
new java.lang.String[] { "+", "-", "*", "/", ".", "%", "^n", "sqrt", "c" }}, null);//GEN-END:|18-getter|1|18-postInit
 // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
return simpleTableModel;
}
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
/**
 * Called by a system to indicated that a command has been invoked on a particular displayable.
 * @param command the Command that was invoked
 * @param displayable the Displayable where the command was invoked
 */
public void commandAction (Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
 // write pre-action user code here
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|24-preAction
if (command == exitCommand) {//GEN-END:|7-commandAction|1|24-preAction
 // write pre-action user code here
switchDisplayable (null, getList ());//GEN-LINE:|7-commandAction|2|24-postAction
 // write post-action user code here
} else if (command == itemCommand) {//GEN-LINE:|7-commandAction|3|26-preAction
 // write pre-action user code here
    String n1="";String n2="";
//GEN-LINE:|7-commandAction|4|26-postAction
 // write post-action user code here
  
    if(fasi){
       
    if(tableItem.getSelectedCellColumn()==0){
        n1=textField.getString();
        if("".equals(textField.getString())){ n1="0"; stringItem.setText("Ο πρώτος αροθμός είναι 0 και η πράξη θεωρείται το άθροισμα.Πληκρολόγησε τον δεύτερο αριθμό..");
        }
        number1=Double.parseDouble(n1);
        textField.setString("");
        praksi=1;
         tel2=false;
         c=false;
        
    }
    else if(tableItem.getSelectedCellColumn()==1){
        n1=textField.getString();
        number1=Double.parseDouble(n1);
        textField.setString("");
         praksi=2;
          tel2=false;
          c=false;
    }
    else if(tableItem.getSelectedCellColumn()==2){
          n1=textField.getString();
        number1=Double.parseDouble(n1);
        textField.setString("");
         praksi=3;
          tel2=false;
          c=false;
    }
    else if(tableItem.getSelectedCellColumn()==3){
      n1=textField.getString();
        number1=Double.parseDouble(n1);
        textField.setString("");
         praksi=4;
         tel2=false;
         c=false;
    }
    else if(tableItem.getSelectedCellColumn()==4){//prosthiki teleias
      n1=textField.getString();
      if(!tel){
      if("".equals(n1))
        textField.setString(n1+"0.");
        else
        textField.setString(n1+".");
        praksi=5;
        tel2=true;
        tel=true;
      }
      else stringItem.setText("Δεν επιτρέπεται...");
    }
    else if(tableItem.getSelectedCellColumn()==5){
      n1=textField.getString();
        number1=Double.parseDouble(n1);
        textField.setString("");
         praksi=6;
          tel2=false;
         c=false;
    }
    else if(tableItem.getSelectedCellColumn()==6){//x^n
      n1=textField.getString();
        number1=Double.parseDouble(n1);
        textField.setString("");
        stringItem.setText("Ο δεύτερος αριθμός θεωρείται ακέραιος");
         praksi=7;
         tel2=false;
         c=false;
    }
    else if(tableItem.getSelectedCellColumn()==7){//square root
      n1=textField.getString();
        number1=Double.parseDouble(n1);
        ap=Math.sqrt(number1);
           n2=String.valueOf(ap);
           stringItem.setText(n2);
        textField.setString("");
         praksi=8;
         tel2=true;
         c=true;
    }
    else if(tableItem.getSelectedCellColumn()==8){
      
        number1=0.0;
        textField.setString("");
         stringItem.setText("");
         praksi=9;
         fasi=true;
         c=true;
         tel2=true;
    }
    
    if(!c && !tel2){
    fasi=false;
    tel=false;
    tel2=false;
    }
    }//1h fasi
 
    else if(fasi==false && praksi!=5 ){//ean imaste sti prosthiki deyterou arithmou kai den exoume patisei pristhiki teleias
         if(tableItem.getSelectedCellColumn()==4 && !tel3){
               n2=textField.getString();
      if(!tel4){
      if("".equals(n2))
        textField.setString(n2+"0");
      n2=textField.getString();
        textField.setString(n2+".");
        
        tel4=true;
        tel3=true;
        }
        else stringItem.setText("Δεν επιτρέπεται2...");
         }
         else if(tableItem.getSelectedCellColumn()==8){//ean patisei to c o xristis na arxikopoiithoun oi times
            number1=0.0;
            number2=0.0;
        textField.setString("");
         stringItem.setText("");
         praksi=9;
         fasi=true;
         c=true;
         tel3=false;
         tel4=false;
        }
         else{
        if("".equals(textField.getString())){ number2=0; }
        else{ n2=textField.getString();
        number2=Double.parseDouble(n2);}
        tel4=false;
        
        if(praksi==1){
            ap=number1+number2;
             n2=String.valueOf(ap);
             tel3=false;
        }
        else if(praksi==2){
           ap=number1-number2;
            n2=String.valueOf(ap);
            tel3=false;
        }
        else if(praksi==3){
            ap=number1*number2;
           n2=String.valueOf(ap);
           tel3=false;
        }
        else if(praksi==4){
            if(!(number2==0.0)){
            ap=number1/number2;
            n2=String.valueOf(ap);
            }
            else n2="!!!Sfalma diairesis,  2os arithmos=0 ";
            tel3=false;
        }

       else if(praksi==6){
           tel3=false;
            ap=number1%number2;
           n2=String.valueOf(ap);
        }
        else if(praksi==7){
            ap=1;
            tel3=false;
            for(int i=0;i<number2;i++)
            ap*=number1;
           n2=String.valueOf(ap);
        }
         }
        if(!c && !tel3){
        stringItem.setText(n2);
        textField.setString(""+stringItem.getText());
        fasi=true;
        tel=false;
        tel2=false;
        tel3=true;
        
        }
    }
    
}//GEN-BEGIN:|7-commandAction|5|35-preAction
} else if (displayable == list) {
if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|5|35-preAction
 // write pre-action user code here
listAction ();//GEN-LINE:|7-commandAction|6|35-postAction
 // write post-action user code here
} else if (command == exitCommand3) {//GEN-LINE:|7-commandAction|7|59-preAction
 // write pre-action user code here
exitMIDlet ();//GEN-LINE:|7-commandAction|8|59-postAction
 // write post-action user code here
} else if (command == itemCommand1) {//GEN-LINE:|7-commandAction|9|57-preAction
 // write pre-action user code here
    if(list.isSelected(0)){
        switchDisplayable(null,getForm());
    }
    if(list.isSelected(1)){
        switchDisplayable(null,getTextBox());
    }
    if(list.isSelected(2)){
        switchDisplayable(null,getTextBox1());
    }
    if(list.isSelected(3)){
       exitMIDlet();
    }
//GEN-LINE:|7-commandAction|10|57-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|47-preAction
} else if (displayable == textBox) {
if (command == exitCommand1) {//GEN-END:|7-commandAction|11|47-preAction
 // write pre-action user code here
switchDisplayable (null, getList ());//GEN-LINE:|7-commandAction|12|47-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|13|53-preAction
} else if (displayable == textBox1) {
if (command == exitCommand2) {//GEN-END:|7-commandAction|13|53-preAction
 // write pre-action user code here
switchDisplayable (null, getList ());//GEN-LINE:|7-commandAction|14|53-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
}//GEN-END:|7-commandAction|15|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|19-getter|0|19-preInit
/**
 * Returns an initiliazed instance of form component.
 * @return the initialized component instance
 */
public Form getForm () {
if (form == null) {//GEN-END:|19-getter|0|19-preInit
 // write pre-init user code here
form = new Form ("Calculator Panch", new Item[] { getTextField (), getTableItem (), getStringItem () });//GEN-BEGIN:|19-getter|1|19-postInit
form.addCommand (getExitCommand ());
form.addCommand (getItemCommand ());
form.setCommandListener (this);//GEN-END:|19-getter|1|19-postInit
 // write post-init user code here

}//GEN-BEGIN:|19-getter|2|
return form;
}
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableItem ">//GEN-BEGIN:|21-getter|0|21-preInit
/**
 * Returns an initiliazed instance of tableItem component.
 * @return the initialized component instance
 */
public TableItem getTableItem () {
if (tableItem == null) {//GEN-END:|21-getter|0|21-preInit
 // write pre-init user code here
tableItem = new TableItem (getDisplay (), "");//GEN-BEGIN:|21-getter|1|21-postInit
tableItem.setModel (getSimpleTableModel ());//GEN-END:|21-getter|1|21-postInit
 // write post-init user code here
}//GEN-BEGIN:|21-getter|2|
return tableItem;
}
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|22-getter|0|22-preInit
/**
 * Returns an initiliazed instance of textField component.
 * @return the initialized component instance
 */
public TextField getTextField () {
if (textField == null) {//GEN-END:|22-getter|0|22-preInit
 // write pre-init user code here
textField = new TextField ("", null, 32, TextField.DECIMAL);//GEN-BEGIN:|22-getter|1|22-postInit
textField.setInitialInputMode ("IS_FULLWIDTH_DIGITS");//GEN-END:|22-getter|1|22-postInit
 // write post-init user code here

}//GEN-BEGIN:|22-getter|2|
return textField;
}
//</editor-fold>//GEN-END:|22-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|23-getter|0|23-preInit
/**
 * Returns an initiliazed instance of exitCommand component.
 * @return the initialized component instance
 */
public Command getExitCommand () {
if (exitCommand == null) {//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
exitCommand = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
return exitCommand;
}
//</editor-fold>//GEN-END:|23-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
/**
 * Returns an initiliazed instance of itemCommand component.
 * @return the initialized component instance
 */
public Command getItemCommand () {
if (itemCommand == null) {//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
itemCommand = new Command ("Item", Command.OK, 0);//GEN-LINE:|25-getter|1|25-postInit
 // write post-init user code here
itemCommand=new Command("ok",Command.OK,0);
}//GEN-BEGIN:|25-getter|2|
return itemCommand;
}
//</editor-fold>//GEN-END:|25-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|32-getter|0|32-preInit
/**
 * Returns an initiliazed instance of stringItem component.
 * @return the initialized component instance
 */
public StringItem getStringItem () {
if (stringItem == null) {//GEN-END:|32-getter|0|32-preInit
 // write pre-init user code here
stringItem = new StringItem ("\u0391\u03C0\u03BF\u03C4\u03AD\u03BB\u03B5\u03C3\u03BC\u03B1:", null);//GEN-LINE:|32-getter|1|32-postInit
 // write post-init user code here
}//GEN-BEGIN:|32-getter|2|
return stringItem;
}
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|33-getter|0|33-preInit
/**
 * Returns an initiliazed instance of okCommand component.
 * @return the initialized component instance
 */
public Command getOkCommand () {
if (okCommand == null) {//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
okCommand = new Command ("Ok", "#", Command.OK, 0);//GEN-LINE:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
return okCommand;
}
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|34-getter|0|34-preInit
/**
 * Returns an initiliazed instance of list component.
 * @return the initialized component instance
 */
public List getList () {
if (list == null) {//GEN-END:|34-getter|0|34-preInit
 // write pre-init user code here
list = new List ("Calculator Panch", Choice.IMPLICIT);//GEN-BEGIN:|34-getter|1|34-postInit
list.append ("Calculator", null);
list.append ("Help", null);
list.append ("About", null);
list.append ("Exit", null);
list.addCommand (getItemCommand1 ());
list.addCommand (getExitCommand3 ());
list.setCommandListener (this);
list.setSelectedFlags (new boolean[] { false, false, false, false });//GEN-END:|34-getter|1|34-postInit
 // write post-init user code here
}//GEN-BEGIN:|34-getter|2|
return list;
}
//</editor-fold>//GEN-END:|34-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|34-action|0|34-preAction
/**
 * Performs an action assigned to the selected list element in the list component.
 */
public void listAction () {//GEN-END:|34-action|0|34-preAction
 // enter pre-action user code here
String __selectedString = getList ().getString (getList ().getSelectedIndex ());//GEN-BEGIN:|34-action|1|37-preAction
if (__selectedString != null) {
if (__selectedString.equals ("Calculator")) {//GEN-END:|34-action|1|37-preAction
 // write pre-action user code here
switchDisplayable (null, getForm ());//GEN-LINE:|34-action|2|37-postAction
 // write post-action user code here
} else if (__selectedString.equals ("Help")) {//GEN-LINE:|34-action|3|38-preAction
 // write pre-action user code here
switchDisplayable (null, getTextBox ());//GEN-LINE:|34-action|4|38-postAction
 // write post-action user code here
} else if (__selectedString.equals ("About")) {//GEN-LINE:|34-action|5|49-preAction
 // write pre-action user code here
switchDisplayable (null, getTextBox1 ());//GEN-LINE:|34-action|6|49-postAction
 // write post-action user code here
} else if (__selectedString.equals ("Exit")) {//GEN-LINE:|34-action|7|39-preAction
 // write pre-action user code here
exitMIDlet ();//GEN-LINE:|34-action|8|39-postAction
 // write post-action user code here
}//GEN-BEGIN:|34-action|9|34-postAction
}//GEN-END:|34-action|9|34-postAction
 // enter post-action user code here
}//GEN-BEGIN:|34-action|10|
//</editor-fold>//GEN-END:|34-action|10|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox ">//GEN-BEGIN:|44-getter|0|44-preInit
/**
 * Returns an initiliazed instance of textBox component.
 * @return the initialized component instance
 */
public TextBox getTextBox () {
if (textBox == null) {//GEN-END:|44-getter|0|44-preInit
 // write pre-init user code here
textBox = new TextBox ("Help", "...", 100, TextField.ANY | TextField.UNEDITABLE);//GEN-BEGIN:|44-getter|1|44-postInit
textBox.addCommand (getExitCommand1 ());
textBox.setCommandListener (this);//GEN-END:|44-getter|1|44-postInit
 // write post-init user code here
}//GEN-BEGIN:|44-getter|2|
return textBox;
}
//</editor-fold>//GEN-END:|44-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox1 ">//GEN-BEGIN:|51-getter|0|51-preInit
/**
 * Returns an initiliazed instance of textBox1 component.
 * @return the initialized component instance
 */
public TextBox getTextBox1 () {
if (textBox1 == null) {//GEN-END:|51-getter|0|51-preInit
 // write pre-init user code here
textBox1 = new TextBox ("About", "A.TEI THESSALONIKIS \nInformation Tech. Department\nAren Memet Erkan\n23-12-2011", 100, TextField.ANY | TextField.UNEDITABLE);//GEN-BEGIN:|51-getter|1|51-postInit
textBox1.addCommand (getExitCommand2 ());
textBox1.setCommandListener (this);//GEN-END:|51-getter|1|51-postInit
 // write post-init user code here
}//GEN-BEGIN:|51-getter|2|
return textBox1;
}
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|46-getter|0|46-preInit
/**
 * Returns an initiliazed instance of exitCommand1 component.
 * @return the initialized component instance
 */
public Command getExitCommand1 () {
if (exitCommand1 == null) {//GEN-END:|46-getter|0|46-preInit
 // write pre-init user code here
exitCommand1 = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|46-getter|1|46-postInit
 // write post-init user code here
}//GEN-BEGIN:|46-getter|2|
return exitCommand1;
}
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|52-getter|0|52-preInit
/**
 * Returns an initiliazed instance of exitCommand2 component.
 * @return the initialized component instance
 */
public Command getExitCommand2 () {
if (exitCommand2 == null) {//GEN-END:|52-getter|0|52-preInit
 // write pre-init user code here
exitCommand2 = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|52-getter|1|52-postInit
 // write post-init user code here
}//GEN-BEGIN:|52-getter|2|
return exitCommand2;
}
//</editor-fold>//GEN-END:|52-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|56-getter|0|56-preInit
/**
 * Returns an initiliazed instance of itemCommand1 component.
 * @return the initialized component instance
 */
public Command getItemCommand1 () {
if (itemCommand1 == null) {//GEN-END:|56-getter|0|56-preInit
 // write pre-init user code here
itemCommand1 = new Command ("Ok", Command.ITEM, 0);//GEN-LINE:|56-getter|1|56-postInit
 // write post-init user code here
}//GEN-BEGIN:|56-getter|2|
return itemCommand1;
}
//</editor-fold>//GEN-END:|56-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand3 ">//GEN-BEGIN:|58-getter|0|58-preInit
/**
 * Returns an initiliazed instance of exitCommand3 component.
 * @return the initialized component instance
 */
public Command getExitCommand3 () {
if (exitCommand3 == null) {//GEN-END:|58-getter|0|58-preInit
 // write pre-init user code here
exitCommand3 = new Command ("Exit", Command.EXIT, 0);//GEN-LINE:|58-getter|1|58-postInit
 // write post-init user code here
}//GEN-BEGIN:|58-getter|2|
return exitCommand3;
}
//</editor-fold>//GEN-END:|58-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */

    public Display getDisplay() {
        
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
