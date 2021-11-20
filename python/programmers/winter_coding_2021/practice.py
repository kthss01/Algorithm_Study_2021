'''
직사각형 4개의 점 중 3점 주어질 때 나머지 한 점 구하기
'''

def solution(v):
    answer = [0] * 2
    # print(answer)
    
    a, b, c = v
    # print(a, b, c)
    
    if a[0] == b[0]:
        answer[0] = c[0]
    elif b[0] == c[0]:
        answer[0] = a[0]
    else:
        answer[0] = b[0]
        
    if a[1] == b[1]:
        answer[1]= c[1]
    elif b[1] == c[1]:
        answer[1] = a[1]
    else:
        answer[1] = b[1]
    
    return answer

v = [[1, 4], [3, 4], [3, 10]]
result = [1, 10]

v = [[1, 1], [2, 2], [1, 2]]
result = [2, 1]

print(solution(v))