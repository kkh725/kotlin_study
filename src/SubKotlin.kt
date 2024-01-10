fun main(args: Array<String>) {
    var array = arrayOf(10) //모든 형태의 배열 크기 10의 배열
    array = arrayOf(1,2,3,4,5,6,67)
    println(array[6])

    /**
     * 동적 배열 선언.
     * 배열의 원소가 추가됨에 따라 size가 바뀌게된다.
     */
    val dynamicarr = arrayListOf(10) // <>제네릭 기호가 없는 arraylistof 는 ()안에 리스트의 값이 들어감.
    val dynamic = arrayListOf<String>() // 동적배열을 초기화 시켜줄때는 arraylistof<형태>() 사용

    dynamicarr.add(1)
    dynamicarr.add(2)
    dynamicarr.add(3)
    dynamicarr.add(4)

    for (i in dynamicarr){
        println(i)
        println(dynamicarr.size)
    }

}