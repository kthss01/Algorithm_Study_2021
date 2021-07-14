/*
  정수 제곱근 판별

  임의의 양의 정수 n에 대해,
  n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
  n의 양의 정수 x의 제곱이라면 x+1의 제곱 리턴
  아니면 -1 리턴

  제한 사항
  n 1 이상 50000000000000 이하인 양의 정수
*/

function compute() {
  let name = '정수 제곱근 판별';

  let n1 = 121;
  let n2 = 3;

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
  let answer = -1;

  // for (let i = 1; i <= Math.sqrt(n); i++) {
  //   if (i * i === n) {
  //     answer = (i + 1) * (i + 1);
  //   }
  // }

  let sqrt = Math.sqrt(n);
  answer = Number.isInteger(sqrt) ? Math.pow(sqrt+1, 2) : -1;

  return answer;
}
