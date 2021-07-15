/*
  시저 암호

  어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
  다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 함

  ex)
  AB 1만큼 밀면 BC
    3만큼 밀면 DE

  z 1만큼 밀면 a

  문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문 만들기

  제한 조건
    공백은 아무리 밀어도 공백
    s는 알파벳 소문자, 대문자, 공백으로만
    s의 길이는 8000이하
    n은 1이상 25이하인 자연수
*/

function compute() {
  let name = '시저 암호';

  let s, n;

  s = "AB";
  n = 1;
  let sol1 = solution(s, n);

  s = "z";
  n = 1;
  let sol2 = solution(s, n);

  s = "a B z";
  n = 4;
  let sol3 = solution(s, n);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}
// A 65 a 97
function solution(s, n) {
  let answer = '';

  for (let i = 0; i < s.length; i++) {
    if (s[i] === ' ') {
      answer += s[i];
      continue;
    }

    // let c = s.charCodeAt(i);
    // let asciiA = 'A'.charCodeAt(0);
    // let asciiZ = 'Z'.charCodeAt(0);
    // let asciia = 'a'.charCodeAt(0);
    // c = c >= asciiA && c <= asciiZ
    //   ? (c-asciiA + n) % 26 + asciiA :
    //   (c-asciia + n) % 26 + asciia;
    //
    // answer += String.fromCharCode(c);
    let c = s.charCodeAt(i);
    answer += String.fromCharCode(
      c >= 97 ? (c - 97 + n) % 26 + 97
      : (c - 65 + n) % 26 + 65
    );
  }

  return answer;
}
