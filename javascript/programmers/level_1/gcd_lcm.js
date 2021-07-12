/*
  최대공약수와 최소공배수

  두 수를 입력받아 두 수의 최대공약수와 최소공배수 반환하기

  배열의 맨 앞에 최대약수, 그다음 최소공배수를 넣어 반환

  ex) 3, 12
  gcd : 3 lcm 12

  제한사항
  두 수는 1이상 1000000이하 자연수
*/

function gcd(a, b) {
  let tmp;

  if (a > b) {
    tmp = a;
    a = b;
    b = tmp;
  }

  while (b != 0) {
    tmp = a % b;
    a = b;
    b = tmp;
  }

  return a;
};

function solution(n, m) {
  let answer = [];

  console.log(gcd(n, m));

  const lcm = n * m / gcd(n ,m);

  answer = [gcd(n,m), lcm];

  return answer;
}
