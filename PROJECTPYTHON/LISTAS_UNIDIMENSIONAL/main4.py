import os

if __name__ == "__main__":
    os.system('cls')
    vector = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    vpar = []
    vimpar = []
    for e in vector:
        if e % 2 == 0:
           vpar.append(e)
        else:
           vimpar.append(e)
    print("Lista Original: ", vector) # [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print("Lista Par     : ", vpar)   # [2, 4, 6, 8]
    print("Lista Impar   : ", vimpar) # [1, 3, 5, 7, 9]
           
