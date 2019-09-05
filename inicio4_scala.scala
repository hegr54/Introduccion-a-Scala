//Control Flow
// if, else if, and else

////////////////////
//// Genaral syntax ////
/////////////////////
// if(boolean){
//    do something    
// }else if (boolean){
//    do something else   
// }else{
//    do somethin if none of the booleans were true     
// }
//creaciones de if
if(true){
    println("If you are true I will print!!")
}

if(3 == 3){
    println("3 is iqual to 3")
}

val x = "hello"

if(x.endsWith("o")){
    println("The string ends with letter o!!")
}

val x = "hellox"

if(x.endsWith("o")){
    println("The string ends with letter o!!")
}else{
    println("The string does not end with o!!")
}

val person = "Rigoberto"

if(person == "Rigo"){
    println("Hello Rigo!")
}else if (person == "Rigoberto"){
    println("Welcome to scala basics Rigoberto!")
}else{
    println("Hello anonymous person!!")
}

//AND
println((1 == 2) && (3 == 3))
//OR
println((1 == 2) || (3 == 3))
//NOT
println(!(1 == 1))

///sintaxis de for
//For Loopps
/////////////////////////////////////////
/// Genaral syntax  ////////////////////
////////////////////////////////////////
// for(item <- interable_sequence){
//     do something
// }
for(i <- List("Hugo", "Paco", "Luis")){
    println("Hello " + i)
}

for(i <- Array.range(0,5)){
    println(i)
}

for(i <- Set(1,2,3)){
    println(i)
}
//interpolacion
for(num <- Range(0,10)){
    if(num%2 == 0){
        println(s"$num is even")
    }else{
        println(s"$num is odd")
    } 
}

val names = List("Juan", "Luis", "Hugo", "Rigoberto", "Carlos")

for(name <- names){
    if(name.startsWith("R")){
        println(s"$name starts with a R")
    }
}