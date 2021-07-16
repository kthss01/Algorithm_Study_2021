/*
  소수 찾기

  1부터 입력받은 숫자 n 사이에 있는 소수의 개수 구하기

  소수는 1과 자기 자신으로만 나누어지는 수를 의미
  (1 소수 아님)

  제한 조건
  n 2이상 1000000 이하의 자연수
*/

function compute() {
  let name = '소수 찾기';

  let n;

  n = 10;
  let sol1 = solution(n);

  n = 5;
  let sol2 = solution(n);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

// 에라토스체네스의 체
function solution(n) {
  let answer = 0;

  let erathos = new Array(n).fill(false);

  for (let i = 2; i <= n; i++) {
    if (!erathos[i]) {
      erathos[i] = true;
      answer++;
      for (let j = i; j <= n; j += i) {
        erathos[j] = true;
      }
    }
  }

  return answer;
}
