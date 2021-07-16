/*
  문자열 내 p와 y의 개수

  대문자와 소문자가 섞여있는 문자열 s가 주어짐
  s에 p의 개수와 y의 개수를 비교해 같으면 true 아니면 false 반환

  p,y 모두 하나도 없으면 항상 true 리턴
  개수 비교시 대소문자 구별 x

  제한 사항
  문자열 s의 길이 : 50이하의 자연수
  문자열 s는 알파벳으로만 이루어져 있음
*/

function compute() {
  let name = '문자열 내 p와 y의 개수';

  let s = 'pPooyY'

  let sol1 = solution(s);

  s = 'Pyy';
  let sol2 = solution(s);

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}


function solution(s) {
  let answer = ''

  // let p = 0;
  // let y = 0;
  //
  // s.toLowerCase().split('').forEach((elt) => (elt === 'p' || elt === 'y') ?
  //   (elt === 'p' ? p++ : y++) : '');
  //
  // answer = p === y ? true : false;

  answer = s.toUpperCase().split('P').length === s.toUpperCase().split('Y').length;

  return answer;
}
