'''
최소직사각형

다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서,
작아서 들고 다니기 편한 지갑을 만들어야 함

아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냄

명함 번호 가로 길이 세로 길이
1           60         50
2           30         70
3           60         30
4           80         40

가장 긴 가로 길이와 세로 길이가 80, 70 이기 때문에
모든 명함들을 수납 가능
2번 명함을 가로로 눕혀 수납한다면 80 x 50 으로
모든 명함 수납 가능

모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어짐
모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때,
지갑의 크기를 return 하는 solution 함수 완성

제한사항
size의 길이는 1 이상 10,000 이하
    size의 원소는 [w, h] 형식
    w는 명함의 가로 길이
    h는 명함의 세로 길이
    w와 h는 1 이상 1,000 이하인 자연수
'''

def solution(sizes):
    answer = 0
    
    width = 0
    height = 0
    
    for size in sizes:
        w, h = size
        if width == 0 and height == 0:
            width = w
            height = h
        else:
            n1 = max(w, width) * max(h, height)
            n2 = max(h, width) * max(w, height)
            if n1 < n2:
                width = max(w, width)
                height = max(h, height)
            else:
                width = max(h, width)
                height = max(w, height)
        
    answer = width * height
    
    return answer 

sizes = [[60, 50], [30, 70], [60, 30], [80, 40]]
result = 4000
print(solution(sizes) == result)

sizes = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
result = 120
print(solution(sizes) == result)