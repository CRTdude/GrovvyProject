package org

import spock.lang.Specification

class BDDExample extends Specification {
 def "Scenario: multiply"(){
	 given: "An integer with value 10"
	 def i=10
	 
	 when: "This number is multiplied with 2"
	 i= i*2
	 
	 then: "The final value is 20"
	 assert 20==i
 }	 
 def "Scenario: addition"(){
	given : "An interger with value 15"
	def j=15
	//println "enter your number"
	//int number1=System.in.newReader().readLine()
	
	when: " this number is added with with 5"
	j= j+5
	
	then: "the value is 20"
	assert 20==j	 
 }
 
 def "Scenario: subtraction"(){
	 given : "An interger with value 10"
	 def k=10
	 
	 when: " this number is subtracted with with 5"
	 k= k-5
	 
	 then: "the value is 20"
	 assert 5==k
  }
  
  def "Scenario: division"(){
	  given : "An interger with value 10"
	  def l=10
	  
	  when: " this number is divided with with 2"
	  l= l/2
	  
	  then: "the value is 20"
	  assert 5==l
   }
 
}
