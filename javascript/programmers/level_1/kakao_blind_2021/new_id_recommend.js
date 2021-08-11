/*
  신규 아이디 추천

  카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때,
  입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 것

  규칙
    아이디의 길이는 3자 이상 15자 이하
    아이디는 알파벳 소문자, 숫자, -, _, . 문자만 사용
    단, 마침표(.)는 처음과 끝에 사용 불가 연속으로 사용 불가

    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

  문제
  신규 유저가 입력한 이이디를 나타내는 new_id가 매개변수로 주어질 때
  추천 아이디 return 하는 solution 함수 작성

  제한사항
  new_id는 길이 1 ~ 1000 문자열
  new_id 알파벳 대문자, 소문자, 숫자, 특수문자로 구성
  new_id에 나타날 수 있는 특수문자 -_.~!@#$%^&*()=+[{]}:?,<>/ 한정

*/

function compute() {
  let name = '신규 아이디 추천';

  let new_id = "...!@BaT#*..y.abcdefghijklm";

  let sol1 = solution(new_id);

  new_id = "z-+.^.";

  let sol2 = solution(new_id);

  new_id = "=.=";

  let sol3 = solution(new_id);

  let td = `
    <td rowspan='2'> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function compute2() {
  let new_id = "123_.def";

  let sol1 = solution(new_id);

  new_id = "abcdefghijklmn.p";

  let sol2 = solution(new_id);

  let sol3;

  let td = `
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(new_id) {
  let answer = '';

  // new_id = new_id.toLowerCase().split('')
  //   .filter(ele => (ele.charCodeAt(0) >= 97 && ele.charCodeAt(0) <= 122) || '0123456789-_.'.split('').includes(ele))
  //   .filter((ele, number, arr) => ele === '.' ? ele !== arr[number + 1] : true)
  //   .filter((ele, number, arr) => ele === '.' ? (number !== 0 && number !== arr.length - 1) : true);
  //
  // new_id = new_id.join('');
  // new_id = new_id.length === 0 ? 'a' : new_id;
  // new_id = new_id.length < 16 ? new_id : new_id.substr(0, 15);
  // new_id = new_id[new_id.length - 1] === '.' ? new_id.substr(0, new_id.length - 1) : new_id;
  // new_id = new_id.length > 2 ? new_id : new_id + new_id[new_id.length - 1].repeat(3 - new_id.length);
  //
  // // console.log(new_id);
  //
  // answer = new_id;

  answer = new_id
    .toLowerCase()
    .replace(/[^\w\d-_.]/g, '')
    .replace(/\.{2,}/g, '.')
    .replace(/^\.|\.$/g, '')
    .replace(/^$/, 'a') // 빈 문자열 의미
    .slice(0, 15).replace(/\.$/, '');

  const len = answer.length;

  return len > 2 ? answer : answer + answer[len-1].repeat(3 - len);
}
