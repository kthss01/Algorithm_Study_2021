/*
  서울에서 김서방 찾기

  String 배열 seoul의 element 중 Kim의 위치 x를 찾아
  김서방은 x에 있다는 String 반환

  seoul에 kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없음

  제한 사항
  seoul 길이 1이상, 1000 이하인 배열
  seoul의 원소는 길이 1이상, 20이하인 문자열
  Kim 반드시 seoul 안에 포함
*/

function compute() {
  let name = '서울에서 김서방 찾기';

  let seoul = ['Jane', 'Kim'];

  let sol1 = solution(seoul);

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


function solution(seoul) {
  let answer = ''

  answer = `김서방은 ${seoul.indexOf('Kim')}에 있다`;

  return answer;
}
