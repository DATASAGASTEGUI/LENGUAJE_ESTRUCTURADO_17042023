import os

if __name__ == "__main__":
    os.system('cls')
    vector = [2, 1, 2, 3, 7, 4, 4, 9, 2, 3, 1, 5, 6, 7]
    rvector = []
    for e in vector:
        if e not in rvector:
           rvector.append(e)
    print('Lista Original : ', vector)  # [2, 1, 2, 3, 7, 4, 4, 9, 2, 3, 1, 5, 6, 7]
    print('Lista Resultado: ', rvector) #  [2, 1, 3, 7, 4, 9, 5, 6]
           
