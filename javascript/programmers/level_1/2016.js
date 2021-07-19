/*
  2016년

  2016년 1월 1일은 금요일

  2016년 a월 b일은 무슨 요일?
  두 수 a,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수
  요일의 이름은 일요일부터 토요일까지 각각
  SUN, MON, TUE, WED, THU, FRI, SAT

  ex) a=5, b=24 5월 24일 화요일

  제한조건
  2016년 윤년
  2016년 a월 b일 실제로 있는 날 13월 26일 같은 날짜는 주어지지 않음
*/

function compute() {
  let name = '2016년';

  let a = 5;
  let b = 24;

  let sol1 = solution(a, b);

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

function solution(a, b) {
  let answer = '';

  // // 2016년 1월 1일 금요일, 2016년 윤년
  const week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT'];
  // const month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
  //
  // let days = 0;
  //
  // for (let i = 1; i < a; i++) {
  //   days += month[i-1];
  // }
  //
  // days += b - 1;
  // answer = week[(days + 5) % 7];

  answer = week[new Date(`2016-${a}-${b}`).getDay()];

  return answer;
}
