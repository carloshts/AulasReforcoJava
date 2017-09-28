
package adedonha;

import java.util.Scanner;

public class Adedonha {
  
    public static void main(String[] args) {
        //Introdução do jogo
        System.out.println("Bem vindo ao adedonha");
        System.out.println("Nesse jogo você precisa dizer 5 palavras que \n comecem com a letra decidida e do tipo definido");
        
        //Jogador insere o nome
        System.out.println("Digite seu nome:");
        Scanner tec = new Scanner(System.in);
        String nome = tec.next();
        
        //Mensagem de boas vindas
        System.out.println("Bem vindo "+nome+"! \n Vamos começar!");
        
        //Pedindo comando do jogador
        System.out.println("Digite S para sortear a letra e C para cancelar e sair:");
        String comando = tec.next();
        
        //Comparando comando
        boolean sortear = (comando.equals("S"))?true : false;
        
        //Iniciando os pontos
        int pontos = 0;
        
        //Enquanto sortear for verdadeiro esse bloco será executado
        while(sortear){
            //Sorteia numero da letra 1 a 26
            int numeroDaLetra = (int)(Math.random() * 26)+1;
            
            //Variável que vai receber a letra correspondente ao numero
            String letra;
            
            //Casos de 1 a 26 que recebem a letra correspondente
            switch(numeroDaLetra){
                case 1:
                    letra = "A";
                    break;
                case 2:
                    letra = "B";
                    break;
                case 3:
                    letra = "C";
                    break;
                case 4:
                    letra = "D";
                    break;
                case 5:
                    letra = "E";
                    break;
                case 6:
                    letra = "F";
                    break;
                case 7:
                    letra = "G";
                    break;
                case 8:
                    letra = "H";
                    break;
                case 9:
                    letra = "I";
                    break;
                case 10:
                    letra = "J";
                    break;
                case 11:
                    letra = "K";
                    break;
                case 12:
                    letra = "L";
                    break;
                case 13:
                    letra = "M";
                    break;
                case 14:
                    letra = "N";
                    break;
                case 15:
                    letra = "O";
                    break;
                case 16:
                    letra = "P";
                    break;
                case 17:
                    letra = "Q";
                    break;
                case 18:
                    letra = "R";
                    break;
                case 19:
                    letra = "S";
                    break;
                case 20:
                    letra = "T";
                    break;
                case 21:
                    letra = "U";
                    break;
                case 22:
                    letra = "V";
                    break;
                case 23:
                    letra = "W";
                    break;
                case 24:
                    letra = "X";
                    break;
                case 25:
                    letra = "Y";
                    break;
                case 26:
                    letra = "Z";
                    break;
                //Caso por um bug saia um numero diferente
                default:
                    letra = "Não existe";
                    break;
            }
            //Número do tipo de palavra
            int numeroDoTipo = (int)(Math.random() * 4) + 1;
            //Variável que vai receber o tipo
            String tipo;
            
            //Estrutura de condição que se o tipo for 1 a palavra deve ser um Nome
            if(numeroDoTipo == 1) 
                tipo = "Nome";
            //Estrutura de condição que se o tipo for 2 a palavra deve ser um País
            else if(numeroDoTipo == 2)
                tipo = "País";
            //Estrutura de condição que se o tipo for 3 a palavra deve ser uma Fruta
            else if(numeroDoTipo == 3)
                tipo = "Fruta";
            //Estrutura de condição que se o tipo for qualquer numero diferente de 1,2 e 3 a palavra deve ser um Objeto
            else
                tipo = "Objeto";
            
            System.out.println("Escreva 5 palavras que representam um(a) "+tipo+" com a letra "+letra);
            
            //Estrutura de repetição determinada de 0 até 4, ou seja 5 posições
            for(int i = 0;i<5;i++){
                //Pedindo a palavra para o jogador
                System.out.println("Digite a "+(i+1)+" palavra:");
                String palavra = tec.next();
                //Pegando a primeira letra maiuscula da palavra
                char primeiraLetra = palavra.toUpperCase().charAt(0);
                //Comparando se é igual a letra sorteada
                if(primeiraLetra==letra.charAt(0)){
                    //Aumentanto mais 1 ponto/ pontos = pontos + 1
                    pontos++;
                }
            }
            //Pedindo comando do jogador
            System.out.println("Digite S para sortear a letra e C para cancelar e sair:");
            comando = tec.nextLine();
            sortear = (comando.equals("S"))?true : false;
        }
        
        //Executa o bloco antes de ver a condição
        do{
            System.out.println("Você entrou no dominio de Dormamus. \n Diga o que quer ou ele te mata!");
            System.out.println("O que você quer?");
            comando = tec.nextLine();
        //Enquanto o jogador não diz o que queremos ouvir o comando será executado    
        }while(!comando.equalsIgnoreCase("Eu vim barganhar"));
        //Dormamus deixa o jogador em paz
        System.out.println("Dormamus aceitou sua barganha!E");
        
        //Exibe os pontos do jogador
        System.out.println(nome+" você fez "+pontos+" pontos!");
    }
    
    
}
