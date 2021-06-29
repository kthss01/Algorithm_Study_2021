// 로또의 최고 순위와 최저 순위
// 2021 Dev-Matching: 웹 백엔드 개발자(상반기) 문제

/*
  로또의 순위를 정하는 방식
  순위    당첨내용
  1       6개 번호가 모두 일치
  2       5개 번호가 일치
  3       4개 번호가 일치
  4       3개 번호가 일치
  5       2개 번호가 일치
  6(낙첨) 그 외

  일부 번호를 알아볼 수 없게 됨
  알아볼 수 없는 번호 0으로 표기
  로또로 당첨이 가능했던 최고 순위와 최저 순위 알아보기

  ex)
  뽑은 번호 44, 1, 0, 0, 31, 25 가정
  당첨 번호 31, 10, 45, 1, 6, 19
  최고 31, 10, 44, 1, 6, 25 - 4개 번호 일치 3등
  최저 31, 11, 44, 1, 7, 25 - 2개 번호 일치 5등

  순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정
  3등을 만드는 다른 방법도 많음
  마찬가지로 5등을 만드는 방법도 많음

  제한 사항
  lottos 길이 6인 정수 배열
  lottos 모든 원소는 0 이상 45 이하인 정수
    0은 알아볼 수 없는 숫자 의미
    0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않음
    lottos의 원소들은 정렬되어 있지 않을 수도 있음
  win_nums의 모든 원소는 1 이상 45이하인 정수
    win_nums에는 같은 숫자가 2개 이상 담겨있지 않음
    win_nums의 원소들은 정렬되어 있지 않을 수도 있음
*/

// function solution(lottos, win_nums) {
//   let answer = [];
//
//   // console.log(lottos);
//   // console.log(win_nums);
//
//   let isSame = 0;
//   let isZero = 0;
//
//   for (let lotto of lottos) {
//     // console.log('lotto : ' + lotto);
//
//     if (lotto === 0) {
//       isZero++;
//     } else {
//       for (let num of win_nums) {
//         if (lotto === num) {
//           isSame++;
//           break;
//         }
//       }
//     }
//   }
//
//   // console.log(`isSame : ${isSame} isZero : ${isZero}`);
//
//   let rank = [6, 6, 5, 4, 3, 2, 1];
//
//   let maxLotto = rank[isZero + isSame];
//   let minLotto = rank[isSame];
//
//   answer.push(maxLotto);
//   answer.push(minLotto);
//
//   return answer;
// }

// 더 간단한 방법 filter 사용
function solution(lottos, win_nums) {
  const rank = [6, 6, 5, 4, 3, 2, 1];

  let minCount = lottos.filter(v => win_nums.includes(v)).length;
  let zeroCount = lottos.filter(v => !v).length; // !0은 true

  const maxCount = minCount + zeroCount;

  return [rank[maxCount], rank[minCount]];
}
