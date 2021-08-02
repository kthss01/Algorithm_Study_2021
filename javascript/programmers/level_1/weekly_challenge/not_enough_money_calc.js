/*
  부족한 금액 계산하기

  이 놀이기구 원래 이용료 price원
  놀이기구 N 번째 이용한다면 원래 이용료의 N배 받기로 함
  처음 이용료 100
  2번째 200 3번째 300으로 요금 인상

  놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서
  얼마가 모자라는지를 return 하는 solution 함수 구현
  단, 금액이 부족하지 않으면 0을 return

  제한 사항
  놀이기구의 이용료 pirce : 1 <= price <= 2500 price는 자연수
  처음 가지고 있던 금액 money : 1 <= money <= 1,000,000,000 money는 자연수
  놀이기구의 이용 횟수 count : 1 <= count <= 2500 count는 자연수
*/

function compute() {
  let name = '부족한 금액 계산하기';

  let price = 3;
  let money = 20;
  let count = 4;

  let sol1 = solution(price, money, count);
  let sol2;
  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(price, money, count) {
  let answer = -1;

  // let sum = new Array(count).fill(price).reduce((sum, ele, index) => sum + ele * (index + 1), 0);

  // answer = Math.max(sum - money, 0);

  let sum = price * count * (count + 1) / 2 - money;
  answer = sum > 0 ? sum : 0;

  return answer;
}
