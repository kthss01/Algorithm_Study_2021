// 피보나치 수 
import * as prob1 from './problem/fibonacci.js'

// N개의 최소공배수
import * as prob2 from './problem/n_lcm.js'

import compute from './main.js'

compute({...prob1, id: 'prob01'});
compute({...prob2, id: 'prob02'});

