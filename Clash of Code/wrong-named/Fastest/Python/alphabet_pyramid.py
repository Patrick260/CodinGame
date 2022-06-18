#   Copyright (c) 2022 Patrick260
#   Distributed under the terms of the MIT License.

n = int(input())
alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

for i in range(n + 1):
    for b in range(i):
        if b != i - 1:
            print(alphabet[b], end="")
        else:
            print(alphabet[b])
