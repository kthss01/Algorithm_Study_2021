// A+B
/*
  두 정수 A와 B를 입력 받은 다음, A+B를 출력
  (0 < A, B < 10)
  A, B 공백 기준 입력
*/

let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ');

let a = parseInt(input[0]);
let b = parseInt(input[1]);

console.log(a + b);
