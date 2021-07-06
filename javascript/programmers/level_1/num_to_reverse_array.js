/*
  자연수 뒤집어 배열로 만들기

  자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
  ex)
  n = 12345 -> [5,4,3,2,1]

  제한 조건
  n은 10,000,000,000이하인 자연수
*/

function solution(n) {
  // let answer = [];
  //
  // answer = String(n).split('').reverse();
  //
  // return answer.map(e => Number(e));
  return n.toString().split('').reverse().map(e => Number(e));
}
