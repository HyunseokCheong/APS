import math
import sys

A, B, V = map(int, sys.stdin.read().split())
day = (V - B) / (A - B)
print(math.ceil(day))