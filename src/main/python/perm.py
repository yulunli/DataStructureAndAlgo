import copy

def perm(obj_list):
    result = [[obj_list[0]]]
    for insert_element in obj_list[1:]:
        right_to_left = True
        tempResult = []
        for to_add in result:
            if right_to_left:
                for i in reversed(range(len(to_add) + 1)):
                    temp_to_add = to_add[:]
                    temp_to_add.insert(i, insert_element)
                    tempResult.append(temp_to_add)
                right_to_left = False
            else:
                for i in range(len(to_add) + 1):
                    temp_to_add = to_add[:]
                    temp_to_add.insert(i, insert_element)
                    tempResult.append(temp_to_add)
                right_to_left = True
        result = copy.deepcopy(tempResult)
    return result

print(len(perm([1, 2, 3, 4])))
