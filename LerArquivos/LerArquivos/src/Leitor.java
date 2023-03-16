import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) throws FileNotFoundException{
        
        String path = "C:\\Java VSCODE\\LerArquivos\\LerArquivos\\LER _ARQUIVO.txt";
        File arquivo = new File(path);

        Scanner scanner = new Scanner(arquivo);

        /*while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            for(int x = 0; x < linha.length(); x++){
                System.out.println(linha.charAt(x));
            }
        }*/

        /*while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            System.out.println(linha);
        }*/


        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            String[] vetor = linha.split(" ");
            // divide em partes quando encontrar uma letra, nesse caso é o espaço, e como quero imprimir o primeiro nome, irei imprimir a primeira posição do vetor, ex:
            // GATO DE BOTAS
            // vetor[0] = "GATO", vetor[1] = "DE", vetor[2] = "BOTAS"
            System.out.println(vetor[0]);
        }


        scanner.close();

    }
}
