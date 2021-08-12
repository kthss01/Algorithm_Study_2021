# [a-z] [A-Z] [0-9]
'''
    [a-z] a ~ z
    
    문제
    5 글자 이상
    1 자 : 영어 소문자 알파벳
    2 자 : 숫자 양의 정수 0 제외
    3 자 : 영어 소문자 알파벳 아닌
    4 자 : 영어 대문자 알파벳 아닌
    5 자 : 대문자 알파벳
'''

Regex_Pattern = r'^[a-z][1-9][^a-z][^A-Z][A-Z].*'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())