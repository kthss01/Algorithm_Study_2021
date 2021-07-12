/*
  x만큼 간격이 있는 n개의 숫자

  정수 x와 자연수 n을 입력 받아,
  x부터 시작해 x씩 증가하는 숫자를 n개를 지니는 리스트를 리턴

  제한 조건
  x = -10000000 이상 10000000 이하인 정수
  n은 1000 이하인 자연수
*/

function solution(x, n) {
  let answer = [];

  // for (let i = 1; i <= n; i++) {
  //   answer.push(i * x);
  // }

  answer = Array(n).fill(x).map((v, i) => (i + 1) * v);

  return answer;
}
