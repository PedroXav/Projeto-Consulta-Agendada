import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade;
    private String nomeMedico;

    public ConsultaAgendada(){

        setData();
        setHora();
        setNomePaciente();
        setNomeMedico();
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int me, int a, String p, String m){
         hora.setHor(h); 
         hora.setMin(mi);
         hora.setSeg(s);
         data.setDia(d);
         data.setMes(me);
         data.setAno(a);
         setNomePaciente(p);
         setNomeMedico(m);
         
        
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m){
        setData();
    }

    public void setData(int a, int b, int c){
        data.setDia(a);
        data.setMes(b);
        data.setAno(c);
    }

    public void setData(){

        System.out.println("Por favor, digite uma data:");
        data.setDia();
        data.setMes();
        data.setAno();
    }

    public void setHora(int a, int b, int c){
        
    }

    public void setHora(){

        System.out.println("Por favor, digite uma hora:");
        hora.setHor();
        hora.setMin();
        hora.setSeg();
    }

    public void setNomePaciente(String p){
        this.nomePaciente = p;

    }

    public void setNomePaciente(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do paciente:");
        String paciente = ler.nextLine();

        

    }

    public void setNomeMedico(String m){
        this.nomeMedico = m;
    }

    public void setNomeMedico(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do médico:");
        String medico = ler.nextLine();
    }

    public String getAmostra(){

    }

    public String getData(){

    }

    public String getHora(){

    }

    public String getNomePaciente(){

    }

    public String getNomeMedico(){

    }


    
}
