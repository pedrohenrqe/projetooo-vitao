package br.senai.sp.jandira;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    listTarefa listTarefa = new listTarefa();

    public void Menu(){

        boolean continuar = true;

        while (continuar){
            System.out.println("****************************************");
            System.out.println("********* Bem vindo(a) ao menu *********");
            System.out.println("****************************************");
            System.out.println("");
            System.out.println("Escolha uma opção~: ");
            System.out.println("[1- Criar tarefa 2 - Listar tarefas 3 - Atualizar tarefas]");

            int userOption = teclado.nextInt();
            System.out.println("");

            switch (userOption) {

                case 1:
                    listTarefa.teste();
                    break;

            }


        }


    }




}