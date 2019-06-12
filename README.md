# roman-converter-app
This app can be used to convert arabic numeric values to the corresponding roman values.
The "translate" included mathod in the RomanConverterService class receives an integer arabaic number value and iterates through an array which contains the set of letters from the Latin alphabet (I	V	X	L	C	D	M). This array represent the roman numeric system where:
Symbol	I	V	X	  L	  C	  D  	M
Value	  1	5	10	50	100	500	1.000
While the arabic number value received by the "translate" method parameter is greater or equals to the current value of the roman symbol, the program appends the currnet letter from the roman symbol and decreases the value of the received arabic number to keep the corresponding value for the current symbol.
The RomanConverterServiceTest class executes the translate method for all the number between 1 and 3.999 asserts that for each of these numbers, the translate method returns the correct roman value. 
