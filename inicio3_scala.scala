// creaciones de Arrays
// Arrays si son mutables las listas no
val arr = Array(3,4,5)
val arr = Array("a","b","c")
val arr = Array("a","b", true, 1.2)

//Create arrays  with range method
//creacion de arreglos
Array.range(0, 10) //del 0 al 10 de uno en uno
Array.range(0, 10, 2) //del 0 al 10 de 2 en 2

Range(0,5) //crea un arreglo con 5 posiciones

//Sets not cotains duplicate elements
//no podemos dublicar elementos con Sets
val s = Set()
val s = Set(1,2,3)

val s = Set(2,2,2,3,3,3,5,5,5)
//podemos forsar a un Set a ser mutable
val s = collection.mutable.Set(1,2,3)
s += 4 ///agregar el cuatro

val ims = collection.mutable.Set(2,3,4)
ims += 5 //agrega el valor 5
ims.add(6) //te dice que si se puede agregar y lo agrega
ims ///visualisas el Set

ims.max
ims.min

val mylist = List(1,2,3,1,2,3)
mylist.toSet ///no repites valores


val newset = mylist.toSet
newset

//Maps key value pair storage

val mymap = Map(("saludo", "Hola"), ("pi", 3.1416), ("z", 1.3))
mymap("pi")
mymap("saludo")
mymap("ja")
mymap get "pi"
mymap get "z"
mymap get "o"

val mutmap = collection.mutable.Map(("z", 123), ("a", 5), ("b", 7))

mutmap += ("lucky" -> 777) //agregar valor
mutmap //visualisar mapa
mutmap.keys //llaves de los valores
mutmap.values //valores
