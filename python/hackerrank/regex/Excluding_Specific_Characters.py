# [^]
'''
    [^] 제외 시키는거
    
    [^aeiou] 모음 빼고
'''

Regex_Pattern = r'^[^\d][^aeiou][^bcDF][^\s][^AEIOU][^.,]$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())