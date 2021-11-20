'''
문제 설명
게임에서 몬스터를 잡아 경험치를 획득하려 합니다. 게임에는 다양한 몬스터가 있으며, 몬스터 별로 획득할 수 있는 경험치도 다양합니다. 이 중에서 1초당 가장 많은 경험치를 획득할 수 있는 몬스터를 잡으려 합니다.

본 문제에서는 플레이어의 [체력, 공격력, 방어력]과 각 몬스터의 [이름, 경험치, 체력, 공격력, 방어력]이 주어집니다.
게임을 진행하는 방식은 다음과 같습니다.

플레이어가 몬스터를 공격합니다. 몬스터의 체력이 (플레이어의 공격력 - 몬스터의 방어력) 만큼 감소합니다.
1-1. (플레이어의 공격력 - 몬스터의 방어력)이 0 이하인 경우 몬스터의 체력이 감소하지 않습니다.
몬스터의 체력이 0 이하가 되면 몬스터가 죽고, 전투가 종료됩니다.
몬스터가 플레이어를 공격합니다. 플레이어의 체력이 (몬스터의 공격력 - 플레이어의 방어력) 만큼 감소합니다.
3-1. (몬스터의 공격력 - 플레이어의 방어력)이 0 이하인 경우 플레이어의 체력이 감소하지 않습니다.
플레이어의 체력이 0 이하가 되면 플레이어가 죽고, 전투가 종료됩니다.
플레이어가 죽지 않았다면 몬스터로부터 받은 피해를 모두 회복합니다. 즉 처음 체력으로 돌아옵니다.
전투가 종료될 때까지 1 ~ 5를 반복하며, 몬스터를 잡으면 해당 몬스터가 주는 경험치를 획득합니다. 만약 전투가 영원히 종료되지 않거나, 플레이어가 먼저 죽는다면 해당 몬스터를 잡을 수 없다고 판단합니다.

플레이어가 몬스터를 한 번 공격하는데 1초가 걸리며, 몬스터가 플레이어를 공격하거나 플레이어가 회복 스킬을 사용하는데 걸리는 시간은 없다고 가정합니다. 또, 플레이어는 한 번에 한 마리의 몬스터 하고만 전투를 진행할 수 있습니다.

플레이어의 정보를 뜻하는 문자열 character, 몬스터들의 정보가 담긴 문자열 배열 monsters가 주어질 때, 1초당 가장 많은 경험치를 주는 몬스터의 이름을 return 하도록 solution 함수를 완성해주세요.

만약 1초당 가장 많은 경험치를 주는 몬스터가 여러 마리라면, 그중 한 마리를 잡았을 때 가장 많은 경험치를 주는 몬스터를 return 합니다. 주는 경험치도 같다면 monsters 배열에서 먼저 주어진(더 작은 인덱스를 가지는) 몬스터를 return 합니다.

제한사항
character은 "A B C"의 형태입니다.
    A는 플레이어의 체력입니다.
    1 ≤ A ≤ 100
    B는 플레이어의 공격력입니다.
    0 ≤ B ≤ 100
    C는 플레이어의 방어력입니다.
    0 ≤ C ≤ 100
1 ≤ monsters의 길이 ≤ 100
monsters의 원소는 "A B C D E"의 형태입니다.
    A는 몬스터의 이름을 뜻하며, 영어 대문자 혹은 소문자로만 이루어져 있습니다.
    1 ≤ A의 길이 ≤ 100
    B는 몬스터가 주는 경험치입니다.
    1 ≤ B ≤ 100
    C는 몬스터의 체력입니다.
    1 ≤ C ≤ 100
    D는 몬스터의 공격력입니다.
    0 ≤ D ≤ 100
    E는 몬스터의 방어력입니다.
    0 ≤ E ≤ 100
    몬스터의 이름은 대소문자를 구분합니다. (예를 들어 "Dragon" 과 "dRagoN"은 서로 다른 몬스터입니다).
    이름이 동일한 몬스터가 중복해서 들어있는 경우는 없습니다.
    정답이 빈 문자열인 경우는 없습니다.

체력 공격력 방어력

이름 경험치 체력 공격력 방어력

입출력 예
character	monsters	result
"10 5 2"	["Knight 3 10 10 3","Wizard 5 10 15 1","Beginner 1 1 15 1"]	"Beginner"
'''

'''

hp a d
10 5 2
10 10 3

countA 10 / (5 - 3) = 5
check 10 <= 10 - 3 이러면 count 0


'''

import math

def battle(attacker, defender):
    count = 0
    
    # print(attacker, defender)
    
    # while defender['hp'] >= 0 or attacker['hp'] >= 0:
    #     defender['hp'] -= attacker['attack'] - defender['defence']
    #     if defender['hp'] < 0:
    #         break
    #     count += 1
        
    #     attacker['hp'] -= defender['attack'] - attacker['defence']
    #     if attacker['hp'] < 0:
    #         count = 0
    #         break
        
        # print(attacker, defender)
    
    if attacker['attack'] - defender['defence'] <= 0:
        count = 0
    else:
        count = math.ceil(defender['hp'] / (attacker['attack'] - defender['defence']))
    
    if count != 1 and attacker['hp'] <= defender['attack'] - attacker['defence']:
        count = 0
        
    # print(count)
        
    return count

def solution(character, monsters):
    answer = ''
    
    stat = list(map(int, character.split(' ')))
    
    attacker = {
        'hp': stat[0],
        'attack': stat[1],
        'defence': stat[2],
    }
    
    stats = []
    
    for i in range(len(monsters)):
        monster = monsters[i]
        # print(monster)
        stat = monster.split(' ')
        # print(stat)
        defender = {
            'hp': int(stat[2]), 
            'attack': int(stat[3]),
            'defence': int(stat[4]),
        }   
        
        count = battle(attacker, defender)
        
        if count == 0:
            continue
        
        stats.append([int(stat[1])/count, int(stat[1]), -i, stat[0]])
       
    stats.sort(reverse=True)

    # print(stats)

    answer = stats[0][-1]    
    
    return answer

character = "10 5 2"
monsters = ["Knight 3 10 10 3","Wizard 5 10 15 1","Beginner 1 1 15 1"]
result = "Beginner"

print(solution(character, monsters))