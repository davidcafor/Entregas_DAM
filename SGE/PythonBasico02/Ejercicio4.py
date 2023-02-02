'''
Exercicio 04 
Escribir un programa que almacene o abecedario nunha lista,
elimine da lista as letras que ocupen posicións múltiplos de 3,
mostre por pantalla a lista resultante, e o garde nun ficheiro
chamado multiplos.txt
'''

abecedario = ["a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "ñ" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z"]
abecedarioCopy = abecedario.copy()

for i in range(0 , len(abecedario)):
    if(i % 3 == 0):
        print(abecedario[i])
        abecedarioCopy.remove(abecedario[i])

abecedario = abecedarioCopy.copy()
        
        
print(abecedario)