fun main(args: Array<String>) {
    /**
     * lateinit 에 대하여 ********
     * 일반적으로 Nullable 유형이 아닌 것은 선언과 동시에 초기화되어야한다. 권고 .
     * non_nullable 인 유형인 경우에 선언과 동시에 초기화 하지않는게 좋을때 late init 을 사용한다.
     *
     * 코틀린에서는 null값 사용을 권장하고 있지 않다. (초기에 값을 지정해주기 어려울때 Null값을 쓰긴하지만,)
     * 따라서 late init을 사용하는듯 하다.
     * var 변수에만 사용가능하다. 가변성 때문
     *
     * 초기화 확인 여부는 var 변수 이름 앞에 ::(콜론2개)를 붙이고 .isInitialized를 사용
     */

    var somthing : String? = "null" // 이라고 사용할 수도 있겠지만, null값을 사용하지 않음을 권고
    lateinit var something : String

    /**
     * code code code
     * code
     * cod
     * code
     */

    something = "Something"
    println(something)


}