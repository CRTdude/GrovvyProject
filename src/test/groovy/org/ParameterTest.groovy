package org

import spock.lang.Specification
import spock.lang.Unroll

class ParameterTest extends Specification {
	//@Unroll('#x plus #y is equals to #z')
	@Unroll('The value given #x and #y when added is #z')
	def "Data-Driven Testing"(){
		expect: "The sum of x and y is equal to z"
		z==x+y
		
		where: "The data table is given below:"
		x|y|z
		10|20|30
		20|30|50
		5|15|20
		5|5|15
	}
	

}
