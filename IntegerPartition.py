def addToResult(result, partitionArray):
    tmp = [i for i in partitionArray if i != 0]
    result.append(tmp)


def integerPartition(n):
    result = []
    partitionArray = [0] * n
    lastElementIndex = 0
    partitionArray[lastElementIndex] = n  # Initialize first partition
    while True:
        addToResult(result, partitionArray)
        remainingValue = 0
        while lastElementIndex >= 0 and partitionArray[lastElementIndex] == 1:
            remainingValue += partitionArray[lastElementIndex]
            lastElementIndex -= 1
        if lastElementIndex < 0:
            return result

        partitionArray[lastElementIndex] -= 1
        remainingValue += 1
        while remainingValue > partitionArray[lastElementIndex]:
            partitionArray[lastElementIndex + 1] = partitionArray[lastElementIndex]
            remainingValue -= partitionArray[lastElementIndex]
            lastElementIndex += 1

        partitionArray[lastElementIndex + 1] = remainingValue
        lastElementIndex += 1
