/*
  숫자 문자열과 영단어

  숫자 문자열 중 일부가 영어 단어로 바꿔져있을 때 숫자로 바꾸기

  제한사항
  1 <= s의 길이 <= 50
  s가 zero 또는 0으로 시작하는경우 x
  return 값 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어짐
*/

function compute() {
  let name = '숫자 문자열과 영단어';

  let s = "one4seveneight";

  let sol1 = solution(s);

  s = "23four5six7";

  let sol2 = solution(s);

  s = "2three45sixseven";

  let sol3 = solution(s);

  let td = `
    <td rowspan='2'> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function compute2() {
  let s = "123";

  let sol1 = solution(s);

  s = "fourfour";
  let sol2 = solution(s);

  let sol3;

  let td = `
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(s) {
  let answer = '';

  const number = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];

  // console.log(s);

  // number.forEach((ele, number) => s = s.replace(new RegExp(ele, 'g'), number));
  number.forEach((ele, i) => s = s.split(number[i]).join(i));

  // console.log(s);

  // answer = Number(s);
  answer = parseInt(s);

  return answer;
}
