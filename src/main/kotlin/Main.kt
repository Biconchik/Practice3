import java.util.Random
import kotlin.math.pow
import kotlin.math.sqrt
fun main(args: Array<String>)
{
    val myAge = 18
    if(myAge > 13 && myAge < 19)
    {
        val isTeenager = true
    }
    //если возраст больше 12 и меньше 20, значение "это подросток" становиться правдой

    val theirAge = 30
    val bothTeenagers = (13 < myAge && myAge < 19) && (13 < theirAge && theirAge < 19)

    val reader = "Вика"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    //определяем равна ли строка "чтец" со строкой "автор"

    val readerBeforeAuthor = reader < author
    //сравнение строк по алфавиту

    val myAge2 = 18
    if (myAge2 > 13 && myAge2 < 19)
    {
        println("Подросток")
    }else{
        println("Не подросток")
    }
    //почти тоже самое что и в первом

    val answer = if (myAge2 > 13 && myAge2 < 19) println("Подросток") else println("Не подросток")
    println(answer)
    //тоже самое только в строчку и с выводом значения

    var counter = 0
    while (counter < 10)
    {
        println(counter)
        counter += 1
    }
    //цикл пока с увеличивающейся

    counter = 0
    var roll = 0
    do{
        roll = Random().nextInt(6)
        counter+=1
        println("После $counter бросков, roll равен $roll")
    }while(roll != 0)
    //цикл где "counter" никогда не будет равен 0

    val range = 1..10
    for (i in range){
        println("${i.toDouble().pow(2.0)}")
    }
    //цикл от 1 до 10 который выводит значение каждого числа от 1 до 10

    for (i in range){
        println("${sqrt(i.toDouble())}")
    }
    // тоже самое только выводит корень каждого числа

    var sum = 0;
    for(row in 1 until 8 step 2){
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
    // от 1 до 8 только нечетные числа
}