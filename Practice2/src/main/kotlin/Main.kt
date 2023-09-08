fun main(args: Array<String>) {
    // 1 номер
    val age1 = 42
    val age2 = 21 /*при использовании комбинации клавишь Ctrl + Shift + P
    среда разработки правильно выводит Int */

//2 номер
    val age1 = 42
    val age2 = 21
    val avg1: Double = (42+21)/2 //Среда разработки неправильно выводит Int

// 3 номер
    val age1 = 42
    val age2 = 21
    val avg1: Double = (42+21)/2.toDouble() // С помощью toDouble мы преобразовали Int в Double, теперь среда разработки правильно выведет Double
//4 номер
    val firstName: String = "Надежда"
    val lastName: String = "Ашихмина"

//5 номер
    val firstName: String = "Надежда"
    val lastName: String = "Ашихмина"
    val fullName: String = firstName + " " + lastName //Конкатенация строки

//6 номер
    val firstName: String = "Надежда"
    val lastName: String = "Ашихмина"
    val fullName: String = firstName + " " + lastName
    val myDetails = "Привет, меня зовут $fullName" //Использование шаблонной строки

// 7 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)

// 8 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
    val month = data.first //*получение доступа внутри Triple
    val day = data.second
    val year = data.third

// 9 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23)
    val month = data.first
    val day = data.second
    val year = data.third
    val(month,_,year)=data
    println(data)//выведется только месяц и год

//10 номер
    val data: Triple<Int,Int,Int> =Triple(9,7,23) //Значения внутри Pairs и Triple изменить нельзя изменить нельзя
    val month = data.first + 2
    val day = data.second
    val year = data.third
    val dataTwo = Pair(month, year)

}