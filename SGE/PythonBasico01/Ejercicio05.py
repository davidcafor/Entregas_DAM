'''
Exercicio 05 (listas)

Escribir un programa que almacene as materias dun curso
(por exemplo Matemáticas, Física, Química, Historia e Lingua)
nunha lista, pregunte ao usuario a nota que sacou en cada materia,
e despois móstreas por pantalla coa mensaxe En <asignatura> sacaches
<nota> onde <asignatura>  é cada unha das materias da lista e
cada unha das correspondentes notas introducidas polo usuario.
'''

asignaturas = ["Matemáticas", "Física", "Química", "Historia", "Lingua"]

notas = []

for i in range(len(asignaturas)):
    
    nota = float(input(f'Indica que nota sacaste en {asigaturas[i]}\n'))

    while(nota<0.0 or nota>10.0):
        nota = float(input(f'Indica que nota sacaste en {asignaturas[i]}\n'))
        print('La nota debe estar entre 0 y 10')
    
    notas.append(nota) 

for i in range(len(asignaturas)):
    print(f'En {asignaturas[i]} has sacado un {notas[i]}')