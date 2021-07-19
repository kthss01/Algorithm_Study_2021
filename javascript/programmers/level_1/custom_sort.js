/*
  문자열 내 마음대로 정렬하기

  문자열로 구성된 리스트 strings와 정수 n이 주어졌을 때,
  각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 함

  ex)
      ["sun", "bed", "car"] 이고 n이 1이면
      각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings 정렬

  제한 조건
  strings는 길이 1이상, 50이하인 배열
  strings의 원소는 소문자 알파벳으로 이루어져 있음
  strings의 원소는 길이 1이상, 100이하인 문자열로
  모든 strings의 원소의 길이는 n보다 큼
  인덱스 1의 문자가 같은 문자열이 여럿 일 경우,
  사전순으로 앞선 문자열이 앞쪽에 위치
*/

function compute() {
  let name = '문자열 내 마음대로 정렬하기';

  let strings = ["sun", "bed", "car"];
  let n = 1;

  let sol1 = solution(strings, n);

  strings = ["abce", "abcd", "cdx"];
  n = 2;

  let sol2 = solution(strings, n);
  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(strings, n) {
  let answer = [];

  // answer = strings.sort((a, b) => a[n] < b[n] ? -1 : a[n] > b[n] ? 1 :
  //   a > b ? 1 : a < b ? -1 : 0);

  answer = strings.sort((a,b) => a[n] === b[n] ? a.localeCompare(b) : a[n].localeCompare(b[n]));

  return answer;
}
