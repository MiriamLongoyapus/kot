fun main() {
    println(details("Miriam",30,"Kenya"))
    println(stringLength("Miriam"))
    println(check("Longoyapus"))
    println(replace("Miriam"))
}
//Write a function that takes in 3 parameters, name, age, and country, and returns
// a String with this structure “Hi, my name is x, I am y years old and I am from z.
// ” Where x, y, and z are the provided name, age, and country respectively.
fun details(name:String, age: Int, country: String): String {
    return "Hi, my name is $name, I am $age years old and I am from $country"
}
//Write a function that takes in a String and returns its length
fun stringLength(name: String): Int {
    return name.length
}
//Write a function that takes in a name and prints out “That’s me!” when your name is
// passed to it, otherwise, it prints out “I don’t know who that is”
fun check(name: String): String {
    if (name==name){
        return "that's me"
    }else{
        return "I don’t know who that is"
    }
}
// Write a Kotlin function that takes in a string will all the vowels replaces by the
// character ‘*’. Use string interpolation to generate the output.
fun replace(name: String,empty):String{
    var vowels="miriam"
    var empty=""
    for( i in name){
        if (i in vowels){
            empty+=i
                }
            }
    return name

}