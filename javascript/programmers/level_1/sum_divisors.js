/*
  약수의 합

  정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴

  제한 사항
  n 0 이상 3000이 정수
*/

function compute() {
  let name = '약수의 합';

  let n1 = 12;
  let n2 = 5;

  let sol1 = solution(n1);
  let sol2 = solution(n2);
  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(n) {
  let answer = 0;

  for (let i = 1; i * i <= n; i++) {
    if (n % i === 0) {
      answer += i;
      if (i * i !== n)
        answer += n / i; // 반대 값
    }
  }

  return answer;
}
