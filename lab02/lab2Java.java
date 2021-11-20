import java.util.*;

public class lab2Java{
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        boolean saida = false;

        while(saida == false){
            List<String> cartas = new ArrayList<>();

            List<String> cartasDeTroca = new ArrayList<String>();

            String quantidadeCartas = teclado.nextLine(); //Inserir quantidade de cartas de Alice e Betty
            String[] splitString = quantidadeCartas.split(" ");

            String alice = splitString[0];
            String betty = splitString[1];

            if (betty.equals("0") && alice.equals("0")){
                saida = true;
                break;
            }

            String cartasAlice = teclado.nextLine(); //Inserir as cartas de Alice
            ArrayList<String> cartasAlice2 = new ArrayList<>(Arrays.asList(cartasAlice.split(" ")));
            String cartasBetty = teclado.nextLine(); //Inserir as cartas de Betty
            ArrayList<String> cartasBetty2 = new ArrayList<>(Arrays.asList(cartasBetty.split(" ")));

            for(int i = 0; i < cartasAlice2.size(); i++){
                for(int j = 0; j < cartasAlice2.size(); j++){
                    if(j != i){
                        if(cartasAlice2.get(i).equals(cartasAlice2.get(j)) ){
                            cartasAlice2.remove(j);
                        }
                    }
                }
            }
            for(int i = 0; i < cartasBetty2.size(); i++){
                for(int j = 0; j < cartasBetty2.size(); j++){
                    if(j != i){
                        if(cartasBetty2.get(i).equals(cartasBetty2.get(j))){
                            cartasBetty2.remove(j);
                        }
                    }
                }
            }

            //CartasAlice2 = maior quantidade de cartas e Cartas = menor quantidade de cartas
            cartas = cartasBetty2;
            if(cartasAlice2.size() < cartasBetty2.size()){
                cartas = cartasAlice2;
                cartasAlice2 = cartasBetty2;
            }

            for(int i = 0; i < cartas.size(); i++){
                for(int j = 0; j < cartasAlice2.size(); j++) {
                    if(cartas.get(i).equals(cartasAlice2.get(j))){
                        break;
                    }else if(j == cartas.size() - 1){
                        String carta = cartas.get(i);
                        cartasDeTroca.add(carta);
                        break;
                    }
                }
            }
            System.out.println(cartasDeTroca.size());
        }
    }
}
