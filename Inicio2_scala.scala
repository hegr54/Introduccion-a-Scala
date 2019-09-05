val st = "item1 item2 item3" 
///verifica que coinida el string
st matches "item1 item2 item3" // res0: Boolean = false
st matches "item2" // res1: Boolean = true
///verifica si contiene la palabra 
st contains "item1" // res2: true
st contains "tem4" // res3: false

//Tuples
(1, 2.3, "Hello") // res4: (Int, Double, String) = (1, 2.3, Hello)
val my_tup = (1,2.2, "hello,", 23.2, true) 
// res4: (Int, Double, String, Double, Boolean) = (1,2.2,"Hello", 23.2, true)
(3,1,(2,3))
// res5: (Int, Int, (Int, Int)) = (3,1,(2,3))
my_tup._3 // res6: String = hello
my_tup._5 // res7: Boolean = true

// Collections Lists, arrays, 
//creaciones de listas
val evens = List(2,4,6,8,10) //evens: List[Int] = List(2,4,6,8,10)

List(1,2.2,true)  // res8: List[AnyVal] = List(1, 2.2, true)
//evaluacion de posiciones 
evens(0)  //res9: Int = 2
evens(4)  //res10: Int =10
evens.head //res11: Int = 2
evens.tail //res12: List[Int] = List(4, 6, 8, 10)
val my_list = List(List(1,2,3),List(3,2,1))
val my_list = List(("a",1), ("b",2),("c",3))
val my_list = List(1,5,3,7,6,109)
my_list.lift //de que tipo es tu lista
my_list.sorted //ordenar lista
my_list.size //tama;o de la lista
my_list.max //maximo de la lista
my_list.min //minimo de la lista
my_list.sum //suma de la lista
my_list.product //el producto de la lista

val z = List(4,5,6,7)
z.drop(2)  //borramos la posicion 2
z.takeRight(1) //la ultima posicion
z.takeRight(3) //las tres ultimas posiciones

val x = List(1,2,3,4,5,6,7,8)

// encapsular datos
x slice (0,3) 
x slice (3, 6)
