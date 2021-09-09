/*

문제 설명
각 칸마다 S, L, 또는 R가 써져 있는 격자가 있습니다. 
당신은 이 격자에서 빛을 쏘고자 합니다. 
이 격자의 각 칸에는 다음과 같은 특이한 성질이 있습니다.

빛이 "S"가 써진 칸에 도달한 경우, 직진합니다.
빛이 "L"이 써진 칸에 도달한 경우, 좌회전을 합니다.
빛이 "R"이 써진 칸에 도달한 경우, 우회전을 합니다.
빛이 격자의 끝을 넘어갈 경우, 반대쪽 끝으로 다시 돌아옵니다. 
예를 들어, 빛이 1행에서 행이 줄어드는 방향으로 이동할 경우, 
같은 열의 반대쪽 끝 행으로 다시 돌아옵니다.
당신은 이 격자 내에서 빛이 이동할 수 있는 경로 사이클이 몇 개 있고, 
각 사이클의 길이가 얼마인지 알고 싶습니다. 
경로 사이클이란, 빛이 이동하는 순환 경로를 의미합니다.

예를 들어, 다음 그림은 격자 ["SL","LR"]에서 
1행 1열에서 2행 1열 방향으로 빛을 쏠 경우, 
해당 빛이 이동하는 경로 사이클을 표현한 것입니다.

이 격자에는 길이가 16인 사이클 1개가 있으며, 
다른 사이클은 존재하지 않습니다.

격자의 정보를 나타내는 1차원 문자열 배열 grids가 매개변수로 주어집니다. 
주어진 격자를 통해 만들어지는 
빛의 경로 사이클의 모든 길이들을 배열에 담아 오름차순으로 정렬하여 
return 하도록 solution 함수를 완성해주세요.

고민
사이클이 아닌 경우를 제외하면 사이클임
사이클인 것을 찾으면 상태에 맞게 이동하면서 길이 구하면 끝

사이클이 아닌 건
0,0 을 기준으로 생각하고 경우를 0,0으로 들어오는 것으로 생각할 때
4방향에서 한번 씩 해볼 때 (최대 4방향이 나옴)
다시 0,0으로 들어오는 게 있으면 그건 사이클이 아님

*/

function State(pos, dir) {
    this.pos = pos;
    this.dir = dir;
}

function solution(grid) {
    var answer = [];
    let check = {
        'top': false,
        'right': false,
        'bottom': false,
    }

    for (let i = 0; i < 4; i++) {
        let startState;
        
        if (i === 0) {
            if (grid[0].length > 1) {
                startState = new State([0, grid[0].length-1], 'left');
            } else {
                startState = new State([0, 0], 'left');
            }
        } else if (i === 2) {
            if (grid.length > 1) {
                startState = new State([grid.length-1, 0], 'top');
            } else {
                startState = new State([0,0], 'top');
            }
        } else if (i === 1) {
            if (grid[0].length > 1) {
                startState = new State([0, 1], 'right');
            } else {
                startState = new State([0, 0], 'right');
            }
        } else if (i === 3) {
            if (grid.length > 1) {
                startState = new State([1, 0], 'bottom');
            } else {
                startState = new State([0, 0], 'bottom');
            }
        }

        let curState = {
            pos: startState.pos.slice(),
            dir: startState.dir
        };

        const nextState = new State([0,0]);
        let cnt = 1;

        while (true) {
            const light = grid[nextState.pos[0]][nextState.pos[1]];

            if (curState.dir === 'left') {
                if (light === 'S') {
                    nextState.dir = 'left';
                } else if (light === 'L') {
                    nextState.dir = 'bottom';
                } else if (light === 'R') {
                    nextState.dir = 'top';
                }
            } else if (curState.dir === 'right') {
                if (light === 'S') {
                    nextState.dir = 'right';
                } else if (light === 'L') {
                    nextState.dir = 'top';
                } else if (light === 'R') {
                    nextState.dir = 'bottom';
                }
            } else if (curState.dir === 'top') {
                if (light === 'S') {
                    nextState.dir = 'top';
                } else if (light === 'L') {
                    nextState.dir = 'left';
                } else if (light === 'R') {
                    nextState.dir = 'right';
                }
            } else if (curState.dir === 'bottom') {
                if (light === 'S') {
                    nextState.dir = 'bottom';
                } else if (light === 'L') {
                    nextState.dir = 'right';
                } else if (light === 'R') {
                    nextState.dir = 'left';
                }
            }

            curState.pos = nextState.pos.slice();
            curState.dir = nextState.dir;
            if (nextState.dir === 'left') {
                nextState.pos[1] += 1;
                if (nextState.pos[1] === grid[0].length) {
                    nextState.pos[1] = 0;
                }
            } else if (nextState.dir === 'right') {
                nextState.pos[1] -= 1;
                if (nextState.pos[1] === -1) {
                    nextState.pos[1] = grid[0].length - 1;
                }
            } else if (nextState.dir === 'top') {
                nextState.pos[0] += 1;
                if (nextState.pos[0] === grid.length) {
                    nextState.pos[0] = 0;
                }
            } else if (nextState.dir === 'bottom') {
                nextState.pos[0] -= 1;
                if (nextState.pos[0] === -1) {
                    nextState.pos[0] = grid.length - 1;
                }
            }

            if (nextState.pos[0] === 0 && nextState.pos[1] === 0) {
                if (curState.dir === startState.dir) {
                    if (answer.some(ele => ele === cnt)) {
                        if ((curState.dir === 'top' && !check['top']) ||
                        (curState.dir === 'right' && !check['right']) ||
                        (curState.dir === 'bottom' && !check['bottom'])) 
                            answer.push(cnt);
                    } else {
                        answer.push(cnt);
                    }
                    break;
                } else if (curState.dir === 'top') {
                    check['top'] = true;
                } else if (curState.dir === 'right') {
                    check['right'] = true;
                } else if (curState.dir === 'bottom') {
                    check['bottom'] = true;
                }
            }

            cnt++;
        }
    }

    return answer.sort((a, b) => a - b);
}

console.log(solution(["SL", "LR"]));
console.log(solution(["S"]));
console.log(solution(["R","R"]));