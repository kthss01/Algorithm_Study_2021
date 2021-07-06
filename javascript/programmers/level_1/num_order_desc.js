/*
  정수 내림차순으로 배치하기
  n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 정수를 리턴
  ex)
  n = 118372 -> 873211 리턴

  제한 조건
  n 1 이상 800000000 이하인 자연수
*/

function solution(n) {
  let answer = 0;

  answer = String(n).split('').sort().reverse().join('');

  return Number(answer);
}
