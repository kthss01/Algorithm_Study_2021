'''
전력망을 둘로 나누기

n개의 송전탑이 전선을 통해 하나의 트리 형태로 연결되어 있음
당신은 이 전선들 중 하나를 끊어서 현재의 전력망 네트워크를 2개로 분할하려고 함
이 때, 두 전력망이 갖게 되는 송전탑의 개수를 최대한 비슷하게 맞추고자 함

송전탑의 개수 n, 그리고 전선 정보 wires가 매개변수로 주어짐
전선들 중 하나를 끊어서 송전탑 개수가 가능한 비슷하도록 
두 전력망으로 나누었을 때, 두 전력망이 가지고 있는 
송전탑 개수의 차이(절대값)을 return 하는 함수 구현

제한 사항
n은 2 이상 100 이하인 자연수
wires는 길이가 n-1인 정수형 2차원 배열
    wires의 각 원소는 [v1, v2] 2개의 자연수
    이는 전력망의 v1번 송전탑과 v2번 송전탑이 전선으로 연결되어 있다는 것을 의미
    1 <= v1 < v2 <= n
    전력망 네트워크가 하나의 트리 형태가 아닌 경우는 입력으로 주어지지 않음
'''

def solution(n, wires):
    answer = -1
    return answer

n = 9
wires = [[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]
result = 3
print(solution(n, wires) == result)