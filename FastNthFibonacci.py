def fib(n):
    if n == 0:
        return 0
    if n < 0:
        n = n * -1

        result = fastFibDoubling(n)
        negativeFibModifier = -1 ** (n + 1)
        result = result * negativeFibModifier
        return result

    return fastFibDoubling(n)


def fastFibDoubling(n):
    a = 0
    b = 1
    bit = highestBit(n)
    while bit != 0:
        d = a * ((b << 1) - a)
        e = (a * a) + (b * b)
        a = d
        b = e

        if n & bit != 0:
            c = a + b
            a = b
            b = c

        bit >>= 1

    return a


def highestBit(n):
    k = int(math.log(n, 2))
    return 1 << k
