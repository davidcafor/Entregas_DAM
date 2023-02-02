'''
Exercicio 01

Escribir unha función que pida un número enteiro entre 1 e 10 e garde
nun ficheiro co nome táboa-n.txt a táboa de multiplicar dese número,
donde n é o número introducido.
'''

num = int(input("Indica un numero entero del 1 al 10\n"))
ruta = "tabla-" + str(num) + ".txt"

fichero = open(ruta, 'w')

for i in range(1, 11):
    fichero.write(str(i) + 'x' + str(num) + '=' + str(i*num))
    fichero.write('\n')
    
