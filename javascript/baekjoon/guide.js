// 백준 온라인 저지에서 자바스크립트로 문제 푸는 방법
/*
  참고
  https://velog.io/@exploit017/%EB%B0%B1%EC%A4%80Node.js-Node.js-%EC%9E%85%EB%A0%A5-%EB%B0%9B%EA%B8%B0
  https://velog.io/@two_jay/Node.js%EB%A1%9C-%EB%B0%B1%EC%A4%80-%EB%AC%B8%EC%A0%9C%EB%A5%BC-%ED%92%80%EC%96%B4%EB%B3%B4%EC%9E%90

  방법 2가지
  1. readline 모듈 사용
  2. fs 모듈 사용 <- 이 방법이 정석으로 보임
*/

// readline 모듈 사용
const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// 소스 코드1 (한 줄 입력)
rl.on('line', function(line) {
  console.log(line); // 입력 받은 값 출력
  rl.close();
}).on('close', function() {
  prcess.exit();
});

// 소스 코드2 (여러 줄 입력)
let input = [];

rl.on('line', function (line) {
  // input.push(line);

  // 공백 기준으로 구분되어 split(' ') 을 이용하여 array 만듬
  // 연산에서 정수로 활용되므로 .map((el) => parseInt(el)) 이용
  input = line.split(' ').map((el) => parseInt(el));
}).on('close', function() {
  // console.log(input);

  // 실제 구현부
  let num1 = input[0];
  int num2 = input[1];

  console.log(num1/num2);

  process.exit();
})

//////////////////////////////////////////////////////////////////
// 소스 코드1 (한 줄 입력)
// fs 모듈 사용
let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split(' ');

let num = Number(input);

for (let i = 1; i <= num; i++) {
  console.log(i);
}

// 소스 코드2 (여러 줄 입력)
// fs 모듈을 써서 경로(여기서는 '/dev/stdin') 에 있는 파일을 동기적으로 읽어와서
// 그 내용을 input에 저장. toString().split(" ") or split("\n") 등으로 분할에서 array로 저장
input = fs.readFileSync('/dev/stdin').toString().split('\n');

let count = input[0];
let numbers = [];

for (let i = 1; i < input.length; i++) {
  if (input[i] !== '') {
    numbers.push(input[i].split(' '));
  }
}

for (let i = 0; i < numbers.length; i++) {
  let num1 = Number(numbers[i][0]);
  let num2 = Number(numbers[i][1]);

  console.log(num1 + num2);
}
