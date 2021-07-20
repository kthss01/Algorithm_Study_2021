/*
  다트 게임

  다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임

  다트 게임의 점수 계산 로직
  1. 다트 게임은 총 3번의 기회
  2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지
  3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고
    각 영역 당첨 시 점수에 1제곱, 2제곱, 3제곱으로 계산
  4. 옵션으로 스타상(*), 아차상(#)이 존재하며
    스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만듬
    아차상(#) 당첨 시 해당 점수는 마이너스 된다.
  5. 스타상(*)은  첫 번째 기회에서도 나올 수 있다. 이 경우
    첫 번째 스타상(*)의 점수만 2배가 된다.
  6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다.
    이 경우 중첩된 스타상(*) 점수는 4배가 된다.
  7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다.
    이 경우 중첩된 아차상(#)의 점수는 -2배가 된다.
  8. Single(S), Double(D), Triple(T)는 점수마다 하나씩 존재한다.
  9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며,
    존재하지 않을 수도 있다.

  0~10의 정수와 문자 S,D,T,*,#로 구성된 문자열이 입력될 시
  총 점수를 반환하는 함수 작성

  입력 형식
  "점수|보너스|[옵션]" 문자열 3세트
  ex) 1S2D*3T
    점수는 0-서 10사이의 정수
    보너스는 S,D,T 중 하나
    옵션은 *이나 # 중 하나이며, 없을 수도 있다.

  출력 형식
  3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력
  ex) 37
*/

function compute1() {
  let name = '다트 게임';

  let dartResult = '1S2D*3T';
  let sol1 = solution(dartResult);

  dartResult = '1D2S#10S';
  let sol2 = solution(dartResult);

  dartResult = '1D2S0T';
  let sol3 = solution(dartResult);

  let td = `
    <td rowspan="3"> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function compute2() {
  let dartResult = '1S*2T*3S';
  let sol1 = solution(dartResult);

  dartResult = '1D#2S*3S';
  let sol2 = solution(dartResult);

  dartResult = '1T2D3D#';
  let sol3 = solution(dartResult);

  let td = `
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function compute3() {
  let dartResult = '1D2S3T*';
  let sol1 = solution(dartResult);

  dartResult;
  let sol2;

  dartResult;
  let sol3;

  let td = `
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(dartResult) {
  let answer = 0;

  // let darts = [];
  //
  // let count = 0;
  //
  // while (dartResult.indexOf('S') !== -1 || dartResult.indexOf('D') !== -1 || dartResult.indexOf('T') !== -1) {
  //   // while (count++ < 3) {
  //   let checkList = [];
  //   if (dartResult.indexOf('S') !== -1) checkList.push(dartResult.indexOf('S'))
  //   if (dartResult.indexOf('D') !== -1) checkList.push(dartResult.indexOf('D'))
  //   if (dartResult.indexOf('T') !== -1) checkList.push(dartResult.indexOf('T'))
  //
  //   // let index = Math.min(checkList);
  //   let index = Math.min.apply(null, checkList);
  //
  //   // console.log(index);
  //
  //   if (dartResult[index + 1] === '*' || dartResult[index + 1] === '#') {
  //     index++;
  //   }
  //
  //   darts.push(dartResult.substring(0, index + 1));
  //   dartResult = dartResult.substr(index + 1);
  //
  //   // console.log(dartResult);
  // }
  //
  // let scores = Array(darts.length).fill(0);
  //
  // // console.log(scores);
  //
  // for (let i = 0; i < darts.length; i++) {
  //   let dart = darts[i];
  //
  //   let hasBonus2 = dart.indexOf('*') !== -1 || dart.indexOf('#') !== -1;
  //
  //   scores[i] = hasBonus2 ? Number(dart.substring(0, dart.length - 2)) : Number(dart.substring(0, dart.length - 1));
  //
  //   let bonus = hasBonus2 ? dart[dart.length - 2] : dart[dart.length - 1];
  //
  //   switch (bonus) {
  //     case 'D':
  //       scores[i] = Math.pow(scores[i], 2);
  //       break;
  //     case 'T':
  //       scores[i] = Math.pow(scores[i], 3);
  //       break;
  //   }
  //
  //   if (hasBonus2) {
  //     let bonus2 = dart[dart.length - 1];
  //     switch (bonus2) {
  //       case '*':
  //         scores[i] *= 2;
  //         if (i !== 0) scores[i - 1] *= 2;
  //         break;
  //       case '#':
  //         scores[i] *= -1;
  //         break;
  //     }
  //   }
  // }
  //
  // // console.log(darts);
  // // console.log(scores);
  //
  // answer = scores.reduce((sum, ele) => sum + ele, 0);
  //
  // // console.log(answer);

  const bonus = {"S" : 1, "D" : 2, "T": 3};
  const prize = {"*" : 2, "#": -1};
  const notNum = ["S", "D", "T", "*", "#"];
  const score = [];
  let digit = 0;

  for (let i = 0; i < dartResult.length; i++) {
    let cur = score.length;

    if (!notNum.includes(dartResult[i])) {
      digit = dartResult[i+1] === '0' ? 10 : dartResult[i];

      if (digit == 10) {
        i++;
      }

      continue;
    }

    if (bonus[dartResult[i]]) {
      score.push(digit ** bonus[dartResult[i]]);
    }

    if (prize[dartResult[i + 1]]) {
      if (dartResult[i + 1] === '*') {
        score[cur] *= 2;
        if (cur - 1 >= 0) score[cur - 1] *= 2;
      }

      if (dartResult[i + 1] === '#') {
        score[cur] *= -1;
      }
    }
  }

  answer = score.reduce((sum, ele) => sum + ele, 0);

  return answer;
}
