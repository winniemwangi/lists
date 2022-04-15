fun main (){

    names(listOf("Winnie","Sharon","Thomas","Wanjiru","Anena","Kishoiyn","Joan","Ivon","Robert","Jane","Kally"))


   var height = personsHeight(listOf(21,34,35,13,167,150))
    println(height.sum())
    println(height.average())


    var a = Details("Winnie", 23, 167, 60)
    var b = Details("Faith", 21, 163, 46)
    var c = Details("Mollen", 43, 150, 65)
    var d = Details("Wambui", 33, 160, 20)
    var e = Details("Damaris", 20, 172, 95)
    var f = Details("Patrick", 29, 172, 70)
    var x = listOf<Details>(a,b,c,d,e,f)
    var decrease = x.sortedByDescending { detail -> detail.age }
    println(decrease)


    var p = Cars("KCD 123s", 100)
    var q = Cars("KCP 342K",120)
    var r = Cars("KDA 349A",200)
    var s = Cars("KBB 097W",300)
    var t = listOf<Cars>(p,q,r,s)
    var mile = avMileage(t)
    println(mile)
}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun names(name:List<String>) {
    name.forEachIndexed { index, s ->
        if (index%2==0)
            println(s)
    }
}


//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun personsHeight(heit:List<Int>):List<Int>{
    return heit

}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Details (var name:String, var age:Int, var height:Int, var weight: Int)

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Cars(var registration:String, var mileage:Int)

fun avMileage(names: List<Cars>):Int{
    var aver = 0
    names.forEach { car ->
        aver+=car.mileage
    }
    return aver/names.count()
}




