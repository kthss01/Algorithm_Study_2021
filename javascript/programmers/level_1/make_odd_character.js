/*
  이상한 문자 만들기

  임의의 양의 정수 n에 대해,
  n이 어떤 양의 정수 x의 제곱인지 아닌지 판단
  n의 양의 정수 x의 제곱이라면 x+1의 제곱 리턴
  아니면 -1 리턴

  제한 사항
  n 1 이상 50000000000000 이하인 양의 정수
*/

function compute() {
  let name = '이상한 문자 만들기';

  let s = "try hello world";

  let sol1 = solution(s);
  s = "t";
  // 참고 index로 접근은 되는데 수정은 안됨
  // s[0] = "a";
  // console.log(s);
  let sol2 = solution(s);
  s = "hello world "; // HeLlO WoRlD 뒤에 공백도 나와야 함
  let sol3 = solution(s);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(s) {
  let answer = '';

  // console.log(String(n).toUpperCase());
  // console.log(String(n).toUpperCase().split(' ')
  //   .reduce((sum, ele) => sum + ele.split('')
  //     .reduce((sum2, ele2, i) => i % 2 === 0 ? sum2 + ele2 : sum2 + ele2.toLowerCase(), '') , ''));

  // for (let word of s.split(' ')) {
  //   let newWord = '';
  //   for (let i = 0; i < word.length; i++) {
  //     if (i % 2 === 0) {
  //       newWord += word.charAt(i).toUpperCase();
  //     } else {
  //       newWord += word.charAt(i).toLowerCase();
  //     }
  //   }
  //   // console.log(newWord);
  //   answer += newWord + ' ';
  // }
  //
  // answer = answer.trim();
  // if (answer.length !== s.length)
  //   answer = answer.concat(' '.repeat(s.length - answer.length));

  // answer = String(s).toUpperCase().split(' ')
  //   .reduce((sum, ele) => sum +
  //   ele.split('')
  //     .reduce((sum2, ele2, i) =>
  //       i % 2 === 0 ? sum2 + ele2 : sum2 + ele2.toLowerCase(), '')
  //   + ' ', '').trim();

  let offset = -1;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === ' ') {
      offset = i;
      answer += s[i];
    } else {
      answer += (i - offset + 1) % 2 === 0 ? s[i].toUpperCase() : s[i].toLowerCase();
    }
  }

  // console.log(s);
  // console.log(answer);

  return answer;
}
