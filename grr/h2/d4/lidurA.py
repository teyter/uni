def BinarySearch(array[1...n], find):

    if (find == array[n/2]):
        return True

    if (find < array[n/2]):
        return BinarySearch(array[n/2...n])

    if(find > array[n/2]):
        return BinarySearch(array[n...n/2])

    return False

def TernarySearch(array[1...n], find)

    if (find == array[n/3]):
        return True

    if (find < array[n/3]):
        return TernarySearch(array[1...n/3], find)

    if (find > array[n/3]):

        if (find == array[2n/3]): return True

        if (find < array[2n/3]):
            return TernarySearch(array[n/3...2n/3], find)

        if (find > array[2n/3]):
            return TernarySearch(array[2n/3...n], find)

    return False
