#   Copyright (c) 2022 Patrick260
#   Distributed under the terms of the MIT License.

t, c, r = [int(i) for i in input().split()]

if t >= c / r:
    print("yes")
else:
    print("no")
