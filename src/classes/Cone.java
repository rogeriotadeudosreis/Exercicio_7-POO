
package classes;

public class Cone {
    
    private float raio = 0;
    private float altura = 0;
    private double pi = 3.1415;
    
    public float getRaio() {
        return raio;
    }

    
    public void setRaio(float raio) {
        this.raio = raio;
    }

    
    public float getAltura() {
        return altura;
    }

    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calculaGeratriz(){
        float valor = altura * altura + raio * raio;
        return (float)(Math.sqrt(valor));        
    }
    public float calculaAreaLateral(){
        return (float)(pi * raio * calculaGeratriz());
    }
    public float calculaAreaTotal(){
        return (float)(pi * raio * (calculaGeratriz() + raio));
    }
    public float calculaVolune(){
        return (float)(1.0/3.0 * pi * raio * raio * altura);
    }
            
}
