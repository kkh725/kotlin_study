fun main(args: Array<String>) {
    /**
     * map 에도 불변, 가변형이 존재한다.
     * 불변형 - 요소를 추가 또는 삭제 할 수 없다.
     */

    val foods : Map<Int,String> = mapOf(1 to "chicken", 2 to "icecream", 3 to "kimchi") //map 초기화시키는방법. 그냥 map 은 초기화시키고 불변. Map 은 읽기 전용이다.

    /**
     * 가변형 map. hashmap
     */

    val map : HashMap<String,Int> = HashMap<String,Int>() // hashmap 은 읽기전용 x 수정할수있음. Put으로 값을 추가 가능.
    val map2 : MutableMap<String,String> = mutableMapOf()
    map2.put("String" , "String")
    map2.put("Str2ing" , "Stri2ng")
    /**
     * Map은 key값에 대한 중복이 허용되지않는다 !!!!! 중요.
     * String key값에 String이 들어왔다면 1key-> 1 value이다.
     */

    map.put("string",1)

    println(map2)
    println(map)


}