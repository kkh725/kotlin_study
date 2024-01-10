fun main(args: Array<String>) {
    /**
     * nullable (?) : null 을 허용한다
     * Non-null (!!) : null 값이 아님
     *
     * null 을 특정상황에서 허용해줄 때 사용한다.
     */

    // 코틀린은 기본적으로 변수 초기화시에 non-null 타입이다. 값이 있음.

    var a : Int = 100
    var b : String? = null // ? 문자열을 붙였을 시 null 값을 선언할 수 있다.
    val c : String = "Notnull" // c 값이 Null 일지 아닐지 모르는 상황이 오기때문에 nullable 로 선언한다.

    println(c.length)


}