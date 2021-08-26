// 피보나치 수 
import * as prob1 from './problem/fibonacci.js'

// N개의 최소공배수
import * as prob2 from './problem/n_lcm.js'

// JadenCase 문자열 만들기
import * as prob3 from './problem/jadenCase_str.js'

// 행렬의 곱셈
import * as prob4 from './problem/matrix_multiplication.js'

// 최솟값 만들기
import * as prob5 from './problem/make_min.js'


import compute from './main.js'

compute({...prob1, id: 'prob01'});
compute({...prob2, id: 'prob02'});
compute({...prob3, id: 'prob03'});
compute({...prob4, id: 'prob04'});
compute({...prob5, id: 'prob05'});

