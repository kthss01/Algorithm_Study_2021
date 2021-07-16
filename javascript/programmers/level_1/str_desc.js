/*
  문자열 내림차순으로 배치하기

  문자열 s에 나타나는 문자를 큰 것부터 작은 순으로 정렬해
  새로운 문자열리턴
  s는 영문 대소문자롬나 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주

  제한 사항
  str 길이 1이상인 문자열
*/

function compute() {
  let name = '문자열 내림차순으로 배치하기';

  let s = 'Zbcdefg'

  let sol1 = solution(s);

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


function solution(s) {
  let answer = ''

  // let lowercase = Array(26).fill(0);
  // let uppercase = Array(26).fill(0);
  //
  // for (let i = 0; i < s.length; i++) {
  //     let charcode = s.charCodeAt(i);
  //     // console.log(charcode);
  //
  //     charcode >= 97 ? lowercase[charcode - 97]++ : uppercase[charcode - 65]++;
  // }
  //
  // console.log(lowercase);
  // console.log(uppercase);
  //
  // for (let i = 25; i >= 0; i--) {
  //   if (lowercase[i] !== 0)
  //     answer += String.fromCharCode(i + 97).repeat(lowercase[i]);
  // }
  //
  // for (let i = 25; i >= 0; i--) {
  //   if (uppercase[i] !== 0)
  //     answer += String.fromCharCode(i + 65).repeat(uppercase[i]);
  // }

  answer = s.split('').sort().reverse().join('');

  return answer;
}
