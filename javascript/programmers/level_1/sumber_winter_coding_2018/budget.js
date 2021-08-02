/*
  예산

  부서별로 물품을 구매하는데 필요한 금액 조사
  전체 예산이 정해져 있기 때문에 모든 부서의 물품 구매 불가
  최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 함

  물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해줘야 함

  ex) 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며
  1,000원보다 적은 금액을 지원해 줄 수는 없음

  부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때
  최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수 완성

  제한사항
  d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하
  d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수
  budget은 예산을 나타내며, 1이상 10,000,000 이하의 자연수
*/

function compute() {
  let name = '예산';

  let d = [1,3,2,5,4];
  let budget = 9;

  let sol1 = solution(d, budget);

  d = [2,2,3,3];
  budget = 10;

  let sol2 = solution(d, budget);
  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(d, budget) {
  let answer = 0;

  d.sort((a, b) => a - b);

  let sum = d.reduce((sum, ele) => sum + ele, 0);

  let cnt = d.length - 1;

  while (true) {
    if (sum <= budget) {
      break;
    }
    sum -= d[cnt--];
  }

  answer = cnt + 1;

  return answer;
}
