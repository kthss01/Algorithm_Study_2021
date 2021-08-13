# {x}
'''
    {x} 만큼 반복되는거
    \w{4} 글자 4개
    
    S
    S 45글자
    첫 40글자 소문자,대문자, or 숫자 짝수
    마지막 5글자 홀수 or 공백
'''

Regex_Pattern = r'^[a-zA-Z02468]{40}[13579\s]{5}$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())