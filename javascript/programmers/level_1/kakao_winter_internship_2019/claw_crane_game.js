/*
  크레인 인형뽑기 게임

  게임 화면은 1x1 크기의 칸들로 이루어진 N x N 크기의 정사각형 격자
  위쪽에 크레인이 있고 오른쪽에 바구니가 있음
  각 격자 칸에는 다양한 인형이 들어있으며 인형이 없는 칸은 빈칸
  모든 인형은 1x1크기의 격자 한 칸을 차지하며
  격자의 가장 아래 칸부터 차곡차곡 쌓여 있음
  게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서
  가장 위에 있는 인형을 집어 올릴 수 있음
  집어 올린 인형은 바구니에 쌓이게 되는 데,
  이 때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됨

  만약 같은 모양의 인형 두 개가 바구니에 연속하여 쌓이게 되면
  두 인형은 터뜨려지면서 바구니에서 사라지게 됨
  크레인 작동시 인형이 집어지지 않는 경우는 없으나
  만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는
  아무런 일도 일어나지 않음
  또한 바구니는 모든 인형이 들어갈 수 있을만큼 충분히 크다고 가정

  게임 화면의 격자의 상태가 담긴 2차원 배열 board와
  인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가
  매개변수로 주어질 때, 크레인을 모두 작동시킨 후 터트려져 사라진
  인형의 개수 return 하도록 solution 함수 완성

  제한사항
    board 배열은 2차원 배열로 크기는 5x5 이상 30x30 이하
    board 각 칸에는 0 이상 100 이하인 정수가 담겨있음
      0 빈칸
      1 ~ 100 각 숫자 각기 다른 인형의 모양 의미
      같은 숫자 같은 모양
    moves 배열의 크기 1 이상 1,000 이하
    moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수
*/

function compute() {
  let name = '크레인 인형뽑기 게임';

  let board = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]];
  let moves = [1,5,3,5,1,2,1,4];

  let sol1 = solution(board, moves);

  let sol2;

  let sol3;

  let td = `
    <td> ${name} </td>
    <td> ${sol1} </td>
    <td> ${sol2} </td>
    <td> ${sol3} </td>
  `;

  return td;
}

function solution(board, moves) {
  let answer = 0;

  let result = [];

  // console.log(moves);
  // console.table(board);

  moves.forEach((move) => {
    for (let i = 0; i < board.length; i++) {
      let j = move - 1;
      if (board[i][j] !== 0) {

        // result.push(board[i][j]);

        const top = result.length === 0 ? -1 : result[result.length - 1];
        if (top === board[i][j]) {
          result.pop();
          answer += 2;
        } else {
          result.push(board[i][j]);
        }

        board[i][j] = 0;
        break;
      }
    }
  });

  // console.log(result);
  // console.table(board);

  return answer;
}
