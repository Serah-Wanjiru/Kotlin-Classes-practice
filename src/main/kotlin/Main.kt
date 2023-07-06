fun main(){
    val ankara = Ankara(20, 7)
    println(ankara.getPattern())
    val ankararaa=Ankara(15,4)
    println(ankararaa.getPattern())
    var migration=Migration("Zebras","Serengeti","dry","low")
    println(migration.movement())


    val project1 = Filmproject(listOf("Monday", "Tuesday"), listOf("Actor1:Jane", "Actor2:Serah"), 10000.00)
    val project2 = Filmproject(listOf("Wednesday", "Thursday"), listOf("Actor3:Caro", "Actor4:Hellen"), 15000.00)
    val project3=Filmproject(listOf("Wednesday", "Thursday"), listOf("Actor3:Caro", "Actor4:Hellen"), 100000.00)

    addFilm(project1)
    addFilm(project2)
    addFilm(project3)

    val totalSpent1 = 5000.00
    val remainingBudget1 = checkBudget(project1, totalSpent1)
    println("Remaining budget for project1: $remainingBudget1")

    val totalSpent2 = 10000.00
    val remainingBudget2 = checkBudget(project2, totalSpent2)
    println("Remaining budget for project2: $remainingBudget2")

    val totalSpent3 = 50000.00
    val remainingBudget3 = checkBudget(project2, totalSpent2)
    println("Remaining budget for project2: $remainingBudget2")

    var ankaraa=Ankaraa("flowery")
    println(ankaraa.getMaterial(26,4))

    var drum=Drum("lether","small")
    drum.playSound("wuu")
    var drum1=Djembe("lether","big")
    drum1.playSound("saprano")


}
class Ankara(var temperature: Int, var moods: Int) {
    var temp=20..30
    var mood=5..10

    fun getPattern(): String {
         return if (temperature in temp && moods in mood ) {
             "Wear light and more patterned Ankara."
        } else {
            "Wear dull and less patterned Ankara."
        }
    }


}

class Migration(var species:String,var location:String,var weatherpattern:String,var riverLevel:String){
    fun movement():String{
        var weather="dry"
        var level="low"
        if (weatherpattern==weather && riverLevel==level){
            return "Migration of $species will occur from $location because of lack of food and water"
        }
        else
            return "Migration of $species will not occur from $location ."


    }
}

class Filmproject(var schedule: List<String>, var castmembers: List<String>, var budget: Double)
var movies = mutableListOf<Filmproject>()
fun addFilm(film: Filmproject) {
    movies.add(film)
    println(movies)
}
fun checkBudget(film: Filmproject, totalSpent: Double): Double {
    val remainingBudget = film.budget - totalSpent
    return remainingBudget
}

class Ankaraa(var ankaraDesign:String){
    fun getMaterial(temperaturee:Int,moodss:Int):String{
        if (temperaturee in 25..30 &&moodss in 1..5){
            return "Wear a $ankaraDesign ankara"
        }
        else
            return "dont wear a $ankaraDesign  ankara"
    }
}

open class Drum(var material:String,var size:String){
    open fun playSound(sound:String){
        println("")
    }
}
class  Djembe( material:String, size:String):Drum(material,size) {
    override fun playSound(sound: String) {
        println("it make this $sound")

    }
}
class  Talking( material:String,size:String):Drum(material,size) {
    override fun playSound(sound: String) {
        println("")

    }

}
class  Bougarabou( material:String, size:String) :Drum(material,size){
    override fun playSound(sound: String) {
        println("")

    }
}



