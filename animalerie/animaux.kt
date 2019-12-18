interface Animal{
    fun parler()
    fun quiSuisJe()
}

fun main(){

    var place = Animalerie()
    var Saturne: Animal  = Chien()
    var Repeto: Animal = Perroquet()
    var Zeus: Animal = Chat()

    place.add(Saturne)
    place.add(Repeto)
    place.add(Zeus)

    place.display()
}





