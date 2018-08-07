package org

import geb.Page

class LoginPageObject  extends Page{
	
	static content={
		name = {$("input" , "#userName")}
		password = {$("input" , "#password")}
	  loginbutton = {$("input" , "#login")}
	}
	

} 
