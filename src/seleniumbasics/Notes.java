package seleniumbasics;

public class Notes {
	 //Diffrence  between get and navigate	 
	   /*get() is used to navigate particular URL(website) and
	      *  wait till page load.   driver. navigate() is used to navigate
	      *   to particular URL and does not wait to page load. 
	   It maintains browser history or cookies to navigate back or forward.*/ 
	
/*xpath and css selector

Xpath-- syntax--- //tagName[@attribute='value']  

if multiple macthes found: (//tagName[@attribute='value'])[2]
//Tagname-- first word or character- pink
//attribute-Orange color
//value-- Value -blue color-0

Css Selector- syntax--- tagName[attribute='value']  

Scenario2-- If elements values are changing dynamically then what you will do--- 

Parent ->child xpath---
Syntax--parentXpath/childTagName
if multiple matches found---(parentXpath/childTagName)[1]

child-> parent xpath
childXpath/parent::parentTagName
//div[@id='idcard-container']/parent::div

parent child- css selector-
parentCssSlector childTagName

If multiple matches found 
parentCssSlector childTagName:nth-child(1)

child-parent - css selector---Not Possible-

//Following sibling, preceding sibling--

parent -child sibling-- following
(ParentSiblingXpath/following-sibling::chilsSiblingTagname)

child-parent sibling--    preceding

ChildSiblingXpath/preceding-sibling::parentSiblingTagname




Diffrence between absolute xpath and relative xpath---

 //Absolute Xpath --it uses complete path from root element  --parent--chidl xpath  
 //Relative xpath--You can simply start by referencing the element you want and go from there.---  simple xpath
 
Which xpath you will prefer--  Relative xpath--
 
 css selector or xpath --- 
 css selector faster 
  if css selector is faster then why you are going with xpath--  
  1. Css conider hidden elements-
  2. xpath have more combinations compare to css-*/
	
//Diffrence beteween findElement and FindElements- 
	  //if we want to use single webelement then findelement
	  //if there is list of webelement then findelements
	  
	  //if element is not found then it throws no such element exception
	  //findelement-- if element is not found then it will not throw exception,it will return size of webelement
	  
}