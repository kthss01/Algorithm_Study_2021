/*
  평균 구하기

  정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution 완성

  제한사항
  arr 길이 1이상, 100이하인 배열
  arr의 원소는 -10,000 이상 10,000 이하인 정수
*/


function solution(arr) {
  let answer = 0;

  // const result = arr.reduce(function add(sum, curVal) {
  //   return sum + curVal;
  // }, 0); // 뒤에 0은 init val 써주는게 좋다고 함
  //
  // // console.log(result);
  //
  // answer = result / arr.length;

  answer = arr.reduce((a,b)=>a+b) / arr.length; // 화살표 함수, 람다식 쓰면 좋음 연습하자

  return answer;
}
