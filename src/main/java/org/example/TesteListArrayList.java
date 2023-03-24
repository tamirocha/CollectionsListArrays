package org.example;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");


        // Estrutura de um array comum, o array não cresce, é delimitado.
        Aluno[] array = new Aluno[4];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        array[3] = a4;


        // Estrutura de um Array-List, não foi declarado tamanho, pois cresce continuamente, será entregue na ordem que declaramos a lista

        List <Aluno>alunos = new ArrayList<Aluno>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);


        // Estrutura de um Array-List de uma lista genérica

        List <Aluno> x = new ArrayList <Aluno>();
        x.add(a1);
        x.add(a2);
        x.add(a3);
        x.add(a4);

        imprimirAlunos(alunos);

    }

    public static void imprimirAlunos(List<Aluno> alunos) {

        //Aluno a1 = alunos.get(0);  é a mesma coisa que o for abaixo
        //Aluno a2 = alunos.get(1);
        //alunos[0];                 no array comun

        for (Aluno a : alunos) {         //esse for está pegando um por um dos elementos da lista alunos e entrega na variável a
            System.out.println("Nome: " + a.getNome());
            System.out.println("Nome: " + a.getNome());

            /*Nome: João
            Nome: Maria
            Nome: José
            Nome: Pedro*/
        }

    }
}
