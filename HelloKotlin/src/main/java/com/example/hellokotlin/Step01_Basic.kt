package com.example.hellokotlin

/*
    [ kotlin 기본 data type ]
    - import 없이 바로 사용할 수 있는 data type

    Byte, Short, Int, Long
    Float, Double
    Boolean, Char
    String
*/

fun main(){
    // 정수를 담을 수 있는 num 이라는 이름의 변수를 만들어서 10 대입하기
    //(java int num=10;,javascript let num=10;) type identifier =value; 의 형태였다.)
    //var(변수, 값을 바꿀수 있음(java에서 final 과 같음)) or val(상수, 값을 바꿀 수 없음) identifier : type=value;
    var num:Int=10;
    //실수를 담을 수 있는 num2라는 이름의 변수를 만들어서 10.1 대입하기
    var num2:Double=10.1;
    // myName 이라는 변수에 문자열 "김구라" 대입하기
    var myName:String="김구라";
    // yourName 이라는 상수에 문자열 "해골" 대입하기
    val yourName:String="해골";
    //변수는 값 변경 가능
    myName="누구게";
    //상수는 값이 한번 결정되면 값 변경 불가
    //yourName="원숭이"; = 불가능

    // type 추론이 가능한 경우 type 생략 가능
    var num3=30
    var ourName="에이콘"
    var num4=10.1

    //변수를 미리 선언하고
    var num5:Int
    //값을 나중에 넣을 수 있다.
    num5=50
    //변수나 상수를 미리 만들고 값을 나중에 넣고 싶으면 반드시 type을 명시해야 한다.
    //var num6
    //num6=60 = 불가능

    //상수도 미리 만들어 놓고
    val PI:Float
    //값을 나중에 대입할 수 있다.
    PI=3.14159f
    //상수는 값이 한번 결정이 되면 값 변경 불가
    //PI=3.14f

    println("main() 함수가 종료 됩니다!")
}




