/*
 *      1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 
 *         점수를 score 배열 변수에 저장하고 
 *      1) 아래와 같이 출력하시오.
		1번 학생 : 100점  
		2번 학생 : 90점  
		3번 학생 : 85점  
		2) 학생들의 총점을 출력하시오.
		
		배열 
		 = 같은 데이터형의 여러개 변수를 하나로 묶어서 다루는 것
		               ---------
		 = 배열은 용도가 같은 데이터가 많은 경우 주로 사용 
		 = 중요 : 같은 데이터형
		         정수배열 / 실수배열 / 문자배열 / 문자열배열 
		 = 예)
		      정수 배열 
		      int[] arr={10,20,30,40,50}
		      ----- --- ----------------
		                | 배열에 저장되는 값
		            | 배열명(참조변수)
		      | 배열 데이터형 
		          Stack                  Heap
		      arr -----------> ---------------------------------
		      (메모리 주소)         10   20      30    40      50
                               ---------------------------------
                                  |    |       |      |      |
                               arr[0] arr[1] arr[2] arr[3] arr[4] => 해당 영역의 변수명
                               
                               => 변수명이 설정 => 배열명[인덱스]
                               => 인덱스 0번부터 ~  length-1
               프로그램 언어 (C#,C/C++,Kotlin,Dart,Scara...)
               => 문제 , 예제 => C/C++
               ---------- 변수 / 데이터형 / 연산자 / 제어문
                                         ------------- 문장 (메소드) 
                          ---- 단어 (배열) 
                 영어 : 알파벳 (조합 => 단어 => 숙어 => 문장)
                       => 사용순서 
                       => 조립방법 : 필요한 부분은 재사용 (메소드)
                       => 문장 완료 : 클래스 
               => 묶어서 사용 
                  => 데이터 여러개 묶음 : 배열/클래스 
                  => 명령문 : 연산자/제어문 : 메소드 => 구조적인 프로그램 
                  => 자바 => 누가 잘 묶는가? 
               배열 생성 
               ------- 
               선언방식             선언 예
               데이터형[] 배열명      int[] score => 권장
               -------- 배열데이터형 
               데이터형 배열명[]      int score[]
               
               초기화 => 사용할 수있게 값을 배열 공간에 첨부 
               데이터형[] 배열명;
               배열명=new 데이터형[]{값.....}
                                 ---------
               데이터형[] 배열명=new 데이터형[갯수첨부]
                                        ------- 기능은 없다 , 데이터를 묶어서 쉽게 관리가 가능
                                        => 변수/배열 => 읽기/쓰기 
                               
 */
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] score={100,90,85}; // 값이 지정되면 사용 {} , 값 설정이 없는 경우 new
        // 변수 생성 => score[0] score[1] score[2]
        // 출력 
        int sum=0;
        for(int i=0;i<score.length;i++)
        {
        	sum+=score[i];
        	System.out.println((i+1)+"번 학생:"+score[i]+"점");
        }
        // 총점 
        System.out.println("총점:"+sum);
	}

}
