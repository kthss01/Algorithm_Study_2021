/*
  짝수와 홀수
  정수 num이 짝숭리 경우 Even 반환
  홀수인 경우 Odd 반환

  제한 조건
  num int 범위의 정수
  0 짝수
*/

function solution(num) {
  const answer = num % 2 === 0 ? "Even" : "Odd";
  return answer;
}
