import java.util.Stack

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

    val stack = Stack<String>() //스택: last in first out 먼저 들어온 데이터가 가장 먼저 나간다.
    stack.push("string")
    stack.pop()
    println(stack.size)

    /**
     * 스택 활용
     * 스택을 활용하면 "재귀함수"를 필요로하는 소스코드에 "재귀함수"를 사용하지 않고 구현할 수 있습니다.
     * 웹 브라우저의  방문기록에서도 스택의 특징을 활용하여 "뒤로가기"를 구현할 수 있습니다.
     * 프로그램의 실행취소((Undo)에서 활용됩니다.
     * 후위표기 계산식에서 활용됩니다
     */

}