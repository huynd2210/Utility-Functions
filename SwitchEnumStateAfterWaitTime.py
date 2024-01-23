#Given an input list containing enums, write a function that switch the state of a given enum at a certain index after a certain number of wait time (in seconds)
#using a certain function for switching enum states. The timer must be simultaneous/concurrent.

import enum
import threading
import time

class MyEnum(enum.Enum):
    STATE0 = 0
    STATE1 = 1
    STATE2 = 2
    STATE3 = 3

def testEnumSwitch(inputEnum):
    initialState = inputEnum
    inputEnum = MyEnum.STATE3
    print(f"Switched state for {inputEnum.name} from {initialState.name} to {inputEnum.name}")


def switchStatesWithTimer(inputList, index, waitTime, enumSwitchFunction):
    delayedInvokeLambda = lambda func: (lambda *args, **kwargs: (time.sleep(waitTime), func(*args, **kwargs)))
    # delayedInvokeLambda(testEnumSwitch)(inputList[index])
    thread = threading.Thread(target=delayedInvokeLambda(enumSwitchFunction), args=(inputList[index],))
    thread.start()


if __name__ == '__main__':
    testInputList = [MyEnum.STATE1, MyEnum.STATE0, MyEnum.STATE2]
    switchStatesWithTimer(testInputList, 2, 3, testEnumSwitch)
    switchStatesWithTimer(testInputList, 1, 1, testEnumSwitch)
