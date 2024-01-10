fun main(args: Array<String>) {
    val a=100
    val b=200

    if (a==100 || a==200) println(a) // or 연산자

    if (a==100 && b==100) println(b) //and 연산자. a가 100, b가 같이 100이면 b출력
    else println(a)

    when (b){ // if문과 같다. 하지만 if문보다 더 가독성있게 작성할 수 있음. when 보다 눈에 잘들어옴
        1->{ // a가 1이라면 수행할 코드

        }
        2->{

        }
        100->{
            println("a는 100입니다")
        }

        else -> {
            //else 코드 작성
            println("실패")
        }
    }
}