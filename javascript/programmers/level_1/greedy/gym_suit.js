/*
  체육복

  여벌 체육복이 있는 학생이 일부 학생에게 빌려주려고 함
  학생들의 번호가 있는데,
  바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음
  체육복을 적절히 빌려줘서 최대한 많은 학생이 체육수업을 들어야함

  전체 학생의 수 n,
  체육복이 필요한 학생들의 번호가 담긴 배열 lost,
  여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 주어질 때,
  체육수업을 들을 수 있는 학생의 최댓값 return 하도록 solution 함수 작성

  제한사항
  전체 학생의 수는 2명 이상 30명 이하
  체육복을 도난당한 학생의 수는 1명 이상 n명이하이고 중복되는 번호 X
  여벌의 체육복을 가져온 학생의 수는 1명 이상 n명이하, 중복 x
  여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있음
  여벌 체육복을 가져온 학생이 도난당했을 수 있음
  이 때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
  남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없음
*/

function compute() {
  let name = '체육복';

  let n = 5;
  let lost = [2, 4];
  let reserve = [1, 3, 5];

  let sol1 = solution(n, lost, reserve);

  n = 5;
  lost = [2, 4];
  reserve = [3];

  let sol2 = solution(n, lost, reserve);

  n = 5;
  lost = [2, 3, 4];
  reserve = [3, 4, 5];

  let sol3 = solution(n, lost, reserve);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(n, lost, reserve) {
  let answer = n - lost.length;

  reserve.sort((a, b) => a - b);
  lost.sort((a, b) => a - b);

  for (let i = 1; i <= n; i++) {
    if (lost.includes(i) && reserve.includes(i)) {
      answer++;
      lost.splice(lost.indexOf(i), 1);
      reserve.splice(reserve.indexOf(i), 1);
    }
  }

  for (let stu of lost) {
    if (reserve.includes(stu - 1)) {
      answer++;
      reserve.splice(reserve.indexOf(stu - 1), 1);
    } else if (reserve.includes(stu + 1)) {
      answer++;
      reserve.splice(reserve.indexOf(stu + 1), 1);
    }
  }

  return answer;
}
