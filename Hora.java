import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    static Scanner input = new Scanner(System.in);

    public Hora() {
        this(0, 0, 0);

    }

    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);

    }

    public void setHor(int h) {
        if (h >= 0 && h <= 23) {
            hora = h;
        } else {
            throw new IllegalArgumentException("Hora inválida.");
        }

    }

    public void setMin(int m) {
        if (m >= 0 && m <= 59) {
            min = m;
        } else {
            throw new IllegalArgumentException("Minutos inválidos.");
        }

    }

    public void setSeg(int s) {
        if (s >= 0 && s <= 59) {
            seg = s;
        } else {
            throw new IllegalArgumentException("Segundos inválidos.");
        }

    }

    public void setHor() {
        while(true){
            try{
                System.out.println("Digite a hora:");
                int h = input.nextInt();

                if (h >= 0 && h <= 23) {
                    this.hora = h;

                    break;
                } 
                else {
                    System.out.println("Hora inválida. Por favor, insira um valor valido para hora.");
                }
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para o hora.");

                input.next();
            }

        }
        
    }

    public void setMin() {
        while(true){
            try{
                System.out.println("Digite os minutos:");
                int m = input.nextInt();

                if (m >= 0 && m <= 59) {
                    this.min = m;

                    break;
                } 
                else {
                    System.out.println("Minutos inválidos. Por favor, insira um valor valido para os minutos.");
                }
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para os minutos.");

                input.next();
            }

        }
   
    }

    public void setSeg() {
        while(true){
            try{
                System.out.println("Digite os segundos:");
                int s = input.nextInt();

                if (s >= 0 && s <= 59) {
                    this.seg = s;

                    break;
                } 
                else {
                    System.out.println("Segundos inválidos. Por favor, insira um valor valido para os segundos.");
                }
            }
            catch (InputMismatchException msg) {
                System.out.println("O valor digitado é inesperado. Por favor, insira um número válido para os segundos.");

                input.next();
            }

        }
 
    }

    public int getHor() {
        return hora;

    }

    public int getMin() {
        return min;

    }

    public int getSeg() {
        return seg;

    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);

    }

    public String getHora2() {
        String periodo = (hora < 12) ? "AM" : "PM";
        int horaFormato12 = (hora > 12) ? hora - 12 : hora;
        return String.format("%02d:%02d:%02d %s", horaFormato12, min, seg, periodo);

    }

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;

    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        System.out.println("Hora 1: " + hora1.getHora1());
        System.out.println("Hora 2: " + hora1.getHora2());
        System.out.println("Segundos em Hora 1: " + hora1.getSegundos());

    }

}