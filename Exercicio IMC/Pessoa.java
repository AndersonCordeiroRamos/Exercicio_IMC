public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public String sexo;

    Pessoa (){} 

    Pessoa (String n, int idade, double a, double p, String sexo) { 
        nome = n;
        altura = a;
        peso = p;
    }

    public double calcImc (){ 
        return peso / (altura*altura); 
    }

    public void imprimir () { 

        double imc = calcImc(); 

        System.out.println("Nome: " + nome);
        System.out.println("IMC: " + Math.round(imc));

        if (imc <= 18.5){
            System.out.println("Abaixo do peso normal\n");
        } else if ( imc <= 25){
            System.out.println("Peso Normal\n");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Acima do peso normal\n");
        } else {
            System.out.println("Obesidade\n");
        }
   }

 

}