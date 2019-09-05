//ingreso de valores en scala
100 
//El resultado de poner 100 directo, scala te identifica que es un 
//entero por lo tanto es in Int 
res0: Int = 100
//ingreso el valor en scala
2.5  
//nos detecta que es un double
res1: Double = 2.5

//operaciones matematicas
 1 + 1  Int = 2
 2 - 1  Int = 1
 2 * 5  Int = 10
 1 / 2  Int = 0
 1.0 / 2 Double = 0.5
 1 / 2.0 Double = 0.5
 1.0 / 2.0 Double = 0.5

// Exponenciales en scala
math.pow(5, 2)  //Double = 25.0
res1 // Int = 100
res1 + res5 // Int = 125
1 + 2 * 3 + 4 //Int = 11
(1+2) * (3+4) //Int = 21

//porcentajes
3 * 0.3048  //Double = 0.914400

/* 
--- una variable "value" consiste en que es una variable inmutable ya que no se puede modificar sino hasta que se 
acabe el ciclo de ejecucion y no puedes resignar un valor.
--- las variables "variable" consiste en que es una variable mutable por lo que esta variable puede ser modificable
en cualquier momento.*/

//Tipos de datos en scala
// Int -----este es un entero ej:(1,12,14,5,8,100)
// Double --esto es un desimal ej:(1.2,3.2,23.4)
// String --esta es una cadena de texto ej:("Esto es una cadena de texto")
// Boolean -esto consta de que si es verdader o falso
// Collections --collecciones

//estructura de una variable y value
// val <name> : <type> = <literal>
// var <name> : <type> = <literal>

var myvar: Int = 10
val myval: Double = 2.5
 ///valores que aseptan las variables antes declaradas, value no se puede sustituir ya que no es mutable
myvar = "hello" //error: type mistmatch
myvar = 100
myval = "hello" //error: reassignment to val
myval = 10.1 //error: reassigment to val

val c = 20 //Scala reasina que es un Int 20
val my_string = "Hello" //my_string: String = Hello


//Booleans y comparacion de operaciones
true
false
1 > 2 // false
1 < 2 // true
1 <= 30 // true
2 == 2 // true
2 != 4 // true

4 % 2 // 0 mod operator
5  % 2 // 1
6 % 2 // if 0 the number is even

//Strings
println("Hello")
println('Hello') //Error unclosed character literal
val greeting = "Hello " + "there!"
"dance"*5
val st = "hello"
val name = "Rigo"
///interpolacion
val greet = s"Hello ${name}"
val greet = s"Hello $name"

printf("A string %s, an integer %d, a float %f", "Hi",10,3.1416)
printf("A float %1.2f", 1.2345)
printf("A float %1.2f", 1.2395)

val st = "This a long string"
st.charAt(0)
st.charAt(3)
st.indexOf("a")
st slice  (0,4)
