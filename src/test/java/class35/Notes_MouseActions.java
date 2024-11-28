package class35;

public class Notes_MouseActions {

	/*
	 Mouse Action
	 --------------
	 Mouse Over ---> movetoElement(element)
	 right click --->contextClick(element)
	 double click ---> doubleClick(element)
	 drag and drop--->dragAndDrop(source, target)
	 
	 Actions - pre definded class provided in selecnium 
	 build- create an action
	 perform - complete an action
	 without build we can perform the action
	 Insome scenarios we will first build the action later we will perform it 
	 
	 //internal declaration of perform method
	 public void perform() {
     build().perform();
  	 }
  	 
  	 getText() Vs getAttribute(attribute)
	------------------------------------
	
	<input id="xyz"> welcome </input>
	
	getText() --> returns the inner text  --> welcome
	getAttribute("id") -- returns the value of attribute ---> xyz
	
	<input value="welcome"></input>
	getAttribute("value") ---> welcome

	 Action    Vs    Actions
	 ---------------------------------------
	 Action - interface, we will used to store created actions
	 Actions - class, will be used to perform mouse actions
	 
	 */

}
