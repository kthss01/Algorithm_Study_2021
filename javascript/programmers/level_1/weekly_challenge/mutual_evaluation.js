/*
  상호 평가

  상호평가를 통하여 학생들이 제출한 과제물에 학점을 부여하려고 함

  각 학생들이 받은 점수의 평균을 구하여, 기준에 따라 학점을 부여하고자 함
  만약, 학생들이 자기 자신을 평가한 점수가 유일한 최고점 또는 유일한 최저점이라면
  그 점수는 제외하고 평균을 구함

  제외할 점수는 제외하고 평균을 구한 후, 아래 기준에 따라 학점 부여
  90점 이상 A
  80점 이상 90점 미만 B
  70점 이상 80점 미만 C
  50점 이상 70점 미만 D
  50점 미만 F

  2차원 배열 scores가 매개변수로 주어짐
  학생들의 학점을 구하여 하나의 문자열로 만들어서 return

  제한사항
  2 <= scores 의 행의 길이(학생 수) <= 10
  scores의 열의 길이 = scores의 행의 길이
    즉, scores는 행과 열의 길이가 같은 2차원 배열
  0 <= scores의 원소 <= 100
  return 값 형식

*/

function compute() {
  let name = '상호 평가';

  let scores = [[100,90,98,88,65],[50,45,99,85,77],[47,88,95,80,67],[61,57,100,80,65],[24,90,94,75,65]];

  let sol1 = solution(scores);

  scores = [[50,90],[50,87]];
  let sol2 = solution(scores);

  scores = [[70,49,90],[68,50,38],[73,31,100]];

  let sol3 = solution(scores);

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(scores) {
  let answer = '';

  for (let i = 0; i < scores.length; i++) {
    let score = [];

    for (let j = 0; j < scores[i].length; j++) {
      score.push(scores[j][i]);
    }
    // console.log(score);

    let selfScore = score[i];
    // console.log(selfScore);

    score.sort((a, b) => a - b);

    if (score[0] === selfScore && score[1] !== selfScore) score.shift();
    if (score[score.length - 1] === selfScore && score[score.length - 2] !== selfScore) score.pop();
    // console.log(score);

    score = score.reduce((sum, ele) => sum + ele, 0) / score.length;
    // console.log(score);

    score = Number.parseInt(score / 10);
    // console.log(score);

    score = "FDDCBAA"[Math.max(score - 4, 0)];

    // switch (score) {
    //   case 9 : score = 'A'; break;
    //   case 8 : score = 'B'; break;
    //   case 7 : score = 'C'; break;
    //   case 6 : score = 'D';
    //   case 5 : score = 'D'; break;
    //   default : score = 'F'; break;
    // }

    answer += score;
  }

  return answer;
}
