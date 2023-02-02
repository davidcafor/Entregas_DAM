'''
Exercicio 02 
Escribir unha función que pida dous números `n` e `m` entre 1 e 10,
lea o ficheiro `táboa-n.txt` coa táboa de multiplicar dese número,
e mostre por pantalla a liña `m` do ficheiro. Se o ficheiro non
existe debe mostrar unha mensaxe por pantalla informando diso.
'''

n = int(input("Indica un numero entre 1 y 10\n"))
m = int(input("Indica otro numero entre 1 y 10\n"))
contador = 0

ruta = "tabla-" + str(n) + ".txt" #buscamos el fichero con parametro n

fichero = open(ruta, 'r')

for linea in fichero:
    contador += 1
    if(contador==m):
        print(linea, end='') #imprime la linea especificada con parametro m