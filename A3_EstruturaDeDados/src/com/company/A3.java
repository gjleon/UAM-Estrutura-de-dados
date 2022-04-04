package com.company;

import java.util.*;

public class A3 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Stack<Integer> pilhaNumeros = new Stack<>();
        Queue<Integer> filaNumeros = new LinkedList<>();

        //Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células
        for (int i = 1; i <= 5 ; i++){
            listaNumeros.add(i);
        }

        //Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista
        System.out.println("Número de elementos da lista " + listaNumeros.size());
        while (!listaNumeros.isEmpty()) {
            int a = listaNumeros.remove(0);
            System.out.printf("%d ", a);
            pilhaNumeros.push(a);
        }

        //Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células);
        System.out.println("\nNúmero de elementos da pilha: " + pilhaNumeros.size());
        while (!pilhaNumeros.isEmpty()) {
            int a = pilhaNumeros.pop();
            System.out.printf("%d ", a);
            filaNumeros.add(a);
        }

        System.out.println("\nNúmero de elementos da fila: " + filaNumeros.size());
        for(Integer a: filaNumeros){
            System.out.printf("%d ", a);
        }

        //Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista
        for (int i = 6; i <= 10; i++) {
            listaNumeros.add(i);
        }

        //Passo 5: Repita os passos 2 e 3
        System.out.println("\nTamanho da lista " + listaNumeros.size());
        while(!listaNumeros.isEmpty()){
            int a = listaNumeros.remove(0);
            System.out.printf("%d ", a);
            pilhaNumeros.push(a);
        }

        System.out.println("\nNúmero de elementos da pilha: " + pilhaNumeros.size());
        while(!pilhaNumeros.isEmpty()) {
            int a = pilhaNumeros.pop();
            System.out.printf("%d ", a);
            filaNumeros.add(a);
        }

        //Passo 6: Exiba todos os números que foram inseridos na fila
        System.out.println("\nNúmero de elementos da fila: " + filaNumeros.size());
        for(Integer a : filaNumeros){
            System.out.printf("%d ", a);
        }
    }
}

